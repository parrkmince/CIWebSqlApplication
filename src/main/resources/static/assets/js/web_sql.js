"use strict";

(function($, win) {

    var CI_WebSQL = {
        init: function() {
            $('#multiselect').multiselect({enableSelectionOrder: true});
            this.onLoadDBTables();
            this.eventHandler();
        },
        eventHandler: function(){
            $("#ci_manual_query_reset").on("click",this.manualQueryReset);
            $("#ci_manual_query_execute").on("click",this.manualQueryExecute);
            $("#ci_quick_view_execute").on("click",this.quickViewExecute);
            $("#ci_quick_view_reset").on("click",this.quickViewReset);
            $("#ci_tables_dropdown").change(this.onSelectDBTable);

            $("#ci_query_action_dropdown").change(function() {
                if($(this).val()) {
                   $("#ci_manual_query_script").attr("disabled", false);
                }
            });

            $(".multiselect_btn").on("click", function () {
                $("#ci_query_condition").attr("disabled", false);
            });

            $("#ci_query_condition").bind("input propertychange", function () {
                var toggle = $(this).val() != "" ? false : true;
                $("#ci_quick_view_execute").attr("disabled", toggle);
            });

            $("#ci_manual_query_script").bind("input propertychange", function () {
                var toggle = $(this).val() != "" ? false : true;
                $("#ci_manual_query_execute").attr("disabled", toggle);
            });

            $('.move_option').click(function(){
                var $op = $('#multiselect_to option:selected'),
                    $this = $(this);
                if($op.length){
                    ($this.attr('id') == 'select_up') ?
                        $op.first().prev().before($op) :
                        $op.last().next().after($op);
                }
            });
        },
        quickViewExecute: function() {
            var btn = $(this);
            btn.attr("disabled", true);
            btn.html('<span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span> Executing...');

            $(".table").empty();
            var data = {
                tableName: $.trim($("#ci_tables_dropdown").val()),
                condition: $.trim($("#ci_query_condition").val()),
                selectedColumns: {}
            }

            var selectedObj = {};
            $('#multiselect_to :selected').each(function(){
                selectedObj[$(this).val()] = $(this).text();
            });

            data.selectedColumns = selectedObj;

            $.ajax({
                url: "/sql/quickview/select",
                type:"POST",
                dataType:"json",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(data),
                success: function(response) {

                    if(response.result != "") {
                        var getColumns = Object.keys(response.result[0]);
                        var table = $("#ci_quick_view_table_result");
                        var $thead = $('<thead class="table-dark">');
                        var $tbody =  $("<tbody>");
                        var $theadTR = $("<tr>");
                        $.each(getColumns, function(key, value){
                           $theadTR.append($("<th>").text(value));
                        });

                        $.each(response.result, function(key, obj){
                           var tr = $("<tr>");
                            $.each(obj, function(key, value) {
                                 tr.append($("<td>").text(value));
                            });

                            $tbody.append(tr);
                        });

                        $thead.append($theadTR);
                        table.append($thead);
                        table.append($tbody);
                        btn.attr("disabled", false);
                        btn.html('Execute');
                    }
                    else {
                        $("#ci_quick_view_result_msg").removeClass("d-none");
                        btn.html('Execute');
                    }
                },
                beforeSend: function() {
                },
                error: function(xhr) {
                    btn.html('Execute');
                }
            });
        },
        onSelectDBTable: function() {
            var selectedTable = $(this).val();
            $("#multiselect").empty();
            $("#multiselect_to").empty();
            $.ajax({
                url: "/ref/quickview/fieldcolmap",
                type:"POST",
                dataType:"json",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify({ tableName: selectedTable }),
                success: function(response) {
                    if(response.fieldColumnMap != ""){
                         $("#multiselect").attr("disabled", false);
                         $("#multiselect_to").attr("disabled", false);
                         $(".multiselect_btn").attr("disabled", false);

                        $.each(response.fieldColumnMap, function(key, value){
                            var option = $("<option>");
                            option.val(key);
                            option.text(value)
                            $("#multiselect").append(option);
                        });
                    }
                },
                beforeSend: function() {
                }
            });
        },
        onLoadDBTables:function() {
            $.ajax({
                url: "/ref/quickview/tablemap",
                type:"POST",
                dataType:"json",
                data: {},
                success: function(response) {
                    if(response.tableMap != ""){
                        $("#ci_tables_dropdown").attr("disabled", false);
                        $.each(response.tableMap, function(key, value){
                            $("#ci_tables_dropdown").append($("<option>").text(key));
                        });
                    }
                },
                beforeSend: function() {
                }
            });
        },
        manualQueryExecute: function() {
            var ajaxURL = $("#ci_query_action_dropdown").val() == "INSERT" ? "/sql/manual/modify" : "/sql/manual/modify";
            var data = {
                manualQuery: $.trim($("#ci_manual_query_script").val())
            }

            $.ajax({
                url: ajaxURL,
                type:"POST",
                dataType:"json",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(data),
                success: function(response) {
                    if(response != "") {
                        var JSONText = JSON.stringify(response, undefined, 4);
                        $("#ci_manual_query_response").val(JSONText);
                    }
                },
                beforeSend: function() {
                },
                error: function(xhr) {
                    var JSONText = JSON.stringify(xhr, undefined, 4);
                    $("#ci_manual_query_response").val(JSONText);
                }
            });
        },
        quickViewReset: function() {
            $("#ci_tables_dropdown").selectedIndex = 0;
            $("#multiselect").empty();
            $("#multiselect_to").empty();
            $("#multiselect").attr("disabled", true);
            $("#multiselect_to").attr("disabled", true);
            $(".multiselect_btn").attr("disabled", true);
        },
        manualQueryReset: function() {
            $("#ci_query_action_dropdown").selectedIndex = 0;
            $("#ci_manual_query_script").val("");
            $("#ci_manual_query_response").val("");
        },
    };

    $(function () {
       CI_WebSQL.init();
    });

})(jQuery, window);