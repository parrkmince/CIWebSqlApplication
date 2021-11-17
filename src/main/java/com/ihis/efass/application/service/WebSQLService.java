package com.ihis.efass.application.service;

import com.ihis.efass.application.mapping.QueryBuilder;
import com.ihis.efass.application.repository.WebSQLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WebSQLService {
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

    public Map<String,String> getFieldColumnMapping(String tableName) throws ClassNotFoundException {
        Class<?> cls = Class.forName(QueryBuilder.getTableNames().get(tableName).toString());
        Map<String,String> fieldColumnMap = new HashMap<>();
        for(Field field : cls.getClass().getDeclaredFields()){
            fieldColumnMap.put(field.getName(), field.getAnnotation(Column.class).name());
        }
        return fieldColumnMap;
    }
}
