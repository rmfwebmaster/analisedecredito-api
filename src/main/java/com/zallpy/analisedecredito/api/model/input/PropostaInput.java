package com.zallpy.analisedecredito.api.model.input;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Positive;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class PropostaInput {

    @ApiModelProperty(example = "Rodrigo", required = true)
    @NotBlank
    private String nome;

    @ApiModelProperty(example = "01307510302", required = true)
    @NotBlank
    private String cpf;

    @ApiModelProperty(example = "35", required = true)
    @NotNull
    @Positive
    private Long idade;

    @ApiModelProperty(example = "M", required = true)
    @NotBlank
    private String sexo;

    @ApiModelProperty(example = "casado", required = true)
    @NotBlank
    private String estadoCivil;

    @ApiModelProperty(example = "MA", required = true)
    @NotBlank
    private String estado;

    @ApiModelProperty(example = "1", required = true)
    @NotNull
    @PositiveOrZero
    private Long dependentes;

    @ApiModelProperty(example = "3000", required = true)
    @NotNull
    @Positive
    private BigDecimal renda;
}
