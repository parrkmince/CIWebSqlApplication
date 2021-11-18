package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "USER_INST")
public class UserInst implements Serializable {

    @Id
    @Column(name = "USERID")
    private String userid;
    @Column(name = "INT_INST_ID")
    private String intInstId;
    @Column(name = "CORPAS_ID")
    private String corpasId;
    @Column(name = "NRIC")
    private String nric;
    @Column(name = "UEN")
    private String uen;
    @Column(name = "USER_INST_DEF")
    private String userInstDef;
    @Column(name = "USER_INST_TYPE")
    private String userInstType;
    @Column(name = "ASSESSOR_STATUS")
    private Boolean assesorStatus;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getIntInstId() {
        return intInstId;
    }

    public void setIntInstId(String intInstId) {
        this.intInstId = intInstId;
    }

    public String getCorpasId() {
        return corpasId;
    }

    public void setCorpasId(String corpasId) {
        this.corpasId = corpasId;
    }

    public String getNric() {
        return nric;
    }

    public void setNric(String nric) {
        this.nric = nric;
    }

    public String getUen() {
        return uen;
    }

    public void setUen(String uen) {
        this.uen = uen;
    }

    public String getUserInstDef() {
        return userInstDef;
    }

    public void setUserInstDef(String userInstDef) {
        this.userInstDef = userInstDef;
    }

    public String getUserInstType() {
        return userInstType;
    }

    public void setUserInstType(String userInstType) {
        this.userInstType = userInstType;
    }

    public Boolean getAssesorStatus() {
        return assesorStatus;
    }

    public void setAssesorStatus(Boolean assesorStatus) {
        this.assesorStatus = assesorStatus;
    }
}
