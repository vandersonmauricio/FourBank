package com.fourcamp.linkbank.controller;

import com.fourcamp.linkbank.model.Account;
import com.fourcamp.linkbank.model.Card;
import com.fourcamp.linkbank.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    CardService cardService;

    @PutMapping("/block")
    public String blockCard(@RequestBody Card card){
        Boolean block = cardService.block(card);
        String return1 = null;
        try {
            if(card == null || !block){
                return1 =   "Não foi possível bloquear o cartão";
            }
        } catch (NullPointerException e) {
            return1 =  "Não foi possível bloquear o cartão ";
        }
        if (block) {
            return1 = "Cartão Bloqueado";
        }

        return return1;
    }
    @PutMapping("/unblock")
    public String unblockCard(@RequestBody Card card) {
        String message = "Cartão desbloqueado com sucesso!";
        Boolean block = cardService.unblock(card);
        try {
            if (card.getNumber() == null || card.getPassword() == null || block) {
                return "Não foi possível desbloquear o cartão";
            }
        } catch (NullPointerException e) {
            return "Não foi possível desbloquear o cartão";
        }

        return message;

    }

    @PutMapping("/adjustLimit")
    public String adjustLimit(@RequestBody Card card, Double newLimit) {
        String message = "O Limite alterado com sucesso!";
        Boolean limit = cardService.adjustLimit(card, newLimit);
        try {
            if (card.getNumber() == null || limit) {
                return "Não foi possível alterar o limite";
            }
        } catch (NullPointerException e) {
            return "Não foi possível alterar o limite";

        }
        return message;
    }

    @PutMapping("/changepassword")
    public String changePassword(@RequestBody Card card, String newPassword){
        boolean changePassword = cardService.changePassword(card, newPassword);
        try {
            if(card == null || newPassword == null || !changePassword){
                return "Não foi possível trocar a senha do cartão";
            }
        } catch (NullPointerException e) {
            return "Não foi possível trocar a senha do cartão";
        }
        return "Senha cadastrada com sucesso!";
    }
    @GetMapping("/getbill")
    public Object getBill(@RequestBody Card card){
        Object bill = cardService.getBill(card);
        try {
            if(card == null || bill == null){
                return "Não foi possível acessar a fatura";
            }
        } catch (NullPointerException e) {
            return "Não foi possível acessar a fatura";
        }
        return bill;
    }
    @GetMapping("/create")
    public String createCard(Account account){
         Random random = new Random();
         int first = random.nextInt(10000);
        int second = random.nextInt(10000);
        int third = random.nextInt(10000);
        int fourth = random.nextInt(10000);

         String return1 = first + " " +  second + " "  + third + " " + fourth;
       // Object createdcard = cardService.createCard(card);
        //return card;
        return return1;
    }

}

