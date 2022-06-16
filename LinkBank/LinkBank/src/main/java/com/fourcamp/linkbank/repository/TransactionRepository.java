package com.fourcamp.linkbank.repository;

import com.fourcamp.linkbank.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
