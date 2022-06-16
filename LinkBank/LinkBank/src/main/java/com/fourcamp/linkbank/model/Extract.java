package com.fourcamp.linkbank.model;

import javax.persistence.*;

@Entity
public class Extract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "extract_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private Double value;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinTable(name = "id")
    private Account account;

    public Extract(Long id, Double value, String description, Account account) {
        this.id = id;
        this.value = value;
        this.description = description;
        this.account = account;
    }

    public Extract() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
