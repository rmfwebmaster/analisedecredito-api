package com.zallpy.analisedecredito.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.zallpy.analisedecredito.api.assembler.PropostaInputDisassembler;
import com.zallpy.analisedecredito.api.assembler.PropostaModelAssembler;
import com.zallpy.analisedecredito.api.model.PropostaModel;
import com.zallpy.analisedecredito.api.model.input.PropostaInput;
import com.zallpy.analisedecredito.api.openapi.controller.PropostaControllerOpenApi;
import com.zallpy.analisedecredito.domain.model.Proposta;
import com.zallpy.analisedecredito.domain.service.CadastroPropostaService;


@RestController
@RequestMapping(value = "v1/propostas", produces = MediaType.APPLICATION_JSON_VALUE)
public class PropostaController implements PropostaControllerOpenApi {

    private final CadastroPropostaService cadastroProposta;

    private final PropostaModelAssembler propostaModelAssembler;

    private final PropostaInputDisassembler propostaInputDisassembler;

    @Autowired
    public PropostaController(CadastroPropostaService cadastroProposta, PropostaModelAssembler propostaModelAssembler, PropostaInputDisassembler propostaInputDisassembler) {
        this.cadastroProposta = cadastroProposta;
        this.propostaModelAssembler = propostaModelAssembler;
        this.propostaInputDisassembler = propostaInputDisassembler;
    }

    @GetMapping
    public PropostaModel listar() {
        Proposta propostas = cadastroProposta.listarTodas();

        return propostaModelAssembler.toModel(propostas);
    }

    @Override
    @GetMapping("/{propostaId}")
    public PropostaModel buscarPorId(@PathVariable Long propostaId) {
        Proposta proposta = cadastroProposta.buscarOuFalhar(propostaId);

        return propostaModelAssembler.toModel(proposta);
    }

    @Override
    @GetMapping("/por-cpf")
    public PropostaModel buscarPorCpf(@RequestParam("cpf") String cpf) {
        Proposta proposta = cadastroProposta.buscarPorCpfOuFalhar(cpf);

        return propostaModelAssembler.toModel(proposta);
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PropostaModel adicionar(@RequestBody @Valid PropostaInput propostaInput) {
        Proposta proposta = propostaInputDisassembler.toDomainObject(propostaInput);
        proposta = cadastroProposta.salvar(proposta);

        return propostaModelAssembler.toModel(proposta);
    }

    @Override
    @PutMapping("/{propostaId}")
    public PropostaModel atualizar(@PathVariable Long propostaId,
                                  @RequestBody @Valid PropostaInput propostaInput) {
        Proposta propostaAtual = cadastroProposta.buscarOuFalhar(propostaId);
        propostaInputDisassembler.copyToDomainObject(propostaInput, propostaAtual);
        propostaAtual = cadastroProposta.salvar(propostaAtual);

        return propostaModelAssembler.toModel(propostaAtual);
    }

}
