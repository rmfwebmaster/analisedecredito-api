package com.zallpy.analisedecredito.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zallpy.analisedecredito.domain.exception.PropostaNaoEncontradaException;
import com.zallpy.analisedecredito.domain.exception.PropostaJaCadastradaException;

import com.zallpy.analisedecredito.domain.model.Proposta;
import com.zallpy.analisedecredito.domain.repository.PropostaRepository;
import com.zallpy.analisedecredito.domain.service.analise.AnaliseDeCredito;

import java.util.List;
import java.util.Optional;


@Service
public class CadastroPropostaService {

    private final PropostaRepository propostaRepository;

    @Autowired
    public CadastroPropostaService(PropostaRepository propostaRepository) {
        this.propostaRepository = propostaRepository;
    }

    @Transactional
    public Proposta salvar(Proposta proposta) {

        Optional<Proposta> propostaAtual = propostaRepository.findByCpf(proposta.getCpf());

        if (propostaAtual.isPresent()) {
            throw new PropostaJaCadastradaException("Já existe proposta cadastrada com o CPF '"+ proposta.getCpf() +"'");
        }

        proposta.setId(null);

        AnaliseDeCredito.analiseDeCredito(proposta);
        return propostaRepository.save(proposta);

    }

    public Proposta buscarPorCpfOuFalhar(String cpf) {
        return propostaRepository.findByCpf(cpf)
                .orElseThrow(() -> new PropostaNaoEncontradaException("Não existe uma proposta para este CPF"));
    }

    public List<Proposta> listarTodas() {
        return propostaRepository.findAll();
    }

}