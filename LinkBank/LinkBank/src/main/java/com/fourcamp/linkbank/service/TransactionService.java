package com.fourcamp.linkbank.service;

import com.fourcamp.linkbank.model.Transaction;
import com.fourcamp.linkbank.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> listAll(){
        return transactionRepository.findAll();
    }

    public Object insertTransaction(Transaction transaction){
        return transactionRepository.save(transaction);
    }
}
