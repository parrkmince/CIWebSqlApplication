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
@Table(name = "USER_")
public class User_ implements Serializable {

    @Column(name = "MCCVERSION")
    private BigInteger mvccVersion;
    @Column(name = "UUID_")
    private String uuid_;
    @Column(name = "EXTERNALREFERENCECODE")
    private String externalreferencecode;
    @Id
    @Column(name = "USERID")
    private BigInteger userId;
    @Column(name = "COMPANYID")
    private BigInteger companyid;
    @Column(name = "CREATEDDATE")
    private Date createddate;
    @Column(name = "MODIFIEDDATE")
    private Date modifieddate;
    @Column(name = "DEFAULTUSER")
    private Boolean defaultuser;
    @Column(name = "CONTACTID")
    private BigInteger contactid;
    @Column(name = "PASSWORD_")
    private String password_;
    @Column(name = "PASSWORDENCRYPTED")
    private Boolean passwordencrypted;
    @Column(name = "PASSWORDRESET")
    private Boolean passwordreset;
    @Column(name = "PASSWORDMODIFIEDDATE")
    private Date passwordmodifieddate;
    @Column(name = "DIGEST")
    private String digest;
    @Column(name = "REMINDERQUERYQUESTION")
    private String reminderqueryquestion;
    @Column(name = "REMINDERQUERYANSWER")
    private String reminderqueryanswer;
    @Column(name = "GRACELOGINCOUNT")
    private Integer gracelogincount;
    @Column(name = "SCREENNAME")
    private String screenname;
    @Column(name = "EMAILADDRESS")
    private String emailaddress;
    @Column(name = "FACEBOOKID")
    private BigInteger facebookid;
    @Column(name = "GOOGLEUSERID")
    private String googleuserid;
    @Column(name = "LDAPSERVERID")
    private BigInteger ldapserverid;
    @Column(name = "OPENID")
    private String openid;
    @Column(name = "PORTRAIDID")
    private BigInteger portraitid;
    @Column(name = "LANGUAGEID")
    private String languageid;
    @Column(name = "TIMEZONEID")
    private String timezoneid;
    @Column(name = "GREETING")
    private String greeting;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Column(name = "MIDDLENAME")
    private String middlename;
    @Column(name = "LASTNAMEE")
    private String lastname;
    @Column(name = "JOBTITLE")
    private String  jobtitle;
    @Column(name = "LOGINDATE")
    private Date logindate;
    @Column(name = "LOGINIP")
    private String loginip;
    @Column(name = "LASTLOGINDATE")
    private Date lastlogindate;
    @Column(name = "LASTLOGINIP")
    private String lastloginip;
    @Column(name = "LASTFAILEDLOGINDATE")
    private Date lastfailedlogindate;
    @Column(name = "FAILEDLOGINATTEMPTS")
    private Integer failedloginattempts;
    @Column(name = "LOCKOUT")
    private Boolean lockout;
    @Column(name = "LOCKOUTDATE")
    private Date lockoutdate;
    @Column(name = "AGREEDTOTERMSOFUSE")
    private Boolean agreedtotermsofuse;
    @Column(name = "EMAILADDRESSVERIFIED")
    private Boolean emailaddressverified;
    @Column(name = "STATUS")
    private Integer status;

    public BigInteger getMvccVersion() {
        return mvccVersion;
    }

    public void setMvccVersion(BigInteger mvccVersion) {
        this.mvccVersion = mvccVersion;
    }

    public String getUuid_() {
        return uuid_;
    }

    public void setUuid_(String uuid_) {
        this.uuid_ = uuid_;
    }

    public String getExternalreferencecode() {
        return externalreferencecode;
    }

