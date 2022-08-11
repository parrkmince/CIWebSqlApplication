package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "EFASS_SCHEME")
public class EfassScheme implements Serializable {
    public EfassScheme() {
    }

    public EfassScheme(BigInteger efassSchemeId, String sourceSystem, String createdBy, Date createdDate, String lastUpdatedBy, Date lastUpdatedDate, String schemeLogo, String scheme, String schemeName, String schemeDesc, String schemeInfo) {
        this.efassSchemeId = efassSchemeId;
        this.sourceSystem = sourceSystem;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdatedDate = lastUpdatedDate;
        this.schemeLogo = schemeLogo;
        this.scheme = scheme;
        this.schemeName = schemeName;
        this.schemeDesc = schemeDesc;
        this.schemeInfo = schemeInfo;
    }

    @Id
    @Column(name = "EFASS_SCHEME_ID")
    private BigInteger efassSchemeId;
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
    @Column(name = "SCHEME_LOGO")
    private String schemeLogo;
    @Column(name = "SCHEME")
    private String scheme;
    @Column(name = "SCHEME_NAME")
    private String schemeName;
    @Column(name = "SCHEME_DESC")
    private String schemeDesc;
    @Column(name = "SCHEME_INFO")
    private String schemeInfo;

    public BigInteger getEfassSchemeId() {
        return efassSchemeId;
    }

    public void setEfassSchemeId(BigInteger efassSchemeId) {
        this.efassSchemeId = efassSchemeId;
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

    public String getSchemeLogo() {
        return schemeLogo;
    }

    public void setSchemeLogo(String schemeLogo) {
        this.schemeLogo = schemeLogo;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public String getSchemeDesc() {
        return schemeDesc;
    }

    public void setSchemeDesc(String schemeDesc) {
        this.schemeDesc = schemeDesc;
    }

    public String getSchemeInfo() {
        return schemeInfo;
    }

    public void setSchemeInfo(String schemeInfo) {
        this.schemeInfo = schemeInfo;
    }
}
