package com.zallpy.analisedecredito.domain.model;

import java.time.OffsetDateTime;
//import java.util.ArrayList;
//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Proposta {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long propostaId;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private Long idade;

    @Column(nullable = false)
    private String sexo;

    @Column(nullable = false)
    private String estadoCivil;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    private Long dependentes;

    @Column(nullable = false)
    private Long renda;

    @Column(nullable = true)
    private Boolean resultadoAnalise;

    @Column(nullable = true)
    private String limite;

    @Column(nullable = true)
    private OffsetDateTime dataAtualizacao;

    @Column(nullable = false)
    private OffsetDateTime dataCriacao;
}