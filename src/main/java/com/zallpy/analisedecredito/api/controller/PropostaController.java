package com.zallpy.analisedecredito.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.zallpy.analisedecredito.api.assembler.PropostaInputDisassembler;
import com.zallpy.analisedecredito.api.assembler.PropostaModelAssembler;
import com.zallpy.analisedecredito.api.model.PropostaModel;
import com.zallpy.analisedecredito.api.model.input.PropostaInput;
import com.zallpy.analisedecredito.api.openapi.controller.PropostaControllerOpenApi;
import com.zallpy.analisedecredito.domain.model.Proposta;
import com.zallpy.analisedecredito.domain.repository.PropostaRepository;
import com.zallpy.analisedecredito.domain.service.CadastroPropostaService;

import java.util.List;

@RestController
@RequestMapping(value = "/propostas", produces = MediaType.APPLICATION_JSON_VALUE)
public class PropostaController implements PropostaControllerOpenApi {
    @Autowired
    private PropostaRepository propostaRepository;

    @Autowired
    private CadastroPropostaService cadastroProposta;

    @Autowired
    private PropostaModelAssembler propostaModelAssembler;

    @Autowired
    private PropostaInputDisassembler propostaInputDisassembler;

//    @Override
    @GetMapping
    public List<PropostaModel> listar() {
        List<Proposta> todasPropostas = propostaRepository.findAll();

        return propostaModelAssembler.toCollectionModel(todasPropostas);
    }
    @Override
    @GetMapping("/{propostaId}")
    public PropostaModel buscar(@PathVariable Long propostaId) {
        Proposta proposta = cadastroProposta.buscarOuFalhar(propostaId);

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
