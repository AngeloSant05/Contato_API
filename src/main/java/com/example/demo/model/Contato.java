package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Contato {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String email;

    @Column
    private String celular;

    @Column
    private String telefone;

    @Column
    private Boolean favorito;

    @Column
    private Boolean ativo;



}
