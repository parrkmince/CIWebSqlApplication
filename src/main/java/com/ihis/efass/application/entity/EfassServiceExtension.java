package com.ihis.efass.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "EFASS_SERVICE_EXTENSTION")
public class EfassServiceExtension implements Serializable {

    @Id
    @Column(name = "MESSAGE_ID")
    private BigInteger messageId;
    @Column(name = "TRANSACTION_ID")
    private String transactionId;
    @Column(name = "TRANSACTION_DATA")
    private String transactionData;

    public BigInteger getMessageId() {
        return messageId;
    }

    public void setMessageId(BigInteger messageId) {
        this.messageId = messageId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionData() {
        return transactionData;
    }

    public void setTransactionData(String transactionData) {
        this.transactionData = transactionData;
    }
}
