package com.zallpy.analisedecredito.domain.service.analise;

import com.zallpy.analisedecredito.domain.model.Proposta;

import java.math.BigDecimal;

public class RegraOito implements RegraDeCreditoInterface {

    public static final String ENTRE_100_500 = "entre 100 - 500";

    @Override
    public Boolean RegraAplicavel(Proposta proposta) {
        Long idade = proposta.getIdade();
        Long dependentes = proposta.getDependentes();
        String estadoCivil = proposta.getEstadoCivil();
        BigDecimal renda = proposta.getRenda();

        return idade.intValue() >= 16 && renda.intValue() > 1000 && renda.intValue() <= 2500 && estadoCivil.equals("solteiro") && dependentes.intValue() > 0 && dependentes.intValue() <= 2;
    }

    @Override
    public void AplicarRegra(Proposta proposta) {
        proposta.setResultadoAnalise(true);
        proposta.setLimite(ENTRE_100_500);
    }
}
