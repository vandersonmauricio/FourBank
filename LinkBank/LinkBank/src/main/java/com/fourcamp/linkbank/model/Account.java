package com.fourcamp.linkbank.model;

import javax.persistence.*;

@Entity
public class Account {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(nullable = false, unique = true, length = 7)
   private String number;

   @Column(nullable = false, length = 4)
   private String agency;

   @Column
   private Double balance;

   @OneToOne
   @JoinColumn(name = "id")
   private Client client;

   @OneToOne
   @JoinColumn(name = "id")
   private Pix pix;

   public Long getId() {
      return id;
   }

   public String getNumber() {
      return number;
   }

   public void setNumber(String number) {
      this.number = number;
   }

   public String getAgency() {
      return agency;
   }

   public void setAgency(String agency) {
      this.agency = agency;
   }

   public Double getBalance() {
      return balance;
   }

   public void setBalance(Double balance) {
      this.balance = balance;
   }

   public Client getClient() {
      return client;
   }

   public void setClient(Client client) {
      this.client = client;
   }


   public Pix getPix() {
      return pix;
   }

   public void setPix(Pix pix) {
      this.pix = pix;
   }



   public void setId(Long id) {
      this.id = id;
   }

}
