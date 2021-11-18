package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "INSTITUTION_MASTER")
public class InstitutionMaster implements Serializable {

    @Id
    @Column(name = "INSTITUTION_ID")
    private String institutionId;
    @Column(name = "HCI_CODE")
    private String hciCode;
    @Column(name = "INSTITUTION_NAME")
    private String institutionName;
    @Column(name = "BRANCH_TYPE")
    private String branchType;
    @Column(name = "BRANCH_STATUS")
    private String branchStatus;
    @Column(name = "POSTAL_CODE")
    private String postalCode;
    @Column(name = "FLOOR")
    private String floor;
    @Column(name = "UNIT_NO")
    private String unitNo;
    @Column(name = "BLOCK")
    private String block;
    @Column(name = "STREET_NAME")
    private String streetName;
    @Column(name = "BUILDING_NAME")
    private String buildingName;
    @Column(name = "CONTACT_NUM1")
    private String contactNum1;
    @Column(name = "CONTACT_NUM2")
    private String contactNum2;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name = "BANK_CODE")
    private String bankCode;
    @Column(name = "BANK_ACCOUNT_NO")
    private String bankAccountNo;
    @Column(name = "BANK_ACCOUNT_HOLDER_NAME")
    private String bankAccountHolderName;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATED_DATE")
    private Date lastUpdatedDate;
    @Column(name = "UEN")
    private String uen;
    @Column(name = "UEN_NAME")
    private String uenName;

    public String getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public String getHciCode() {
        return hciCode;
    }

    public void setHciCode(String hciCode) {
        this.hciCode = hciCode;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getBranchType() {
        return branchType;
    }

    public void setBranchType(String branchType) {
        this.branchType = branchType;
    }

    public String getBranchStatus() {
        return branchStatus;
    }

    public void setBranchStatus(String branchStatus) {
        this.branchStatus = branchStatus;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getContactNum1() {
        return contactNum1;
    }

    public void setContactNum1(String contactNum1) {
        this.contactNum1 = contactNum1;
    }

    public String getContactNum2() {
        return contactNum2;
    }

    public void setContactNum2(String contactNum2) {
        this.contactNum2 = contactNum2;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBankAccountHolderName() {
        return bankAccountHolderName;
    }

    public void setBankAccountHolderName(String bankAccountHolderName) {
        this.bankAccountHolderName = bankAccountHolderName;
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

    public String getUen() {
        return uen;
    }

    public void setUen(String uen) {
        this.uen = uen;
    }

    public String getUenName() {
        return uenName;
    }

    public void setUenName(String uenName) {
        this.uenName = uenName;
    }
}
