package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ASSESSMENT_SECTION")
public class AssessmentSection implements Serializable {

    @Id
    @Column(name = "ID_")
    private Float id_;
    @Column(name = "SECTION_KEY")
    private String sectionKey;
    @Column(name = "SECTION_NAME")
    private String sectionName;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "DISPLAY_ORDER")
    private Float displayOrder;
    @Column(name = "SOURCE_SYSTEM")
    private String sourceSystem;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATED_DATE")
    private Date lastUpdatedDate;
    @Column(name = "INFO_TEXT")
    private String infoText;
    @Column(name = "SECTION_FLAG")
    private Float sectionFlag;

    public Float getId_() {
        return id_;
    }

    public void setId_(Float id_) {
        this.id_ = id_;
    }

    public String getSectionKey() {
        return sectionKey;
    }

    public void setSectionKey(String sectionKey) {
        this.sectionKey = sectionKey;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Float displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
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

    public String getInfoText() {
        return infoText;
    }

    public void setInfoText(String infoText) {
        this.infoText = infoText;
    }

    public Float getSectionFlag() {
        return sectionFlag;
    }

    public void setSectionFlag(Float sectionFlag) {
        this.sectionFlag = sectionFlag;
    }
}
