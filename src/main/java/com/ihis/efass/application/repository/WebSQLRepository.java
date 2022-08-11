package com.ihis.efass.application.repository;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

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

    public List<Object> insertQuery(String query){
        LOGGER.info("Executing insert query : {}", query);
        Query result = entityManager.createNativeQuery(query);
        return result.getResultList();
    }

    public Integer modifyQuery(String query){
        LOGGER.info("Executing update query : {}", query);
        Integer status = 0;
        if(StringUtils.containsIgnoreCase(query,"delete") || StringUtils.containsIgnoreCase(query,"update") || StringUtils.containsIgnoreCase(query,"INSERT")){
            Query result = entityManager.createNativeQuery(query);
            status = result.executeUpdate();
        }
        return status;
    }
}
