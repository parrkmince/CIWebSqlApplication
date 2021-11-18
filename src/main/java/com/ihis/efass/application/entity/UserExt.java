package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "USER_EXT")
public class UserExt implements Serializable {
    @Id
    @Column(name = "USERID")
    private BigInteger userid;
    @Column(name = "MOH_PANEL")
    private Boolean mohPanel;
    @Column(name = "UEN")
    private String uen;
    @Column(name = "PSR_INDICATOR_AS")
    private Boolean psrIndicatorAs;
    @Column(name = "PSR_INDICATOR_FAR")
    private Boolean psrIndicatorFar;
    @Column(name = "PSR_INDICATOR_MI")
    private Boolean psrIndicatorMi;
    @Column(name = "AS_CREDIT")
    private String asCredit;
    @Column(name = "HCI_ID")
    private BigInteger hciId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "TOU_ACCEPTED")
    private Boolean touAccepted;
    @Column(name = "HCI_NAME")
    private String hciName;
    @Column(name = "SCREEN_NAME")
    private String screenName;
    @Column(name = "ASSESSOR_ID")
    private String assessorId;
    @Column(name = "ASSESSOR_NAME")
    private String assessorName;
    @Column(name = "ASSESSOR_NRIC")
    private String assessorNric;
    @Column(name = "REGIS_NUM")
    private String regisNum;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "REGIS_DATE")
    private Date regisDate;
    @Column(name = "DEACTIVATE_DATE")
    private Date deactivateDate;
    @Column(name = "CREATE_DATE")
    private Date createDate;
    @Column(name = "UPDATE_DATE")
    private Date updatedDate;
    @Column(name = "USER_PROFILE_FLAG")
    private Boolean userProfileFlag;
    @Column(name = "CORPASS_ID")
    private String corpassId;
    @Column(name = "USER_STATUS")
    private String userStatus;
    @Column(name = "ROLES")
    private String roles;
    @Column(name = "ASSESSOR_TYPE")
    private String assessorType;
    @Column(name = "USER_PROFILE_SYNC_FLAG")
    private Boolean userProfileSyncFlag;

    public BigInteger getUserid() {
        return userid;
    }

    public void setUserid(BigInteger userid) {
        this.userid = userid;
    }

    public Boolean getMohPanel() {
        return mohPanel;
    }

    public void setMohPanel(Boolean mohPanel) {
        this.mohPanel = mohPanel;
    }

    public String getUen() {
        return uen;
    }

    public void setUen(String uen) {
        this.uen = uen;
    }

    public Boolean getPsrIndicatorAs() {
        return psrIndicatorAs;
    }

    public void setPsrIndicatorAs(Boolean psrIndicatorAs) {
        this.psrIndicatorAs = psrIndicatorAs;
    }

    public Boolean getPsrIndicatorFar() {
        return psrIndicatorFar;
    }

    public void setPsrIndicatorFar(Boolean psrIndicatorFar) {
        this.psrIndicatorFar = psrIndicatorFar;
    }

    public Boolean getPsrIndicatorMi() {
        return psrIndicatorMi;
    }

    public void setPsrIndicatorMi(Boolean psrIndicatorMi) {
        this.psrIndicatorMi = psrIndicatorMi;
    }

    public String getAsCredit() {
        return asCredit;
    }

    public void setAsCredit(String asCredit) {
        this.asCredit = asCredit;
    }

    public BigInteger getHciId() {
        return hciId;
    }

    public void setHciId(BigInteger hciId) {
        this.hciId = hciId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getTouAccepted() {
        return touAccepted;
    }

    public void setTouAccepted(Boolean touAccepted) {
        this.touAccepted = touAccepted;
    }

    public String getHciName() {
        return hciName;
    }

    public void setHciName(String hciName) {
        this.hciName = hciName;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
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

    public String getAssessorNric() {
        return assessorNric;
    }

    public void setAssessorNric(String assessorNric) {
        this.assessorNric = assessorNric;
    }

    public String getRegisNum() {
        return regisNum;
    }

    public void setRegisNum(String regisNum) {
        this.regisNum = regisNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getRegisDate() {
        return regisDate;
    }

    public void setRegisDate(Date regisDate) {
        this.regisDate = regisDate;
    }

    public Date getDeactivateDate() {
        return deactivateDate;
    }

    public void setDeactivateDate(Date deactivateDate) {
        this.deactivateDate = deactivateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Boolean getUserProfileFlag() {
        return userProfileFlag;
    }

    public void setUserProfileFlag(Boolean userProfileFlag) {
        this.userProfileFlag = userProfileFlag;
    }

    public String getCorpassId() {
        return corpassId;
    }

    public void setCorpassId(String corpassId) {
        this.corpassId = corpassId;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getAssessorType() {
        return assessorType;
    }

    public void setAssessorType(String assessorType) {
        this.assessorType = assessorType;
    }

    public Boolean getUserProfileSyncFlag() {
        return userProfileSyncFlag;
    }

    public void setUserProfileSyncFlag(Boolean userProfileSyncFlag) {
        this.userProfileSyncFlag = userProfileSyncFlag;
    }
}
