package com.ihis.efass.application.service;

import com.ihis.efass.application.controllers.WebSQLRestController;
import com.ihis.efass.application.mapping.QueryBuilder;
import com.ihis.efass.application.repository.WebSQLRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class WebSQLService {

    Logger LOGGER = LoggerFactory.getLogger(WebSQLRestController.class);

    @Autowired
    private WebSQLRepository webSQLRepository;

    public List<Object> select(String tableName, String conditions) throws ClassNotFoundException {
       List<Object> result = webSQLRepository.select(QueryBuilder.buildQuery(tableName, null, conditions, getFieldColumnMapping(tableName)));
       return result;
    }

    public List<Object> selectWithColumns(String tableName, Map<String, String> columns, String conditions) throws ClassNotFoundException {
        List<Object> result = webSQLRepository.select(QueryBuilder.buildQuery(tableName, columns, conditions, getFieldColumnMapping(tableName)));
        return result;
    }

    public List<Object> insertQuery(String query){
        return webSQLRepository.inserQuery(query);
    }

    public Integer modifyQuery(String query){
        return webSQLRepository.modifyQuery(query);
    }

    public Map<String,String> getTableMap() throws ClassNotFoundException {
        Set<Map.Entry<Object, Object>> entries = QueryBuilder.getTableNames().entrySet();

        LinkedHashMap<String, String> collect = entries.stream()
                //Map<String, String>
                .collect(Collectors.toMap(k -> (String) k.getKey(), e -> (String) e.getValue()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        return collect;
    }

    public Map<String,String> getFieldColumnMapping(String tableName) throws ClassNotFoundException {

        Map<String,String> fieldColumnMap = new HashMap<>();

        for(Field field : Class.forName(QueryBuilder.getTableNames().get(tableName).toString()).getDeclaredFields()){
            fieldColumnMap.put(field.getName(), field.getAnnotation(Column.class).name());
        }
        
        return fieldColumnMap;
    }
}
