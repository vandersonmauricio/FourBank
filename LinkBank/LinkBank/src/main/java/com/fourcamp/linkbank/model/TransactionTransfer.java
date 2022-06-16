package com.fourcamp.linkbank.model;


import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class TransactionTransfer extends Transaction {

    @ManyToOne
    @JoinColumn(name = "id")
    private Account recieverAccount;


    public TransactionTransfer(String id, Double value, String date, Account account, Account recieverAccount) {
        super(Long.valueOf(id), value, date, account);
        this.recieverAccount = recieverAccount;
    }

    public TransactionTransfer(Account recieverAccount) {
        this.recieverAccount = recieverAccount;
    }

    public TransactionTransfer() {
    }

    public Account getRecieverAccount() {
        return recieverAccount;
    }

    public void setRecieverAccount(Account recieverAccount) {
        this.recieverAccount = recieverAccount;
    }

    @Override
    public String toString() {
        return "Transferência {" +
                "Conta destino =" + recieverAccount +
                '}';
    }
}
