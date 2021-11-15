package com.ihis.efass.application.controllers;

import com.ihis.efass.application.service.WebSQLService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebSQLRestController {

    Logger LOGGER = LoggerFactory.getLogger(WebSQLRestController.class);

    @Autowired
    private WebSQLService webSQLService;

    @RequestMapping("/sql/{tableName}")
    ResponseEntity<List<Object>> selectTable(@PathVariable String tableName) {
        List<Object> object = webSQLService.select(tableName);
        LOGGER.info("LOGGING Result from DB : {}", object);
        return new ResponseEntity<>(object, HttpStatus.OK);
    }
}
