package com.fourcamp.linkbank.model;

import javax.persistence.*;

@Entity
public abstract class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transaction_id")
    private Long id;

    @Column(nullable = false)
    private Double value;

    @Column(nullable = false)
    private String date;

    @ManyToOne
    @JoinColumn(name = "id")
    private Account account;

    public Transaction(Long id, Double value, String date, Account account) {
        this.id = id;
        this.value = value;
        this.date = date;
        this.account = account;
    }

    public Transaction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
