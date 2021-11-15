package com.ihis.efass.application.pojos;


import javax.persistence.Column;
import java.io.Serializable;

public class EFASSPropsConfigId implements Serializable {

    private String application;
    private String key_;

    public EFASSPropsConfigId() {}

    public EFASSPropsConfigId(String application, String key_) {
        this.application = application;
        this.key_ = key_;
    }
}
