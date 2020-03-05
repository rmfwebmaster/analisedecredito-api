package com.zallpy.analisedecredito.api.openapi.controller;

import com.zallpy.analisedecredito.api.exceptionhandler.Problem;
import com.zallpy.analisedecredito.api.model.PropostaModel;
import com.zallpy.analisedecredito.api.model.input.PropostaInput;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Proposta")
public interface PropostaControllerOpenApi {
    @ApiOperation("Busca uma proposta por CPF")
    @ApiResponses({
            @ApiResponse(code = 404, message = "Nenhuma proposta com este CPF", response = Problem.class)
    })
    PropostaModel buscarPorCpf(
            @ApiParam(value = "Cpf do cliente sem pontuação. Ex: 01307510302", example = "01307510302", required = true)
                    String cpf);

    @ApiOperation("Cadastra uma proposta")
    @ApiResponses({
            @ApiResponse(code = 201, message = "Proposta cadastrada"),
    })
    PropostaModel adicionar(
            @ApiParam(name = "corpo", value = "Representação de uma nova proposta", required = true)
                    PropostaInput propostaInput);
}