package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "PROVIDE_APPEAL_CONSENT")
public class ProvideAppealConsent implements Serializable {
    public ProvideAppealConsent() {
    }

    public ProvideAppealConsent(BigInteger id, String nric, String schemeCd, String schemeDesc, String appealTypeDesc, String appealTypeCd, Float withdrawalAmount, String forTheMonthsOf, String patientNric, String createdBy, Date createdDate, String lastUpdatedBy, Date lastUpdatedDate) {
        this.id = id;
        this.nric = nric;
        this.schemeCd = schemeCd;
        this.schemeDesc = schemeDesc;
        this.appealTypeDesc = appealTypeDesc;
        this.appealTypeCd = appealTypeCd;
        this.withdrawalAmount = withdrawalAmount;
        this.forTheMonthsOf = forTheMonthsOf;
        this.patientNric = patientNric;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Column(name = "NRIC")
    private String nric;
    @Column(name = "SCHEME_CD")
    private String schemeCd;
    @Column(name = "SCHEME_DESC")
    private String schemeDesc;
    @Column(name = "APPEAL_TYPE_DESC")
    private String appealTypeDesc;
    @Column(name = "APPEAL_TYPE_CD")
    private String appealTypeCd;
    @Column(name = "WITHDRAWAL_AMOUNT")
    private Float withdrawalAmount;
    @Column(name = "FOR_THE_MONTHS_OF")
    private String forTheMonthsOf;
    @Column(name = "PATIENT_NRIC")
    private String patientNric;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATED_DATE")
    private Date lastUpdatedDate;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getNric() {
        return nric;
    }

    public void setNric(String nric) {
        this.nric = nric;
    }

    public String getSchemeCd() {
        return schemeCd;
    }

    public void setSchemeCd(String schemeCd) {
        this.schemeCd = schemeCd;
    }

    public String getSchemeDesc() {
        return schemeDesc;
    }

    public void setSchemeDesc(String schemeDesc) {
        this.schemeDesc = schemeDesc;
    }

    public String getAppealTypeDesc() {
        return appealTypeDesc;
    }

    public void setAppealTypeDesc(String appealTypeDesc) {
        this.appealTypeDesc = appealTypeDesc;
    }

    public String getAppealTypeCd() {
        return appealTypeCd;
    }

    public void setAppealTypeCd(String appealTypeCd) {
        this.appealTypeCd = appealTypeCd;
    }

    public Float getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(Float withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public String getForTheMonthsOf() {
        return forTheMonthsOf;
    }

    public void setForTheMonthsOf(String forTheMonthsOf) {
        this.forTheMonthsOf = forTheMonthsOf;
    }

    public String getPatientNric() {
        return patientNric;
    }

    public void setPatientNric(String patientNric) {
        this.patientNric = patientNric;
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
