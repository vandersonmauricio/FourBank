package com.fourcamp.linkbank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pix {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String cpf;

    @Column
    private String email;

    @Column
    private String cellphone;

    @Column
    private String cnpj;

    public Pix(String cellphone) {
        this.cellphone = cellphone;
    }
}
