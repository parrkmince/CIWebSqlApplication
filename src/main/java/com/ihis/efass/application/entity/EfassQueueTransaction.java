package com.ihis.efass.application.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "EFASS_QUEUE_TRANSACTION")
public class EfassQueueTransaction implements Serializable {

    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Column(name = "TRANSACTION_ID")
    private String transactionId;
    @Column(name = "TRANSACTION_TYPE")
    private String transactionType;
    @Column(name = "PORTAL_TYPE")
    private String portalType;
    @Column(name = "COMPLETE_FLAG")
    private Boolean completeFlag;
    @Column(name = "START_TIMESTAMP")
    private Date startTimestamp;
    @Column(name = "USER_ID")
    private BigInteger userId;
    @Column(name = "UEN")
    private BigInteger uen;
    @Column(name = "HCI")
    private BigInteger hci;
    @Column(name = "CREATED_BY")
    private BigInteger createdBy;
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "LAST_UPDATED_BY")
    private BigInteger lastUpdatedBy;
    @Column(name = "LAST_UDPATED_DATE")
    private Date lastUpdatedDate;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getPortalType() {
        return portalType;
    }

    public void setPortalType(String portalType) {
        this.portalType = portalType;
    }

    public Boolean getCompleteFlag() {
        return completeFlag;
    }

    public void setCompleteFlag(Boolean completeFlag) {
        this.completeFlag = completeFlag;
    }

    public Date getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public BigInteger getUen() {
        return uen;
    }

    public void setUen(BigInteger uen) {
        this.uen = uen;
    }

    public BigInteger getHci() {
        return hci;
    }

    public void setHci(BigInteger hci) {
        this.hci = hci;
    }

    public BigInteger getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(BigInteger createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public BigInteger getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(BigInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }
}
