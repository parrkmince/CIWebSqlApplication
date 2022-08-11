package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "EFASS_SERVICE_AUDIT")
public class EfassServiceAudit implements Serializable {
    public EfassServiceAudit() {
    }

    public EfassServiceAudit(BigInteger id, String messageId, String transactionId, String type, String processStat, String errorType, Date insertTimestamp, Date updateTimestamp, String serviceResponse) {
        this.id = id;
        this.messageId = messageId;
        this.transactionId = transactionId;
        this.type = type;
        this.processStat = processStat;
        this.errorType = errorType;
        this.insertTimestamp = insertTimestamp;
        this.updateTimestamp = updateTimestamp;
        this.serviceResponse = serviceResponse;
    }

    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Column(name = "MESSAGE_ID")
    private String messageId;
    @Column(name = "TRANSACTION_ID")
    private String transactionId;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "PROCESS_STAT")
    private String processStat;
    @Column(name = "ERROR_TYPE")
    private String errorType;
    @Column(name = "INSERT_TIMESTAMP")
    private Date insertTimestamp;
    @Column(name = "UPDATE_TIMESTAMP")
    private Date updateTimestamp;
    @Column(name = "SERVICE_RESPONSE")
    private String  serviceResponse;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProcessStat() {
        return processStat;
    }

    public void setProcessStat(String processStat) {
        this.processStat = processStat;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public Date getInsertTimestamp() {
        return insertTimestamp;
    }

    public void setInsertTimestamp(Date insertTimestamp) {
        this.insertTimestamp = insertTimestamp;
    }

    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public String getServiceResponse() {
        return serviceResponse;
    }

    public void setServiceResponse(String serviceResponse) {
        this.serviceResponse = serviceResponse;
    }
}
