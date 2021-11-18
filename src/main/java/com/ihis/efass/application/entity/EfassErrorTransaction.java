package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "EFASS_ERROR_TRANSACTION")
public class EfassErrorTransaction implements Serializable {

    @Id
    @Column(name = "TRANSACTION_REFERENCE_ID")
    private String transactionReferenceId;
    @Column(name = "SESSION_ID")
    private String sessionId;
    @Column(name = "TRANSACTION_TYPE")
    private String transactionType;
    @Column(name = "INSERT_TIMESTAMP")
    private Date insertTimestamp;
    @Column(name = "ERROR_CODE")
    private String errorCode;
    @Column(name = "ERROR_DESC")
    private String errorDesc;
    @Column(name = "EMAIL_TRIGGER_STATUS")
    private Boolean emailTriggerStatus;
    @Column(name = "SERVICE_NAME")
    private String serviceName;

    public String getTransactionReferenceId() {
        return transactionReferenceId;
    }

    public void setTransactionReferenceId(String transactionReferenceId) {
        this.transactionReferenceId = transactionReferenceId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Date getInsertTimestamp() {
        return insertTimestamp;
    }

    public void setInsertTimestamp(Date insertTimestamp) {
        this.insertTimestamp = insertTimestamp;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public Boolean getEmailTriggerStatus() {
        return emailTriggerStatus;
    }

    public void setEmailTriggerStatus(Boolean emailTriggerStatus) {
        this.emailTriggerStatus = emailTriggerStatus;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
