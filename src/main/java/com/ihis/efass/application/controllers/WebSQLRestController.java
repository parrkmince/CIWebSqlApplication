package com.ihis.efass.application.controllers;

import com.ihis.efass.application.pojos.WebSQLRequest;
import com.ihis.efass.application.pojos.WebSQLResponse;
import com.ihis.efass.application.service.WebSQLService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class WebSQLRestController {

    Logger LOGGER = LoggerFactory.getLogger(WebSQLRestController.class);

    @Autowired
    private WebSQLService webSQLService;

    @RequestMapping("/sql/quickview/select")
    ResponseEntity<WebSQLResponse> selectTable(@RequestBody WebSQLRequest webSQLRequest) throws ClassNotFoundException {
        List<Object> object = (null != webSQLRequest.getSelectedColumns()) ? webSQLService.select(webSQLRequest.getTableName(), webSQLRequest.getCondition()) : webSQLService.selectWithColumns(webSQLRequest.getTableName(), webSQLRequest.getSelectedColumns(), webSQLRequest.getCondition());
        LOGGER.info("LOGGING Result from DB : {}", object);
        return new ResponseEntity<>(new WebSQLResponse(object), HttpStatus.OK);
    }

    @RequestMapping("/sql/manual/insert")
    ResponseEntity<WebSQLResponse> insertQuery(@RequestBody WebSQLRequest webSQLRequest) {
        List<Object> object = webSQLService.insertQuery(webSQLRequest.getManualQuery());
        LOGGER.info("LOGGING Result from DB : {}", object);
        return new ResponseEntity<>(new WebSQLResponse(object), HttpStatus.OK);
    }

    @RequestMapping("/sql/manual/modify")
    ResponseEntity<WebSQLResponse> modifyQuery(@RequestBody WebSQLRequest webSQLRequest) {
        Integer updatedDeleted = webSQLService.modifyQuery(webSQLRequest.getManualQuery());
        LOGGER.info("LOGGING Updated/Deleted Results from DB : {}", updatedDeleted);
        return new ResponseEntity<>(new WebSQLResponse(updatedDeleted), HttpStatus.OK);
    }

    @RequestMapping("/ref/quickview/map")
    ResponseEntity<WebSQLResponse> getTableMap(@RequestBody WebSQLRequest webSQLRequest) throws ClassNotFoundException {
        Map<String,String> fieldColumnMapping = webSQLService.getFieldColumnMapping(webSQLRequest.getTableName());
        LOGGER.info("Table field and column map : {}", fieldColumnMapping);
        return new ResponseEntity<>(new WebSQLResponse(fieldColumnMapping), HttpStatus.OK);
    }
}
