package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "EFASS_CODESET")
public class EfassCodeset implements Serializable {
    public EfassCodeset() {
    }

    public EfassCodeset(String reasonCode, String reason, String todo, String internalTodo, String taskCode, String taskType, String sectionHeader, String category, String spaTodo, String spaReason, String spaTaskCode, String spaActionable, String spaSectionheader, String status) {
        this.reasonCode = reasonCode;
        this.reason = reason;
        this.todo = todo;
        this.internalTodo = internalTodo;
        this.taskCode = taskCode;
        this.taskType = taskType;
        this.sectionHeader = sectionHeader;
        this.category = category;
        this.spaTodo = spaTodo;
        this.spaReason = spaReason;
        this.spaTaskCode = spaTaskCode;
        this.spaActionable = spaActionable;
        this.spaSectionheader = spaSectionheader;
        this.status = status;
    }

    @Id
    @Column(name = "REASON_CODE")
    private String reasonCode;
    @Column(name = "REASON")
    private String reason;
    @Column(name = "TODO")
    private String todo;
    @Column(name = "INTERNAL_TODO")
    private String internalTodo;
    @Column(name = "TASK_CODE")
    private String taskCode;
    @Column(name = "TASK_TYPE")
    private String taskType;
    @Column(name = "SECTION_HEADER")
    private String sectionHeader;
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "SPA_TODO")
    private String spaTodo;
    @Column(name = "SPA_REASON")
    private String spaReason;
    @Column(name = "SPA_TASK_CODE")
    private String spaTaskCode;
    @Column(name = "SPA_ACTIONABLE")
    private String spaActionable;
    @Column(name = "SPA_SECTION_HEADER")
    private String spaSectionheader;
    @Column(name = "STATUS")
    private String status;

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getInternalTodo() {
        return internalTodo;
    }

    public void setInternalTodo(String internalTodo) {
        this.internalTodo = internalTodo;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getSectionHeader() {
        return sectionHeader;
    }

    public void setSectionHeader(String sectionHeader) {
        this.sectionHeader = sectionHeader;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSpaTodo() {
        return spaTodo;
    }

    public void setSpaTodo(String spaTodo) {
        this.spaTodo = spaTodo;
    }

    public String getSpaReason() {
        return spaReason;
    }

    public void setSpaReason(String spaReason) {
        this.spaReason = spaReason;
    }

    public String getSpaTaskCode() {
        return spaTaskCode;
    }

    public void setSpaTaskCode(String spaTaskCode) {
        this.spaTaskCode = spaTaskCode;
    }

    public String getSpaActionable() {
        return spaActionable;
    }

    public void setSpaActionable(String spaActionable) {
        this.spaActionable = spaActionable;
    }

    public String getSpaSectionheader() {
        return spaSectionheader;
    }

    public void setSpaSectionheader(String spaSectionheader) {
        this.spaSectionheader = spaSectionheader;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
