package com.fourcamp.linkbank.service;

import com.fourcamp.linkbank.model.Extract;
import com.fourcamp.linkbank.repository.ExtractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExtractService {

    @Autowired
    private ExtractRepository extractRepository;

    public List<Extract> listById(Long id){

        return extractRepository.findByAccountId(id);
    }
}
