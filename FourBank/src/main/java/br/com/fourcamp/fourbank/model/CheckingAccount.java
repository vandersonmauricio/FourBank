package br.com.fourcamp.fourbank.model;

public class CheckingAccount extends Account {
    private Double maintenance;

    public CheckingAccount(Integer number, Integer agency, Double balance, Costumer costumer, Integer password, Double maintenance) {
        super(number, agency, balance, costumer, password);
        this.maintenance = maintenance;
    }

    public Double getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(Double maintenance) {
        this.maintenance = maintenance;
    }

    public double dicountFee(){
        balance -= balance * maintenance;
        return balance;
    }
}
