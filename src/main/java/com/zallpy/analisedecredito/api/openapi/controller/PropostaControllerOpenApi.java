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
    @ApiOperation("Busca uma proposta por código")
    @ApiResponses({
            @ApiResponse(code = 404, message = "Nenhuma proposta com este código", response = Problem.class)
    })
    PropostaModel buscar(
            @ApiParam(value = "Código da proposta", example = "10", required = true)
                    Long propostaId);

    @ApiOperation("Cadastra uma proposta")
    @ApiResponses({
            @ApiResponse(code = 201, message = "Proposta cadastrada"),
    })
    PropostaModel adicionar(
            @ApiParam(name = "corpo", value = "Representação de uma nova proposta", required = true)
                    PropostaInput propostaInput);

    @ApiOperation("Atualiza uma cozinha por ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Cozinha atualizada"),
            @ApiResponse(code = 404, message = "Cozinha não encontrada", response = Problem.class)
    })
    PropostaModel atualizar(
            @ApiParam(value = "ID de uma proposta", example = "1", required = true)
                    Long propostaId,

            @ApiParam(name = "corpo", value = "Representação de uma proposta com os novos dados",
                    required = true)
                    PropostaInput propostaInput);
}