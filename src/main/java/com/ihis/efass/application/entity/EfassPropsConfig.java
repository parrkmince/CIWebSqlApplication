package com.ihis.efass.application.entity;

import com.ihis.efass.application.entity.id.EFASSPropsConfigId;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EFASS_PROPSCONFIG")
@IdClass(EFASSPropsConfigId.class)
public class EfassPropsConfig implements Serializable {

    @Id
    @Column(name = "APPLICATION")
    private String application;
    @Id
    @Column(name = "KEY_")
    private String key_;
    @Column(name = "VALUE")
    private String value;

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getKey_() {
        return key_;
    }

    public void setKey_(String key_) {
        this.key_ = key_;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "EfassPropsConfig{" +
                "application='" + application + '\'' +
                ", key_='" + key_ + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
