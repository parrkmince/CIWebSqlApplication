package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "EFASS_ENQUIRY_CATEGORY")
public class EfassEnquiryCategory implements Serializable {
    public EfassEnquiryCategory() {
    }

    public EfassEnquiryCategory(BigInteger id, String enquirer, String mainCategory, String subCategory, String categorization, String status, String createdBy, Date createdDate, String lastUpdatedBy, Date lastUpdatedDate) {
        this.id = id;
        this.enquirer = enquirer;
        this.mainCategory = mainCategory;
        this.subCategory = subCategory;
        this.categorization = categorization;
        this.status = status;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Column(name = "ENQUIRER")
    private String enquirer;
    @Column(name = "MAIN_CATEGORY")
    private String mainCategory;
    @Column(name = "SUB_CATEGORY")
    private String subCategory;
    @Column(name = "CATEGORIZATION")
    private String categorization;
    @Column(name = "STATUS")
    private String status;
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

    public String getEnquirer() {
        return enquirer;
    }

    public void setEnquirer(String enquirer) {
        this.enquirer = enquirer;
    }

    public String getMainCategory() {
        return mainCategory;
    }

    public void setMainCategory(String mainCategory) {
        this.mainCategory = mainCategory;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getCategorization() {
        return categorization;
    }

    public void setCategorization(String categorization) {
        this.categorization = categorization;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
