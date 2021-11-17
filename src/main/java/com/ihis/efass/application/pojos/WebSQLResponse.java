package com.ihis.efass.application.pojos;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class WebSQLResponse implements Serializable {

    private List<Object> result;

    private Integer updateDelete;

    private Map<String,String> tableMap;

    private Map<String,String> fieldColumnMap;

    public WebSQLResponse(List<Object> result, Integer updateDelete, Map<String, String> tableMap, Map<String, String> fieldColumnMap) {
        this.result = result;
        this.updateDelete = updateDelete;
        this.tableMap = tableMap;
        this.fieldColumnMap = fieldColumnMap;
    }

    public WebSQLResponse() {}

    public WebSQLResponse(Integer updateDelete) {
        this.updateDelete = updateDelete;
    }

    public WebSQLResponse(Map<String, String> fieldColumnMap) {
        this.fieldColumnMap = fieldColumnMap;
    }

    public WebSQLResponse(List<Object> result) {
        this.result = result;
    }

    public List<Object> getResult() {
        return result;
    }

    public void setResult(List<Object> result) {
        this.result = result;
    }

    public Integer getUpdateDelete() {
        return updateDelete;
    }

    public void setUpdateDelete(Integer updateDelete) {
        this.updateDelete = updateDelete;
    }

    public Map<String, String> getFieldColumnMap() {
        return fieldColumnMap;
    }

    public void setFieldColumnMap(Map<String, String> fieldColumnMap) {
        this.fieldColumnMap = fieldColumnMap;
    }

    public Map<String, String> getTableMap() {
        return tableMap;
    }

    public void setTableMap(Map<String, String> tableMap) {
        this.tableMap = tableMap;
    }

    @Override
    public String toString() {
        return "WebSQLResponse{" +
                "result=" + result +
                ", updateDelete=" + updateDelete +
                ", tableMap=" + tableMap +
                ", fieldColumnMap=" + fieldColumnMap +
                '}';
    }
}
