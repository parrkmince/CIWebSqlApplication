package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "SPA_AP_USER_STAGING")
public class SpApUserStaging implements Serializable {
    public SpApUserStaging() {
    }

    public SpApUserStaging(BigInteger spaApUserStagingId, String uen, String hciId, String batchId, String firstName, String middleName, String lastName, String mohPanel, String type, String assessorNric, String assessorId, Boolean accreditedIndicator, Boolean activeIndicator, Date registrationDate, Date deactivationDate, Boolean prsAsTrainedFlag, Boolean prsFarTrainedFlag, Boolean prsMiTrainedFlag, Date createdDate, Date updatedDate, String registrationNum, String roles, String userStatus, String assessorType) {
        this.spaApUserStagingId = spaApUserStagingId;
        this.uen = uen;
        this.hciId = hciId;
        this.batchId = batchId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mohPanel = mohPanel;
        this.type = type;
        this.assessorNric = assessorNric;
        this.assessorId = assessorId;
        this.accreditedIndicator = accreditedIndicator;
        this.activeIndicator = activeIndicator;
        this.registrationDate = registrationDate;
        this.deactivationDate = deactivationDate;
        this.prsAsTrainedFlag = prsAsTrainedFlag;
        this.prsFarTrainedFlag = prsFarTrainedFlag;
        this.prsMiTrainedFlag = prsMiTrainedFlag;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.registrationNum = registrationNum;
        this.roles = roles;
        this.userStatus = userStatus;
        this.assessorType = assessorType;
    }

    @Id
    @Column(name = "SPA_AP_USER_STAGING_ID")
    private BigInteger spaApUserStagingId;
    @Column(name = "UEN")
    private String uen;
    @Column(name = "HCI_ID")
    private String hciId;
    @Column(name = "BATCH_ID")
    private String batchId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "MIDDLE_NAME")
    private String middleName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "MOH_PANEL")
    private String mohPanel;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "ASSESSOR_NRIC")
    private String assessorNric;
    @Column(name = "ASSESSOR_ID")
    private String assessorId;
    @Column(name = "ACCREDITED_INDICATOR")
    private Boolean accreditedIndicator;
    @Column(name = "ACTIVE_INDICATOR")
    private Boolean activeIndicator;
    @Column(name = "REGISTRATION_DATE")
    private Date registrationDate;
    @Column(name = "DEACTIVATION_DATE")
    private Date deactivationDate;
    @Column(name = "PRS_AS_TRAINED_FLAG")
    private Boolean prsAsTrainedFlag;
    @Column(name = "PRS_FAR_TRAINED_FLAG")
    private Boolean prsFarTrainedFlag;
    @Column(name = "PRS_MI_TRAINED_FLAG")
    private Boolean prsMiTrainedFlag;
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;
    @Column(name = "REGISTRATION_NUM")
    private String registrationNum;
    @Column(name = "ROLES")
    private String roles;
    @Column(name = "USER_STATUS")
    private String userStatus;
    @Column(name = "ASSESSOR_TYPE")
    private String assessorType;

    public BigInteger getSpaApUserStagingId() {
        return spaApUserStagingId;
    }

    public void setSpaApUserStagingId(BigInteger spaApUserStagingId) {
        this.spaApUserStagingId = spaApUserStagingId;
    }

    public String getUen() {
        return uen;
    }

    public void setUen(String uen) {
        this.uen = uen;
    }

    public String getHciId() {
        return hciId;
    }

    public void setHciId(String hciId) {
        this.hciId = hciId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMohPanel() {
        return mohPanel;
    }

    public void setMohPanel(String mohPanel) {
        this.mohPanel = mohPanel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAssessorNric() {
        return assessorNric;
    }

    public void setAssessorNric(String assessorNric) {
        this.assessorNric = assessorNric;
    }

    public String getAssessorId() {
        return assessorId;
    }

    public void setAssessorId(String assessorId) {
        this.assessorId = assessorId;
    }

    public Boolean getAccreditedIndicator() {
        return accreditedIndicator;
    }

    public void setAccreditedIndicator(Boolean accreditedIndicator) {
        this.accreditedIndicator = accreditedIndicator;
    }

    public Boolean getActiveIndicator() {
        return activeIndicator;
    }

    public void setActiveIndicator(Boolean activeIndicator) {
        this.activeIndicator = activeIndicator;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getDeactivationDate() {
        return deactivationDate;
    }

    public void setDeactivationDate(Date deactivationDate) {
        this.deactivationDate = deactivationDate;
    }

    public Boolean getPrsAsTrainedFlag() {
        return prsAsTrainedFlag;
    }

    public void setPrsAsTrainedFlag(Boolean prsAsTrainedFlag) {
        this.prsAsTrainedFlag = prsAsTrainedFlag;
    }

    public Boolean getPrsFarTrainedFlag() {
        return prsFarTrainedFlag;
    }

    public void setPrsFarTrainedFlag(Boolean prsFarTrainedFlag) {
        this.prsFarTrainedFlag = prsFarTrainedFlag;
    }

    public Boolean getPrsMiTrainedFlag() {
        return prsMiTrainedFlag;
    }

    public void setPrsMiTrainedFlag(Boolean prsMiTrainedFlag) {
        this.prsMiTrainedFlag = prsMiTrainedFlag;
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

    public String getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getAssessorType() {
        return assessorType;
    }

    public void setAssessorType(String assessorType) {
        this.assessorType = assessorType;
    }
}
