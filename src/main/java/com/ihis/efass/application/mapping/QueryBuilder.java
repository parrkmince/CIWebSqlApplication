package com.ihis.efass.application.mapping;

import com.ihis.efass.application.controllers.WebSQLRestController;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Configuration
@ImportResource("classpath:beans.xml")
public class QueryBuilder {

    private final static Logger LOGGER = LoggerFactory.getLogger(WebSQLRestController.class);

    private static final String SELECT = "SELECT new map(";

    private static final String FROM = " FROM ";

    private static final String WHERE = " WHERE ";

    @Autowired
    private static HashMap tableNames;

    private static Map<String,String> fieldColumnMapping;

    public static String buildQuery(String tableName, Map<String, String> columns, String condition, Map<String,String> fieldColumnMapping){

        LOGGER.info("columns : {}", columns);

        QueryBuilder.setFieldColumnMapping(fieldColumnMapping);

        LOGGER.info("tableMap content : {}", getTableNames());
        StringBuilder sb = new StringBuilder();
        if(CollectionUtils.isEmpty(columns)){
            LOGGER.info("Selecting all columns");
             sb.append(FROM).append(getTableNames().get(tableName));
        }else{
            List<String> aliasedColumn = new ArrayList<>();
            for(Map.Entry<String,String > map : columns.entrySet())
                aliasedColumn.add(map.getKey() + " as " + map.getKey());
            sb.append(SELECT).append(aliasedColumn.stream().collect(Collectors.joining(", "))).append(")").append(FROM).append(getTableNames().get(tableName));
        }

        if(StringUtils.isNotEmpty(condition)){
            sb.append(WHERE).append(remapValueToKey(condition));
        }

        return sb.toString();
    }

    public static String remapValueToKey(String condition){
        String result = condition;
        for(String value : fieldColumnMapping.values()){
            for(Map.Entry<String,String> entrySet : fieldColumnMapping.entrySet()){
                if(StringUtils.equalsIgnoreCase(value,entrySet.getValue()))
                    result.replace(value, entrySet.getKey());
            }
        }

        return result;
    }

    public static HashMap getTableNames() {
        return tableNames;
    }

    public static void setTableNames(HashMap tableNames) {
        QueryBuilder.tableNames = tableNames;
    }

    public static Map getFieldColumnMapping() {
        return fieldColumnMapping;
    }

    public static void setFieldColumnMapping(Map fieldColumnMapping) {
        QueryBuilder.fieldColumnMapping = fieldColumnMapping;
    }
}
