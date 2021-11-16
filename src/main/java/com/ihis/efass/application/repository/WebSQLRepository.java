package com.ihis.efass.application.repository;

import com.ihis.efass.application.controllers.WebSQLRestController;
import com.ihis.efass.application.mapping.QueryBuilder;
import com.ihis.efass.application.pojos.EFASSPropsConfig;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public class WebSQLRepository {

    Logger LOGGER = LoggerFactory.getLogger(WebSQLRepository.class);

    @PersistenceContext
    private EntityManager entityManager;

    public List<Object> select(String queryString){
        LOGGER.info("SELECTING {}",queryString);
        Query query = entityManager.createQuery(queryString);
        return query.getResultList();
    }

    public List<Object> select(String queryString, Map<String,String> conditions){
        LOGGER.info("SELECTING {}",queryString);
        Query query = entityManager.createQuery(queryString);
        return query.getResultList();
    }

    public List<Object> inserQuery(String query){
        LOGGER.info("Executing insert query : {}", query);
        Query result = entityManager.createNativeQuery(query);
        return result.getResultList();
    }

    public Integer modifyQuery(String query){
        LOGGER.info("Executing update query : {}", query);
        Integer status = 0;
        if(StringUtils.containsIgnoreCase(query,"delete") || StringUtils.containsIgnoreCase(query,"update")){
            Query result = entityManager.createNativeQuery(query);
            status = result.executeUpdate();
        }
        return status;
    }
}
