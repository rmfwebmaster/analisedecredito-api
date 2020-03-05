package com.zallpy.analisedecredito.domain.service.analise;

import com.zallpy.analisedecredito.domain.model.Proposta;

import java.math.BigDecimal;

public class RegraSeis implements RegraDeCreditoInterface {

    public static final String RENDA_BAIXA = "renda baixa";

    @Override
    public Boolean RegraAplicavel(Proposta proposta) {
        BigDecimal renda = proposta.getRenda();

        return renda.intValue() <= 500;
    }

    @Override
    public void AplicarRegra(Proposta proposta) {
        proposta.setResultadoAnalise(false);
        proposta.setLimite(RENDA_BAIXA);
    }
}
