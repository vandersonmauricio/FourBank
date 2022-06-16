package com.fourcamp.linkbank.service;

import com.fourcamp.linkbank.enums.TypeClientEnum;
import com.fourcamp.linkbank.model.Account;
import com.fourcamp.linkbank.model.Card;
import com.fourcamp.linkbank.model.Client;
import com.fourcamp.linkbank.repository.AccountRepository;
import com.fourcamp.linkbank.repository.CardRepository;
import com.fourcamp.linkbank.repository.ClientRepository;
import com.fourcamp.linkbank.utils.Validations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RegisterService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    CardRepository cardRepository;

    public String register(Client client) {
        Card card = new Card();
        Account account = new Account();
        String number = createDigit(5) + "-" + createDigit(1);
        String cardNumber = createDigit(4) + " " + createDigit(4) + " " + createDigit(4) + " " + createDigit(4);

        Client clientExist = clientRepository.findClientByCpf(client.getCpf());

        try {
            if (clientExist != null){
                return "Cliente já existe!";
            }
        } catch (NullPointerException e){

        }

        if (client.getIncome() <= 2000){
            card.setCardType(TypeClientEnum.BASIC.getKey());
        } else if (client.getIncome() <= 5000){
            card.setCardType(TypeClientEnum.SUPER.getKey());
        } else {
            card.setCardType(TypeClientEnum.PREMIUM.getKey());
        }

        if (!Validations.isCellPhone(client.getCellphone()) || !Validations.isCpf(client.getCpf()) || !Validations.isEmail(client.getEmail())){
            return "Dados inválidos!";
        }

        if (client.getPassword().length() < 8){
            return "Senha inválida!";
        }

        account.setClient(client);
        account.setNumber(number);
        account.setAgency("0001");

        card.setNumber(cardNumber);
        card.setActive(true);
        card.setAccount(account);

        accountRepository.save(account);
        cardRepository.save(card);

        return "Conta criada com sucesso!";
    }


    public void update(Account account) {
        accountRepository.save(account);
    }

    public String createDigit(int quantity){
        String digits = "";

        Random random = new Random();
        for(int x = 0; x<quantity; x++){
            Integer number = random.nextInt(0,10);
            digits += number.toString();

        }
        return digits ;
    }
}
