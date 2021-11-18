package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "EFASS_APP_SCHEME_TRANSACTION")
public class EfassAppSchemeTransaction implements Serializable {

    @Id
    @Column(name = "ID_")
    private BigInteger id_;
    @Column(name = "APPLICATION_ID")
    private String applicationId;
    @Column(name = "MESSAGE_ID")
    private String messageId;
    @Column(name = "APPLICANT_ID")
    private String applicantId;
    @Column(name = "APPLICATION_TYPE")
    private String applicationType;
    @Column(name = "PATIENT_ID")
    private String patientId;
    @Column(name = "PATIENT_NAME")
    private String patientName;
    @Column(name = "SCHEME_ID")
    private String schemeId;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "SUBMITTED_DATE")
    private Date submittedDate;
    @Column(name = "APP_DETAILS")
    private String appDetails;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDAED_DATE")
    private Date lastUpdatedDate;
    @Column(name = "SCHEME_CASE_ID")
    private String schemeCaseId;
    @Column(name = "REASON_CODE")
    private String reasonCode;
    @Column(name = "HCI")
    private String hci;
    @Column(name = "UEN")
    private String uen;
    @Column(name = "USER_TYPE")
    private String userType;

    public BigInteger getId_() {
        return id_;
    }

    public void setId_(BigInteger id_) {
        this.id_ = id_;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
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

    public String getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(String schemeId) {
        this.schemeId = schemeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(Date submittedDate) {
        this.submittedDate = submittedDate;
    }

    public String getAppDetails() {
        return appDetails;
    }

    public void setAppDetails(String appDetails) {
        this.appDetails = appDetails;
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

    public String getSchemeCaseId() {
        return schemeCaseId;
    }

    public void setSchemeCaseId(String schemeCaseId) {
        this.schemeCaseId = schemeCaseId;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getHci() {
        return hci;
    }

    public void setHci(String hci) {
        this.hci = hci;
    }

    public String getUen() {
        return uen;
    }

    public void setUen(String uen) {
        this.uen = uen;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
