package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "EFASS_SERVICE_XML_LOG")
public class EfassServiceXmlLog implements Serializable {
    public EfassServiceXmlLog() {
    }

    public EfassServiceXmlLog(String eventId, String userId, String sessionId, Date createddate, String xmlRequestMessage, String xmlResponseMessage, String eventtype) {
        this.eventId = eventId;
        this.userId = userId;
        this.sessionId = sessionId;
        this.createddate = createddate;
        this.xmlRequestMessage = xmlRequestMessage;
        this.xmlResponseMessage = xmlResponseMessage;
        this.eventtype = eventtype;
    }

    @Id
    @Column(name = "EVENT_ID")
    private String eventId;
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "SESSION_ID")
    private String sessionId;
    @Column(name = "CREATEDDATE")
    private Date createddate;
    @Column(name = "XML_REQUEST_MESSAGE")
    private String xmlRequestMessage;
    @Column(name = "XML_RESPONSE_MESSAGE")
    private String xmlResponseMessage;
    @Column(name = "EVENTTYPE")
    private String eventtype;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public String getXmlRequestMessage() {
        return xmlRequestMessage;
    }

    public void setXmlRequestMessage(String xmlRequestMessage) {
        this.xmlRequestMessage = xmlRequestMessage;
    }

    public String getXmlResponseMessage() {
        return xmlResponseMessage;
    }

    public void setXmlResponseMessage(String xmlResponseMessage) {
        this.xmlResponseMessage = xmlResponseMessage;
    }

    public String getEventtype() {
        return eventtype;
    }

    public void setEventtype(String eventtype) {
        this.eventtype = eventtype;
    }
}
