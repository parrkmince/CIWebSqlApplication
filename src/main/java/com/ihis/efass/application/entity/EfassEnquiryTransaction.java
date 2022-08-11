package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "EFASS_ENQUIRY_TRANSACTION")
public class EfassEnquiryTransaction implements Serializable {
    public EfassEnquiryTransaction() {
    }

    public EfassEnquiryTransaction(BigInteger id, String enquiryId, String enquirerId, String uen, String hci, String messageId, String status, String type, String mode, String userType, String createdBy, Date createdDate, String lastUpdatedBy, Date lastUpdatedDate) {
        this.id = id;
        this.enquiryId = enquiryId;
        this.enquirerId = enquirerId;
        this.uen = uen;
        this.hci = hci;
        this.messageId = messageId;
        this.status = status;
        this.type = type;
        this.mode = mode;
        this.userType = userType;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Column(name = "ENQUIRY_ID")
    private String enquiryId;
    @Column(name = "ENQUIRER_ID")
    private String enquirerId;
    @Column(name = "UEN")
    private String uen;
    @Column(name = "HCI")
    private String hci;
    @Column(name = "MESSAGE_ID")
    private String messageId;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "MODE")
    private String mode;
    @Column(name = "USER_TYPE")
    private String userType;
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

    public String getEnquiryId() {
        return enquiryId;
    }

    public void setEnquiryId(String enquiryId) {
        this.enquiryId = enquiryId;
    }

    public String getEnquirerId() {
        return enquirerId;
    }

    public void setEnquirerId(String enquirerId) {
        this.enquirerId = enquirerId;
    }

    public String getUen() {
        return uen;
    }

    public void setUen(String uen) {
        this.uen = uen;
    }

    public String getHci() {
        return hci;
    }

    public void setHci(String hci) {
        this.hci = hci;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
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
