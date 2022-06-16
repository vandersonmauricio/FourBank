package com.fourcamp.linkbank.model;


import javax.persistence.*;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, unique = true, length = 16)
    protected String number;

    @Column(nullable = false)
    protected String password;

    @Column(nullable = false)
    protected Boolean isActive;

    @OneToOne
    @JoinColumn(name = "id")
    protected Account account;

    @Column(nullable = false)
    protected Double monthlyBill;

    @Column
    private Double monthlyLimit;

    @Column
    private String cardType;

    @Column(nullable = false)
    private Double dailyLimit;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Card(String number, String password) {
        this.number = number;
        this.password = password;
    }
    public Card() {
    }

    public Card(Long id, String number, String password, Boolean isActive, Account account, Double monthlyBill, Double monthlyLimit, Double dailyLimit, String cardType) {
        this.id = id;
        this.number = number;
        this.password = password;
        this.isActive = isActive;
        this.account = account;
        this.monthlyBill = monthlyBill;
        this.monthlyLimit = monthlyLimit;
        this.dailyLimit = dailyLimit;
        this.cardType = cardType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Double getMonthlyBill() {
        return monthlyBill;
    }

    public void setMonthlyBill(Double monthlyBill) {
        this.monthlyBill = monthlyBill;
    }

    public Double getMonthlyLimit() {
        return monthlyLimit;
    }

    public void setMonthlyLimit(Double monthlyLimit) {
        this.monthlyLimit = monthlyLimit;
    }

    public Double getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(Double dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
