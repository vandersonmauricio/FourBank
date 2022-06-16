package com.fourcamp.linkbank.repository;

import com.fourcamp.linkbank.model.Extract;
import com.fourcamp.linkbank.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ExtractRepository extends JpaRepository<Extract, Long> {

    @Query(" select e from Extract e where e.id = :id ")
    List<Extract> findByAccountId(@Param("id") Long id);

}
