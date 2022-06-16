package com.fourcamp.linkbank.service;

import com.fourcamp.linkbank.enums.ExtractTypeEnum;
import com.fourcamp.linkbank.model.Extract;
import com.fourcamp.linkbank.model.Transaction;
import com.fourcamp.linkbank.model.TransactionTransfer;
import com.fourcamp.linkbank.repository.ExtractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private ExtractRepository extractRepository;

    public void insertTransaction(Transaction transaction){
        Extract extract = new Extract();

        if (transaction instanceof TransactionTransfer){
            extract.setDescription(ExtractTypeEnum.TRANSFER.getKey());
        } else {
            extract.setDescription(ExtractTypeEnum.PIX.getKey());
        }

        extract.setValue(transaction.getValue());
        extract.setAccount(transaction.getAccount());

        extractRepository.save(extract);
    }
}
