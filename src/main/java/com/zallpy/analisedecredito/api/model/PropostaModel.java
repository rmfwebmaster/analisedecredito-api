package com.zallpy.analisedecredito.api.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
public class PropostaModel {

    @ApiModelProperty(example = "1")
    private Long id;

    @ApiModelProperty(example = "Rodrigo")
    private String nome;

    @ApiModelProperty(example = "01307510302")
    private String cpf;

    @ApiModelProperty(example = "35")
    private Long idade;

    @ApiModelProperty(example = "M")
    private String sexo;

    @ApiModelProperty(example = "casado")
    private String estadoCivil;

    @ApiModelProperty(example = "MA")
    private String estado;

    @ApiModelProperty(example = "1")
    private Long dependentes;

    @ApiModelProperty(example = "3000")
    private BigDecimal renda;

    @ApiModelProperty(example = "true or false")
    private Boolean resultadoAnalise;

    @ApiModelProperty(example = "Entre 500 - 1000")
    private String limite;

    @ApiModelProperty(example = "2019-12-01T20:34:04Z")
    private OffsetDateTime dataCadastro;
}