    public void setExternalreferencecode(String externalreferencecode) {
        this.externalreferencecode = externalreferencecode;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public BigInteger getCompanyid() {
        return companyid;
    }

    public void setCompanyid(BigInteger companyid) {
        this.companyid = companyid;
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

    public Boolean getDefaultuser() {
        return defaultuser;
    }

    public void setDefaultuser(Boolean defaultuser) {
        this.defaultuser = defaultuser;
    }

    public BigInteger getContactid() {
        return contactid;
    }

    public void setContactid(BigInteger contactid) {
        this.contactid = contactid;
    }

    public String getPassword_() {
        return password_;
    }

    public void setPassword_(String password_) {
        this.password_ = password_;
    }

    public Boolean getPasswordencrypted() {
        return passwordencrypted;
    }

    public void setPasswordencrypted(Boolean passwordencrypted) {
        this.passwordencrypted = passwordencrypted;
    }

    public Boolean getPasswordreset() {
        return passwordreset;
    }

    public void setPasswordreset(Boolean passwordreset) {
        this.passwordreset = passwordreset;
    }

    public Date getPasswordmodifieddate() {
        return passwordmodifieddate;
    }

    public void setPasswordmodifieddate(Date passwordmodifieddate) {
        this.passwordmodifieddate = passwordmodifieddate;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getReminderqueryquestion() {
        return reminderqueryquestion;
    }

    public void setReminderqueryquestion(String reminderqueryquestion) {
        this.reminderqueryquestion = reminderqueryquestion;
    }

    public String getReminderqueryanswer() {
        return reminderqueryanswer;
    }

    public void setReminderqueryanswer(String reminderqueryanswer) {
        this.reminderqueryanswer = reminderqueryanswer;
    }

    public Integer getGracelogincount() {
        return gracelogincount;
    }

    public void setGracelogincount(Integer gracelogincount) {
        this.gracelogincount = gracelogincount;
    }

    public String getScreenname() {
        return screenname;
    }

    public void setScreenname(String screenname) {
        this.screenname = screenname;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public BigInteger getFacebookid() {
        return facebookid;
    }

    public void setFacebookid(BigInteger facebookid) {
        this.facebookid = facebookid;
    }

    public String getGoogleuserid() {
        return googleuserid;
    }

    public void setGoogleuserid(String googleuserid) {
        this.googleuserid = googleuserid;
    }

    public BigInteger getLdapserverid() {
        return ldapserverid;
    }

    public void setLdapserverid(BigInteger ldapserverid) {
        this.ldapserverid = ldapserverid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public BigInteger getPortraitid() {
        return portraitid;
    }

    public void setPortraitid(BigInteger portraitid) {
        this.portraitid = portraitid;
    }

    public String getLanguageid() {
        return languageid;
    }

    public void setLanguageid(String languageid) {
        this.languageid = languageid;
    }

    public String getTimezoneid() {
        return timezoneid;
    }

    public void setTimezoneid(String timezoneid) {
        this.timezoneid = timezoneid;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public Date getLogindate() {
        return logindate;
    }

    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    public Date getLastlogindate() {
        return lastlogindate;
    }

    public void setLastlogindate(Date lastlogindate) {
        this.lastlogindate = lastlogindate;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip;
    }

    public Date getLastfailedlogindate() {
        return lastfailedlogindate;
    }

    public void setLastfailedlogindate(Date lastfailedlogindate) {
        this.lastfailedlogindate = lastfailedlogindate;
    }

    public Integer getFailedloginattempts() {
        return failedloginattempts;
    }

    public void setFailedloginattempts(Integer failedloginattempts) {
        this.failedloginattempts = failedloginattempts;
    }

    public Boolean getLockout() {
        return lockout;
    }

    public void setLockout(Boolean lockout) {
        this.lockout = lockout;
    }

    public Date getLockoutdate() {
        return lockoutdate;
    }

    public void setLockoutdate(Date lockoutdate) {
        this.lockoutdate = lockoutdate;
    }

    public Boolean getAgreedtotermsofuse() {
        return agreedtotermsofuse;
    }

    public void setAgreedtotermsofuse(Boolean agreedtotermsofuse) {
        this.agreedtotermsofuse = agreedtotermsofuse;
    }

    public Boolean getEmailaddressverified() {
        return emailaddressverified;
    }

    public void setEmailaddressverified(Boolean emailaddressverified) {
        this.emailaddressverified = emailaddressverified;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
