package com.fourcamp.linkbank.model;


import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, unique = true, length = 14)
    private String cpf;

    @Column(nullable = false, unique = true)
    private String rg;

    @Column(nullable = false)
    private String fullname;

    @Column(nullable = false)
    private String birthday;

    @Column(nullable = false)
    private Double income;

    @Column
    private Enum TypeClientEnum;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String profession;

    @OneToOne
    @JoinColumn(name = "id")
    private Address address;

    @Column(nullable = false)
    private String cellphone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Enum getTypeClientEnum() {
        return TypeClientEnum;
    }

    public void setTypeClientEnum(Enum typeClientEnum) {
        TypeClientEnum = typeClientEnum;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    //construtor primário
    public Client(String cpf, String rg, String fullname, String birthday,
                  Double income, String password, String email, String profession,
                  Address address, String cellphone) {
        this.cpf = cpf;
        this.rg = rg;
        this.fullname = fullname;
        this.birthday = birthday;
        this.income = income;
        this.password = password;
        this.email = email;
        this.profession = profession;
        this.address = address;
        this.cellphone = cellphone;
        this.rg = rg;
    }

    public Client(){

    }

    public Client(String cpf, String password){
        this.cpf = cpf;
        this.password = password;
    }
}
