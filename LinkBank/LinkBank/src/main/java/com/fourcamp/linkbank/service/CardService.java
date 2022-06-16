package com.fourcamp.linkbank.service;

import com.fourcamp.linkbank.model.Card;
import com.fourcamp.linkbank.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    CardRepository data;

    public Boolean block(Card card){

        return null;
    }

    public Boolean unblock(Card card){

        return null;
    }
    public Boolean adjustLimit(Card card, Double newLimit) {
        return false;

    }


    public boolean changePassword(Card card, String newPassword) {


        return false;
    }

    public Object getBill(Card card) {
        int b = 24;
        return b;
    }
}
