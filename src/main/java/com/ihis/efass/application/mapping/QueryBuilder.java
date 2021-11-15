package com.ihis.efass.application.mapping;

import com.ihis.efass.application.controllers.WebSQLRestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.HashMap;

@Configuration
@ImportResource("classpath:beans.xml")
public class QueryBuilder {

    private final static Logger LOGGER = LoggerFactory.getLogger(WebSQLRestController.class);

    private static final String SELECT = "FROM ";

    @Autowired
    private static HashMap tableNames;

    public static HashMap getTableNames() {
        return tableNames;
    }

    public static void setTableNames(HashMap tableNames) {
        QueryBuilder.tableNames = tableNames;
    }

    public static String selectTable(String tableName){
        LOGGER.info("tableMap content : {}", getTableNames());
        StringBuilder sb = new StringBuilder();
        return sb.append(SELECT).append(getTableNames().get(tableName)).toString();
    }
}
