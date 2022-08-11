package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ASSESSMENT_METADATA")
public class AssessmentMetadata implements Serializable {
    public AssessmentMetadata() {
    }

    public AssessmentMetadata(String assessmentId, String assessorId, String assessorName, String institutionId, String acknowledgementId, Date submittedDate, Date assessmentDate, String patientId, String patientName, String assessmentType, String assessmentSetting, String processingStatus, String reimbursementStatus, String outcome, String transportId, Date createdDate, Date updatedDate, String messageId) {
        this.assessmentId = assessmentId;
        this.assessorId = assessorId;
        this.assessorName = assessorName;
        this.institutionId = institutionId;
        this.acknowledgementId = acknowledgementId;
        this.submittedDate = submittedDate;
        this.assessmentDate = assessmentDate;
        this.patientId = patientId;
        this.patientName = patientName;
        this.assessmentType = assessmentType;
        this.assessmentSetting = assessmentSetting;
        this.processingStatus = processingStatus;
        this.reimbursementStatus = reimbursementStatus;
        this.outcome = outcome;
        this.transportId = transportId;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.messageId = messageId;
    }

    @Id
    @Column(name = "ASSESSMENT_ID")
    private String assessmentId;
    @Column(name = "ASSESSOR_ID")
    private String assessorId;
    @Column(name = "ASSESSOR_NAME")
    private String assessorName;
    @Column(name = "INSTITUTION_ID")
    private String institutionId;
    @Column(name = "ACKNOWLEDGEMENT_ID")
    private String acknowledgementId;
    @Column(name = "SUBMITTED_DATE")
    private Date submittedDate;
    @Column(name = "ASSESSMENT_DATE")
    private Date assessmentDate;
    @Column(name = "PATIENT_ID")
    private String patientId;
    @Column(name = "PATIENT_NAME")
    private String patientName;
    @Column(name = "ASSESSMENT_TYPE")
    private String assessmentType;
    @Column(name = "ASSESSMENT_SETTING")
    private String assessmentSetting;
    @Column(name = "PROCESSING_STATUS")
    private String processingStatus;
    @Column(name = "REIMBURSEMENT_STATUS")
    private String reimbursementStatus;
    @Column(name = "OUTCOME")
    private String outcome;
    @Column(name = "TRANSPORT_ID")
    private String transportId;
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;
    @Column(name = "MESSAGE_ID")
    private String messageId;

    public String getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    public String getAssessorId() {
        return assessorId;
    }

    public void setAssessorId(String assessorId) {
        this.assessorId = assessorId;
    }

    public String getAssessorName() {
        return assessorName;
    }

    public void setAssessorName(String assessorName) {
        this.assessorName = assessorName;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public String getAcknowledgementId() {
        return acknowledgementId;
    }

    public void setAcknowledgementId(String acknowledgementId) {
        this.acknowledgementId = acknowledgementId;
    }

    public Date getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(Date submittedDate) {
        this.submittedDate = submittedDate;
    }

    public Date getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(Date assessmentDate) {
        this.assessmentDate = assessmentDate;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAssessmentType() {
        return assessmentType;
    }

    public void setAssessmentType(String assessmentType) {
        this.assessmentType = assessmentType;
    }

    public String getAssessmentSetting() {
        return assessmentSetting;
    }

    public void setAssessmentSetting(String assessmentSetting) {
        this.assessmentSetting = assessmentSetting;
    }

    public String getProcessingStatus() {
        return processingStatus;
    }

    public void setProcessingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
    }

    public String getReimbursementStatus() {
        return reimbursementStatus;
    }

    public void setReimbursementStatus(String reimbursementStatus) {
        this.reimbursementStatus = reimbursementStatus;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public String getTransportId() {
        return transportId;
    }

    public void setTransportId(String transportId) {
        this.transportId = transportId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
}
