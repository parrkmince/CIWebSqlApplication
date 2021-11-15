package com.ihis.efass.application.service;

import com.ihis.efass.application.mapping.QueryBuilder;
import com.ihis.efass.application.repository.WebSQLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebSQLService {
    @Autowired
    private WebSQLRepository webSQLRepository;



    public List<Object> select(String tableName){
       List<Object> result = webSQLRepository.select(QueryBuilder.selectTable(tableName));
       return result;
    }
}
