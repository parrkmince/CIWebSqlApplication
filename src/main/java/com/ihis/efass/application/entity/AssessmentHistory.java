package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "ASSESSMENT_HISTORY")
public class AssessmentHistory implements Serializable {

    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Column(name = "ASSESSMENT_ID")
    private String assessmentId;
    @Column(name = "PATIENT_ID")
    private String patientId;
    @Column(name = "HCI_ID")
    private String hciId;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "ASSESSMENT_DATE")
    private Date assessmentDate;
    @Column(name = "ASSESSMENT_TYPE")
    private String assessmentType;
    @Column(name = "ASSESSMENT_SETTING")
    private String assessmentSetting;
    @Column(name = "ASSESSMENT_STATUS")
    private String assessmentStatus;
    @Column(name = "TRANSPORT_ID")
    private String transportId;
    @Column(name = "CLOB_PK")
    private String clobPk;
    @Column(name = "ASSESSMENT_FEE_BY_GOV")
    private Float assessmentFeeByGov;
    @Column(name = "ASSESSMENT_FEE_BY_PERSON")
    private Float assessmentFeeByPerson;
    @Column(name = "ASSESSMENT_FEE_BY_INSTRUCTION")
    private String assessmentFeeByInstruction;
    @Column(name = "CLAIM_TYPE")
    private String claimType;

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

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getHciId() {
        return hciId;
    }

    public void setHciId(String hciId) {
        this.hciId = hciId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(Date assessmentDate) {
        this.assessmentDate = assessmentDate;
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

    public String getAssessmentStatus() {
        return assessmentStatus;
    }

    public void setAssessmentStatus(String assessmentStatus) {
        this.assessmentStatus = assessmentStatus;
    }

    public String getTransportId() {
        return transportId;
    }

    public void setTransportId(String transportId) {
        this.transportId = transportId;
    }

    public String getClobPk() {
        return clobPk;
    }

    public void setClobPk(String clobPk) {
        this.clobPk = clobPk;
    }

    public Float getAssessmentFeeByGov() {
        return assessmentFeeByGov;
    }

    public void setAssessmentFeeByGov(Float assessmentFeeByGov) {
        this.assessmentFeeByGov = assessmentFeeByGov;
    }

    public Float getAssessmentFeeByPerson() {
        return assessmentFeeByPerson;
    }

    public void setAssessmentFeeByPerson(Float assessmentFeeByPerson) {
        this.assessmentFeeByPerson = assessmentFeeByPerson;
    }

    public String getAssessmentFeeByInstruction() {
        return assessmentFeeByInstruction;
    }

    public void setAssessmentFeeByInstruction(String assessmentFeeByInstruction) {
        this.assessmentFeeByInstruction = assessmentFeeByInstruction;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }
}
