package com.zallpy.analisedecredito.domain.exception;

public class PropostaNaoEncontradaException extends EntidadeNaoEncontradaException {

    private static final long serialVersionUID = 1L;

    public PropostaNaoEncontradaException(String mensagem) {
        super(mensagem);
    }
}