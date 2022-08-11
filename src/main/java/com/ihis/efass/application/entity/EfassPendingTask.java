package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "EFASS_PENDING_TASK")
public class EfassPendingTask implements Serializable {
    public EfassPendingTask() {
    }

    public EfassPendingTask(BigInteger id_, String transactionId, String assigneeId, String assignedDate, String applicantId, String applicationType, String patientId, String patientName, String schemeId, String todo, String reasons, String status, Date dueDate, String createdBy, Date createdDate, String lastUpdatedBy, Date lastUpdatedDate, String medisaveAmount, String bankName, String bankAccountNo, String applicantName, String hci, String uen, String userType) {
        this.id_ = id_;
        this.transactionId = transactionId;
        this.assigneeId = assigneeId;
        this.assignedDate = assignedDate;
        this.applicantId = applicantId;
        this.applicationType = applicationType;
        this.patientId = patientId;
        this.patientName = patientName;
        this.schemeId = schemeId;
        this.todo = todo;
        this.reasons = reasons;
        this.status = status;
        this.dueDate = dueDate;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdatedDate = lastUpdatedDate;
        this.medisaveAmount = medisaveAmount;
        this.bankName = bankName;
        this.bankAccountNo = bankAccountNo;
        this.applicantName = applicantName;
        this.hci = hci;
        this.uen = uen;
        this.userType = userType;
    }

    @Id
    @Column(name = "ID_")
    private BigInteger id_;
    @Column(name = "TRANSACTION_ID")
    private String transactionId;
    @Column(name = "ASSIGNEE_ID")
    private String assigneeId;
    @Column(name = "ASSIGNED_DATE")
    private String assignedDate;
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
    @Column(name = "TODO")
    private String todo;
    @Column(name = "REASONS")
    private String reasons;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "DUE_DATE")
    private Date dueDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATED_DATE")
    private Date lastUpdatedDate;
    @Column(name = "MEDISAVE_AMOUNT")
    private String medisaveAmount;
    @Column(name = "BANK_NAME")
    private String bankName;
    @Column(name = "BANK_ACCOUNT_NO")
    private String bankAccountNo;
    @Column(name = "APPLICANT_NAME")
    private String applicantName;
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

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
    }

    public String getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(String assignedDate) {
        this.assignedDate = assignedDate;
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

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getReasons() {
        return reasons;
    }

    public void setReasons(String reasons) {
        this.reasons = reasons;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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

    public String getMedisaveAmount() {
        return medisaveAmount;
    }

    public void setMedisaveAmount(String medisaveAmount) {
        this.medisaveAmount = medisaveAmount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
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
