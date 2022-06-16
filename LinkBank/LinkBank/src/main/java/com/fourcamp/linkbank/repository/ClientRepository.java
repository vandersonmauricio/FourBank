package com.fourcamp.linkbank.repository;

import com.fourcamp.linkbank.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
