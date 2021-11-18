package com.ihis.efass.application.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "FEE_CALCULATION")
public class FeeCalculation implements Serializable{

    @Column(name = "UUID_")
    private String  uuid_;
    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Column(name = "ASSESSMENT_SETTING")
    private Boolean assessmentSetting;
    @Column(name = "ASSESSMENT_FEE")
    private Float assessmentFee;

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

    public Boolean getAssessmentSetting() {
        return assessmentSetting;
    }

    public void setAssessmentSetting(Boolean assessmentSetting) {
        this.assessmentSetting = assessmentSetting;
    }

    public Float getAssessmentFee() {
        return assessmentFee;
    }

    public void setAssessmentFee(Float assessmentFee) {
        this.assessmentFee = assessmentFee;
    }
}
