package com.fourcamp.linkbank.repository;

import com.fourcamp.linkbank.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
