/*package com.fourcamp.linkbank.controller;

import com.fourcamp.linkbank.model.Address;
import com.fourcamp.linkbank.model.Client;
import com.fourcamp.linkbank.model.Login;
import com.fourcamp.linkbank.service.RegisterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    /*@PostMapping("/register")
    public void register(@RequestBody Client client){

        Client clientNew = new Client(client.getCpf(), client.getRg(), client.getFullname(), client.getBirthday(),
                client.getIncome(),client.getPassword(),client.getEmail(),client.getProfession(),
                client.getAddress(),client.getCellphone());

        RegisterService service = new RegisterService();
        service.register(clientNew);
    }

    @PutMapping("/register")
    public void update(@RequestBody Client client){
        Client clientUpdate = new Client(client.getCpf(), client.getRg(), client.getFullname(),
                client.getBirthday(), client.getIncome(),client.getPassword(),
                client.getEmail(),client.getProfession(),
                client.getAddress(),client.getCellphone());

        RegisterService service = new RegisterService();
        service.update(clientUpdate);
    }

    @PutMapping("/login")
    public void updatePassword(@RequestBody Login login){
        Client clientPasswordUpdate = new Client(login.getCpf(), login.getPassword());
        RegisterService service = new RegisterService();
        service.updatePassword(clientPasswordUpdate);
    }*/