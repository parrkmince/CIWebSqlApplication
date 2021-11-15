package com.ihis.efass.application.repository;

import com.ihis.efass.application.controllers.WebSQLRestController;
import com.ihis.efass.application.pojos.EFASSPropsConfig;
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
}
