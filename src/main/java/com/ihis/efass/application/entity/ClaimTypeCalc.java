package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name =  "ASSESSOR_STAGING")
public class ClaimTypeCalc implements Serializable {

    @Column(name = "UUID_")
    private String uuid_;
    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Column(name = "ASSESSMENT_TYPE")
    private String assessmentType;
    @Column(name = "MOH_PANEL")
    private Boolean mohPanel;
    @Column(name = "DISABILITY_REVIEW")
    private Boolean disabilityReview;
    @Column(name = "FEE_WAIVER_ELIGIBILITY_FLAG")
    private Boolean feeWaiverEligibilityFlag;
    @Column(name = "EXT_PERIOD_REVIEW")
    private Boolean extPeriodReview;
    @Column(name = "EXCEPTIONAL_ASSIST")
    private Boolean exceptionalAssist;
    @Column(name = "CLAIM_TYPE")
    private String claimType;

    public String getUuid_() {
        return uuid_;
    }

    public void setUuid_(String uuid_) {
        this.uuid_ = uuid_;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getAssessmentType() {
        return assessmentType;
    }

    public void setAssessmentType(String assessmentType) {
        this.assessmentType = assessmentType;
    }

    public Boolean getMohPanel() {
        return mohPanel;
    }

    public void setMohPanel(Boolean mohPanel) {
        this.mohPanel = mohPanel;
    }

    public Boolean getDisabilityReview() {
        return disabilityReview;
    }

    public void setDisabilityReview(Boolean disabilityReview) {
        this.disabilityReview = disabilityReview;
    }

    public Boolean getFeeWaiverEligibilityFlag() {
        return feeWaiverEligibilityFlag;
    }

    public void setFeeWaiverEligibilityFlag(Boolean feeWaiverEligibilityFlag) {
        this.feeWaiverEligibilityFlag = feeWaiverEligibilityFlag;
    }

    public Boolean getExtPeriodReview() {
        return extPeriodReview;
    }

    public void setExtPeriodReview(Boolean extPeriodReview) {
        this.extPeriodReview = extPeriodReview;
    }

    public Boolean getExceptionalAssist() {
        return exceptionalAssist;
    }

    public void setExceptionalAssist(Boolean exceptionalAssist) {
        this.exceptionalAssist = exceptionalAssist;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }
}
