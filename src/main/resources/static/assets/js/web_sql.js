"use strict";

(function($, win) {

    var CI_WebSQL = {
        init: function() {
            $('#multiselect').multiselect();

            this.loadDBTables();
            this.eventHandler();
        },
        eventHandler: function(){
            $("#ci_manual_query_reset").on("click",this.manualQueryReset);
            $("#ci_quick_view_reset").on("click",this.quickViewReset);
            $("#ci_tables_dropdown").change(this.onSelectDBTable);
        },
        onSelectDBTable: function() {
            var selectedTable = $(this).val();

            $.ajax({
                url: "http://localhost:9092/ref/quickview/fieldcolmap",
                type:"POST",
                dataType:"json",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify({ tableName: selectedTable }),
                success: function(response) {
                    console.log(response);
                },
                beforeSend: function() {
                }
            });
        },
        loadDBTables:function() {
            $.ajax({
                url: "http://localhost:9092/ref/quickview/tablemap",
                type:"POST",
                dataType:"json",
                data: {},
                success: function(response) {

                    if(response.tableMap != ""){
                        $.each(response.tableMap, function(key, value){
                            $("#ci_tables_dropdown").append($("<option>").text(key));
                        });
                    }
                },
                beforeSend: function() {
                }
            });
        },
        quickViewReset: function() {
            $("#ci_server_dropdown").val("");
            $("#ci_tables_dropdown").val("");
            $("#multiselect").val("");
            $("#multiselect_to").val("");
        },
        manualQueryReset: function() {
            $("#ci_manual_query_script").val("");
            $("#ci_manual_query_response").val("");
        },
    };

    $(function () {
       CI_WebSQL.init();
    });

})(jQuery, window);