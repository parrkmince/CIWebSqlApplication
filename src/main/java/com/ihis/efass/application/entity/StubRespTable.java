package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "STUB_RESP_TABLE")
public class StubRespTable implements Serializable {

    @Id
    @Column(name = "UID")
    private String uid;
    @Column(name = "RESPONSE_DATA")
    private String responseData;
    @Column(name = "STUB_NAME")
    private String stubName;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getResponseData() {
        return responseData;
    }

    public void setResponseData(String responseData) {
        this.responseData = responseData;
    }

    public String getStubName() {
        return stubName;
    }

    public void setStubName(String stubName) {
        this.stubName = stubName;
    }
}
