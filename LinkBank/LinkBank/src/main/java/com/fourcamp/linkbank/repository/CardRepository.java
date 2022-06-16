package com.fourcamp.linkbank.repository;

import com.fourcamp.linkbank.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
