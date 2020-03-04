package com.zallpy.analisedecredito.domain.exception;

public class PropostaNaoEncontradaException extends EntidadeNaoEncontradaException {

    private static final long serialVersionUID = 1L;

    public PropostaNaoEncontradaException(String mensagem) {
        super(mensagem);
    }

    public PropostaNaoEncontradaException(Long propostaId) {
        this(String.format("Não existe uma proposta para o código %d", propostaId));
    }

}