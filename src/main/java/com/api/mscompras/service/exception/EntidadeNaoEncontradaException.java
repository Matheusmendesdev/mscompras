package com.api.mscompras.service.exception;

public abstract class EntidadeNaoEncontradaException extends NegocioException{

    private static final Long serialVersion = 1L;
    public EntidadeNaoEncontradaException(String mensagem) {
        super(mensagem);
    }
}
