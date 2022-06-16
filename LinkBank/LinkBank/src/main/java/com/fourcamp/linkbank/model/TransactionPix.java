package com.fourcamp.linkbank.model;

public class TransactionPix extends Transaction{

    private String pixKey;

    public TransactionPix(Double value, String date, Account account, String pixKey) {
        super(value, date, account);
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
