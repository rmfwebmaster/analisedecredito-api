package com.zallpy.analisedecredito.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zallpy.analisedecredito.domain.exception.PropostaNaoEncontradaException;
import com.zallpy.analisedecredito.domain.exception.EntidadeEmUsoException;
import com.zallpy.analisedecredito.domain.model.Proposta;
import com.zallpy.analisedecredito.domain.repository.PropostaRepository;

@Service
public class CadastroPropostaService {

    @Autowired
    private PropostaRepository propostaRepository;

    @Transactional
    public Proposta salvar(Proposta proposta) {
        return propostaRepository.save(proposta);
    }

    public Proposta buscarOuFalhar(Long propostaId) {
        return propostaRepository.findById(propostaId)
                .orElseThrow(() -> new PropostaNaoEncontradaException(propostaId));
    }

}