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
    protected String flag;

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
    private boolean debitCard;

    @Column
    private boolean creditCard;

    @Column
    private Double monthlyLimit;

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

    public Card(Long id, String number, String flag, String password, Boolean isActive, Account account, Double monthlyBill, boolean debitCard, boolean creditCard, Double monthlyLimit, Double dailyLimit) {
        this.id = id;
        this.number = number;
        this.flag = flag;
        this.password = password;
        this.isActive = isActive;
        this.account = account;
        this.monthlyBill = monthlyBill;
        this.debitCard = debitCard;
        this.creditCard = creditCard;
        this.monthlyLimit = monthlyLimit;
        this.dailyLimit = dailyLimit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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

    public boolean isDebitCard() {
        return debitCard;
    }

    public void setDebitCard(boolean debitCard) {
        this.debitCard = debitCard;
    }

    public boolean isCreditCard() {
        return creditCard;
    }

    public void setCreditCard(boolean creditCard) {
        this.creditCard = creditCard;
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
}
