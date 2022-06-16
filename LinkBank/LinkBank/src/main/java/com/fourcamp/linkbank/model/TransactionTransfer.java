package com.fourcamp.linkbank.model;


public class TransactionTransfer extends Transaction {

    private Account recieverAccount;


    public TransactionTransfer(Double value, String date, Account account, Account recieverAccount) {
        super(value, date, account);
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
