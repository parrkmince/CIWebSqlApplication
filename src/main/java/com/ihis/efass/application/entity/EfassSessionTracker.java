package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "EFASS_SESSION_TRACKER")
public class EfassSessionTracker implements Serializable {
    public EfassSessionTracker() {
    }

    public EfassSessionTracker(String screenname, String latestsessionid, Date modifieddate, String activeuser) {
        this.screenname = screenname;
        this.latestsessionid = latestsessionid;
        this.modifieddate = modifieddate;
        this.activeuser = activeuser;
    }

    @Id
    @Column(name = "SCREENAME")
    private String screenname;
    @Column(name = "LATESTSESSIONID")
    private String latestsessionid;
    @Column(name = "MODIFIEDDATE")
    private Date modifieddate;
    @Column(name = "ACTIVEUSER")
    private String activeuser;

    public String getScreenname() {
        return screenname;
    }

    public void setScreenname(String screenname) {
        this.screenname = screenname;
    }

    public String getLatestsessionid() {
        return latestsessionid;
    }

    public void setLatestsessionid(String latestsessionid) {
        this.latestsessionid = latestsessionid;
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public String getActiveuser() {
        return activeuser;
    }

    public void setActiveuser(String activeuser) {
        this.activeuser = activeuser;
    }
}
