package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "ASSESSMENT_SERVICE_EXTENSTION")
public class AssessmentServiceExtension implements Serializable {

    @Id
    @Column(name = "MESSAGE_ID")
    private BigInteger messageId;
    @Column(name = "ASSESSMENT_ID")
    private String assessmentId;
    @Column(name = "ASSESSMENT_DATA")
    private String assessmentData;

    public BigInteger getMessageId() {
        return messageId;
    }

    public void setMessageId(BigInteger messageId) {
        this.messageId = messageId;
    }

    public String getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    public String getAssessmentData() {
        return assessmentData;
    }

    public void setAssessmentData(String assessmentData) {
        this.assessmentData = assessmentData;
    }
}
