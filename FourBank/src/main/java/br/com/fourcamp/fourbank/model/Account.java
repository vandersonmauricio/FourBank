package br.com.fourcamp.fourbank.model;

import java.io.Serializable;

public abstract class Account implements Serializable {

    protected static final Long serialVersionUID = 1L;
    protected Integer number;
    protected Integer agency;
    protected Double balance;
    protected Costumer costumer;
    protected Integer password;
    protected Card cards[];

    public Account(Integer number, Integer agency, Double balance, Costumer costumer, Integer password) {
        this.number = number;
        this.agency = agency;
        this.balance = balance;
        this.costumer = costumer;
        this.password = password;

    }

    protected void setNumber(Integer number) {
        this.number = number;
    }

    protected Integer getAgency() {
        return agency;
    }

    protected void setAgency(Integer agency) {
        this.agency = agency;
    }

    public Double getBalance() {
        return balance;
    }

    protected void setBalance(Double balance) {
        this.balance = balance;
    }

    protected Costumer getCostumer() {
        return costumer;
    }

    protected void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    protected Integer getPassword() {
        return password;
    }

    protected void setPassword(Integer password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Conta{" +
                " número = " + number +
                ", agência = " +
                ", saldo =" + balance +
                ", cliente = " + costumer +
                '}';
    }
}
