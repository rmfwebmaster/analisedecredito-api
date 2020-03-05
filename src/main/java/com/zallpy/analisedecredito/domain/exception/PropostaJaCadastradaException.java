package com.zallpy.analisedecredito.domain.exception;

public class PropostaJaCadastradaException extends EntidadeNaoEncontradaException {

    private static final long serialVersionUID = 1L;

    public PropostaJaCadastradaException(String mensagem) {
        super(mensagem);
    }
}