package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ASSESSMENT_ANSWER")
public class AssessmentAnswer implements Serializable {

    public AssessmentAnswer(Long id_, String answerNumber, String externalAnswerId, String answerText, String sourceSystem, String createdBy, Date createdDate, String lastUpdatedBy, Date lastUpdatedDate) {
        this.id_ = id_;
        this.answerNumber = answerNumber;
        this.externalAnswerId = externalAnswerId;
        this.answerText = answerText;
        this.sourceSystem = sourceSystem;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public AssessmentAnswer() {
    }

    @Id
    @Column(name = "ID_")
    private Long id_;
    @Column(name = "ANSWER_NUMBER")
    private String answerNumber;
    @Column(name = "EXTERNAL_ANSWER_ID")
    private String externalAnswerId;
    @Column(name = "ANSWER_TEXT")
    private String answerText;
    @Column(name = "SOURCE_SYSTEM")
    private String sourceSystem;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATED_DATE")
    private Date lastUpdatedDate;

    public Long getId_() {
        return id_;
    }

    public void setId_(Long id_) {
        this.id_ = id_;
    }

    public String getAnswerNumber() {
        return answerNumber;
    }

    public void setAnswerNumber(String answerNumber) {
        this.answerNumber = answerNumber;
    }

    public String getExternalAnswerId() {
        return externalAnswerId;
    }

    public void setExternalAnswerId(String externalAnswerId) {
        this.externalAnswerId = externalAnswerId;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }
}
