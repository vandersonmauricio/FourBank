package com.fourcamp.linkbank.model;

import java.time.LocalDate;

public abstract class Transaction {

    private Double value;

    private LocalDate date;

    private Account account;

    public Transaction(Double value, String date, Account account) {
        this.value = value;
        this.date = LocalDate.now();
        this.account = account;
    }

    public Transaction() {
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getDate() {
        return date.toString();
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
