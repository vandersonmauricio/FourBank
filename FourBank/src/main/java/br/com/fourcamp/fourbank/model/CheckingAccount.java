package br.com.fourcamp.fourbank.model;

public class CheckingAccount extends Account {
    private Double maintenance;

    public CheckingAccount(Integer number, Integer agency, Double balance, Client client, Integer password, Double maintenance) {
        super(number, agency, balance, client, password);
        this.maintenance = maintenance;
    }

    public Double getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(Double maintenance) {
        this.maintenance = maintenance;
    }

    public double discountFee(){
        balance -= balance * maintenance;
        return balance;
    }
}
