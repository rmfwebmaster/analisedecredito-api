package com.zallpy.analisedecredito.domain.service.analise;

import com.zallpy.analisedecredito.domain.model.Proposta;

import java.math.BigDecimal;

public class RegraCinco implements RegraDeCreditoInterface {

    public static final String SUPERIOR_2000 = "superior 2000";

    @Override
    public Boolean RegraAplicavel(Proposta proposta) {

        Long idade = proposta.getIdade();
        Long dependentes = proposta.getDependentes();
        BigDecimal renda = proposta.getRenda();

        return idade >= 16 && renda.intValue() >= 8000 && renda.intValue() <= 10000 && dependentes >= 0 && dependentes <= 2;
    }

    @Override
    public void AplicarRegra(Proposta proposta) {
        proposta.setResultadoAnalise(true);
        proposta.setLimite(SUPERIOR_2000);
    }
}
