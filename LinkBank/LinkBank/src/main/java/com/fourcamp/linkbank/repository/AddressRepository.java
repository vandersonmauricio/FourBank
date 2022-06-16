package com.fourcamp.linkbank.repository;

import com.fourcamp.linkbank.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
