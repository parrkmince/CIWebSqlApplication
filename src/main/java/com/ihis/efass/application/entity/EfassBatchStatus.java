package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "EFASS_BATCH_STATUS")
public class EfassBatchStatus implements Serializable {
    public EfassBatchStatus() {
    }

    public EfassBatchStatus(String processId, String jobName, String jobStatus, Date createdDate) {
        this.processId = processId;
        this.jobName = jobName;
        this.jobStatus = jobStatus;
        this.createdDate = createdDate;
    }

    @Id
    @Column(name = "PROCESS_ID")
    private String processId;
    @Column(name = "JOB_NAME")
    private String jobName;
    @Column(name = "JOB_STATUS")
    private String jobStatus;
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
