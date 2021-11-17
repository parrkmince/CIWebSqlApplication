package com.ihis.efass.application.pojos;

import java.io.Serializable;
import java.util.Map;

public class WebSQLRequest implements Serializable {

    private String tableName;

    private Map<String, String> selectedColumns;

    private String condition;

    private String manualQuery;

    public WebSQLRequest() {
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Map<String, String> getSelectedColumns() {
        return selectedColumns;
    }

    public void setSelectedColumns(Map<String, String> selectedColumns) {
        this.selectedColumns = selectedColumns;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getManualQuery() {
        return manualQuery;
    }

    public void setManualQuery(String manualQuery) {
        this.manualQuery = manualQuery;
    }

    @Override
    public String toString() {
        return "WebSQLRequest{" +
                "tableName='" + tableName + '\'' +
                ", selectedColumns=" + selectedColumns +
                ", condition=" + condition +
                ", manualQuery='" + manualQuery + '\'' +
                '}';
    }
}
