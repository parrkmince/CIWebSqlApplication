package com.ihis.efass.application.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ASSESSMENT_QUESTION")
public class AssessmentQuestion {

    @Id
    @Column(name = "id_")
    private String id_;
    @Column(name = "QUESTION_NUMBER")
    private String questionNumber;
    @Column(name = "EXTERNAL_QUESTION_ID")
    private String externalQuestionId;
    @Column(name = "QUESTION_TEXT")
    private String questionText;
    @Column(name = "MANDATORY")
    private String mandatory;
    @Column(name = "REFRESH_FLAG")
    private String refreshFlag;
    @Column(name = "MANDATORY_ERROR_TEXT")
    private String mandatoryErrorText;
    @Column(name = "ERROR_TEXT")
    private String errorText;
    @Column(name = "HELP_TEXT")
    private String helpText;
    @Column(name = "FIELD_TYPE")
    private String fieldType;
    @Column(name = "SOURCE_SYSTEM")
    private String sourceSystem;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATED_DATE")
    private String createdDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATED_DATE")
    private String lastUpdatedDate;

    public String getId_() {
        return id_;
    }

    public void setId_(String id_) {
        this.id_ = id_;
    }

    public String getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(String questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getExternalQuestionId() {
        return externalQuestionId;
    }

    public void setExternalQuestionId(String externalQuestionId) {
        this.externalQuestionId = externalQuestionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getMandatory() {
        return mandatory;
    }

    public void setMandatory(String mandatory) {
        this.mandatory = mandatory;
    }

    public String getRefreshFlag() {
        return refreshFlag;
    }

    public void setRefreshFlag(String refreshFlag) {
        this.refreshFlag = refreshFlag;
    }

    public String getMandatoryErrorText() {
        return mandatoryErrorText;
    }

    public void setMandatoryErrorText(String mandatoryErrorText) {
        this.mandatoryErrorText = mandatoryErrorText;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public String getHelpText() {
        return helpText;
    }

    public void setHelpText(String helpText) {
        this.helpText = helpText;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
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

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @Override
    public String toString() {
        return "AssessmentQuestion{" +
                "id_='" + id_ + '\'' +
                ", questionNumber='" + questionNumber + '\'' +
                ", externalQuestionId='" + externalQuestionId + '\'' +
                ", questionText='" + questionText + '\'' +
                ", mandatory='" + mandatory + '\'' +
                ", refreshFlag='" + refreshFlag + '\'' +
                ", mandatoryErrorText='" + mandatoryErrorText + '\'' +
                ", errorText='" + errorText + '\'' +
                ", helpText='" + helpText + '\'' +
                ", fieldType='" + fieldType + '\'' +
                ", sourceSystem='" + sourceSystem + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                ", lastUpdatedDate='" + lastUpdatedDate + '\'' +
                '}';
    }
}
