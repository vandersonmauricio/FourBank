package com.fourcamp.linkbank.service;

import com.fourcamp.linkbank.model.Client;


public class RegisterService {

    public void register(Client client){

        /*
            verificar se cliente ja existe
            if(client.cpf == clientBD.cpf){
                CLIENTE COM MESMO CPF JA EXISTE
                return;
            }
         */


       /* //define tipo do cliente com base na renda
        client.setTypeClientEnum(changeTypeClient(client.getIncome()));

        //adicionar regex para todos os dados

        System.out.println(client.getTypeClientEnum());
        //manda client pro banco de dados
    */
        //prontinho
    }



    public void update(Client client){
        /*
        if(client.getCPF()==clientBD.getCPF()){
            atualiza todos os cliente
        }
         */

    }

    public void updatePassword(Client client){
        /*
            if(client.getCPF() == clientBD.getCPF(){
                clientBD.setPassword(client.getPassword());
            }
         */
    }

    /*public Enum changeTypeClient(Double income) {
        Enum type = null;
        if (income < 2000) {
            type = TypeClientEnum.BASIC;
        } else if (income >= 2000 && income < 5000) {
            type = TypeClientEnum.SUPER;
        } else if (income >= 5000) {
            type = TypeClientEnum.PREMIUM;
        }
        return type;
    }*/
}
