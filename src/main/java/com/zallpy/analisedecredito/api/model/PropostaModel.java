package com.zallpy.analisedecredito.api.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PropostaModel {

    @ApiModelProperty(example = "1")
    private Long propostaId;

    @ApiModelProperty(example = "Rodrigo Medeiros")
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
    private Long renda;

    @ApiModelProperty(example = "true or false")
    private Boolean resultadoAnalise;

    @ApiModelProperty(example = "Entre 500 - 1000")
    private String limite;

}
