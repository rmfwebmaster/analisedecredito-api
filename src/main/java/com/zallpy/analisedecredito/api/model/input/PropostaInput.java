package com.zallpy.analisedecredito.api.model.input;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Positive;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PropostaInput {

    @ApiModelProperty(example = "Rodrigo Medeiros", required = true)
    @NotBlank
    private String nome;

    @ApiModelProperty(example = "01307510302", required = true)
    @NotBlank
    private String cpf;

    @ApiModelProperty(example = "35", required = true)
    @NotBlank
    @Positive
    private Long idade;

    @ApiModelProperty(example = "M", required = true)
    @NotNull
    private String sexo;

    @ApiModelProperty(example = "casado", required = true)
    @NotNull
    private String estadoCivil;

    @ApiModelProperty(example = "MA", required = true)
    @NotNull
    private String estado;

    @ApiModelProperty(example = "1", required = true)
    @NotBlank
    @PositiveOrZero
    private Long dependetes;

    @ApiModelProperty(example = "3000", required = true)
    @NotBlank
    @Positive
    private Long renda;
}
