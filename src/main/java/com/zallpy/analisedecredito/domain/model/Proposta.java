package com.zallpy.analisedecredito.domain.model;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Proposta {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
    private BigDecimal renda;

    @Column(nullable = false)
    private Boolean resultadoAnalise;

    @Column(nullable = false)
    private String limite;

    @CreationTimestamp
    private OffsetDateTime dataCadastro;
}