package br.com.fourcamp.fourbank.model;

public class SavingsAccount extends Account {
    private Double yield;
    private Integer anniversary;

    public SavingsAccount(Integer number, Integer agency, Double balance, Client client, Integer password, double yield, int anniversary) {
        super(number, agency, balance, client, password);
        this.anniversary = anniversary;
        this.yield = yield;
    }

    public Double getYield() {
        return yield;
    }

    public void setYield(Double yield) {
        this.yield = yield;
    }

    public Integer getAnniversary() {
        return anniversary;
    }

    public void setAnniversary(Integer anniversary) {
        this.anniversary = anniversary;
    }

    public double addIncome(){
        balance += balance * yield;
        return balance;
    }
}
