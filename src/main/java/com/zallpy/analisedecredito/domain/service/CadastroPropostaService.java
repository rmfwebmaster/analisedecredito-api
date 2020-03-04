package com.zallpy.analisedecredito.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zallpy.analisedecredito.domain.exception.PropostaNaoEncontradaException;

import com.zallpy.analisedecredito.domain.model.Proposta;
import com.zallpy.analisedecredito.domain.repository.PropostaRepository;

import java.util.List;


@Service
public class CadastroPropostaService {

    private final PropostaRepository propostaRepository;

    @Autowired
    public CadastroPropostaService(PropostaRepository propostaRepository) {
        this.propostaRepository = propostaRepository;
    }

    @Transactional
    public Proposta salvar(Proposta proposta) {
        return propostaRepository.save(proposta);
    }

    public Proposta buscarOuFalhar(Long propostaId) {
        return propostaRepository.findById(propostaId)
                .orElseThrow(() -> new PropostaNaoEncontradaException(propostaId));
    }

    public Proposta buscarPorCpfOuFalhar(String cpf) {
        return propostaRepository.findByCpf(cpf)
                .orElseThrow(() -> new PropostaNaoEncontradaException("Não existe uma proposta para este CPF"));
    }

    public Proposta listarTodas() {
        return propostaRepository.findAll();
    }

}