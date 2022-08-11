package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "PP_USER")
public class PpUser implements Serializable {
    public PpUser() {
    }

    public PpUser(BigInteger ppUserId, String nric, Boolean touFlag, Date acceptDate, Date lastLoginDate, String createdBy, Date createdDate, String lastUpdatedBy, Date lastUpdatedDate, Boolean userProfileFlag, Boolean userProfileSyncFlag) {
        this.ppUserId = ppUserId;
        this.nric = nric;
        this.touFlag = touFlag;
        this.acceptDate = acceptDate;
        this.lastLoginDate = lastLoginDate;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdatedDate = lastUpdatedDate;
        this.userProfileFlag = userProfileFlag;
        this.userProfileSyncFlag = userProfileSyncFlag;
    }

    @Id
    @Column(name = "PP_USER_ID")
    private BigInteger ppUserId;
    @Column(name = "NRIC")
    private String  nric;
    @Column(name = "TOU_FLAG")
    private Boolean touFlag;
    @Column(name = "ACCEPT_DATE")
    private Date acceptDate;
    @Column(name = "LAST_LOGIN_DATE")
    private Date lastLoginDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATED_DATE")
    private Date lastUpdatedDate;
    @Column(name = "USER_PROFILE_FLAG")
    private Boolean userProfileFlag;
    @Column(name = "USER_PROFILE_SYNC_FLAG")
    private Boolean userProfileSyncFlag;

    public BigInteger getPpUserId() {
        return ppUserId;
    }

    public void setPpUserId(BigInteger ppUserId) {
        this.ppUserId = ppUserId;
    }

    public String getNric() {
        return nric;
    }

    public void setNric(String nric) {
        this.nric = nric;
    }

    public Boolean getTouFlag() {
        return touFlag;
    }

    public void setTouFlag(Boolean touFlag) {
        this.touFlag = touFlag;
    }

    public Date getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
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

    public Boolean getUserProfileFlag() {
        return userProfileFlag;
    }

    public void setUserProfileFlag(Boolean userProfileFlag) {
        this.userProfileFlag = userProfileFlag;
    }

    public Boolean getUserProfileSyncFlag() {
        return userProfileSyncFlag;
    }

    public void setUserProfileSyncFlag(Boolean userProfileSyncFlag) {
        this.userProfileSyncFlag = userProfileSyncFlag;
    }
}
