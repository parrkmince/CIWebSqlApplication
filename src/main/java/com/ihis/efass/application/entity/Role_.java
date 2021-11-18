package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "ROLE_")
public class Role_ implements Serializable {

    @Column(name = "MVCCVERSION")
    private BigInteger mvccversion;
    @Column(name = "UUID_")
    private String uuid_;
    @Id
    @Column(name = "ROLEID")
    private BigInteger roleid;
    @Column(name = "COMPANYID")
    private BigInteger companyid;
    @Column(name = "USERID")
    private BigInteger userid;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "CREATEDDATE")
    private Date createddate;
    @Column(name = "MODIFEDDATE")
    private Date modifieddate;
    @Column(name = "CLASSNAMEID")
    private BigInteger classnameid;
    @Column(name = "CLASSPK")
    private BigInteger classpk;
    @Column(name = "NAME")
    private String name;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "TYPE_")
    private Integer type_;
    @Column(name = "SUBTYPE")
    private String subtype;

    public BigInteger getMvccversion() {
        return mvccversion;
    }

    public void setMvccversion(BigInteger mvccversion) {
        this.mvccversion = mvccversion;
    }

    public String getUuid_() {
        return uuid_;
    }

    public void setUuid_(String uuid_) {
        this.uuid_ = uuid_;
    }

    public BigInteger getRoleid() {
        return roleid;
    }

    public void setRoleid(BigInteger roleid) {
        this.roleid = roleid;
    }

    public BigInteger getCompanyid() {
        return companyid;
    }

    public void setCompanyid(BigInteger companyid) {
        this.companyid = companyid;
    }

    public BigInteger getUserid() {
        return userid;
    }

    public void setUserid(BigInteger userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public BigInteger getClassnameid() {
        return classnameid;
    }

    public void setClassnameid(BigInteger classnameid) {
        this.classnameid = classnameid;
    }

    public BigInteger getClasspk() {
        return classpk;
    }

    public void setClasspk(BigInteger classpk) {
        this.classpk = classpk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getType_() {
        return type_;
    }

    public void setType_(Integer type_) {
        this.type_ = type_;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }
}
