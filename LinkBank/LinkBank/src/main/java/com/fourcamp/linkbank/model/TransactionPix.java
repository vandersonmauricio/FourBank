package com.fourcamp.linkbank.model;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class TransactionPix extends Transaction{

    @Column(nullable = false)
    private String pixKey;

    public TransactionPix(String id, Double value, String date, Account account, String pixKey) {
        super(Long.valueOf(id), value, date, account);
        this.pixKey = pixKey;
    }

    public TransactionPix(String pixKey) {
        this.pixKey = pixKey;
    }

    public String getPixKey() {
        return pixKey;
    }

    public void setPixKey(String pixKey) {
        this.pixKey = pixKey;
    }

    @Override
    public String toString() {
        return "Transacao PIX{" +
                "Chave PIX = " + pixKey + '\'' +
                '}';
    }
}
