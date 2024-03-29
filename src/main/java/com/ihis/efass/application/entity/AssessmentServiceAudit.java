package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "ASSESSMENT_SERVICE_AUDIT")
public class AssessmentServiceAudit implements Serializable {
    public AssessmentServiceAudit() {
    }

    public AssessmentServiceAudit(BigInteger id, String assessmentId, String messageId, String processStat, String errorType, Date insertTimestamp, Date updateTimestamp, String serviceResponse) {
        this.id = id;
        this.assessmentId = assessmentId;
        this.messageId = messageId;
        this.processStat = processStat;
        this.errorType = errorType;
        this.insertTimestamp = insertTimestamp;
        this.updateTimestamp = updateTimestamp;
        this.serviceResponse = serviceResponse;
    }

    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Column(name = "ASSESSMENT_ID")
    private String assessmentId;
    @Column(name = "MESSAGE_ID")
    private String messageId;
    @Column(name = "PROCESS_STAT")
    private String processStat;
    @Column(name = "ERROR_TYPE")
    private String errorType;
    @Column(name = "INSERT_TIMESTAMP")
    private Date insertTimestamp;
    @Column(name = "UPDATE_TIMESTAMP")
    private Date updateTimestamp;
    @Column(name = "SERVICE_RESPONSE")
    private String serviceResponse;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
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
