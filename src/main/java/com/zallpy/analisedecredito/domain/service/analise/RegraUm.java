package com.zallpy.analisedecredito.domain.service.analise;

import com.zallpy.analisedecredito.domain.model.Proposta;

import java.math.BigDecimal;

public class RegraUm implements RegraDeCreditoInterface {

    public static final String ENTRE_100_500 = "entre 100 - 500";

    @Override
    public Boolean RegraAplicavel(Proposta proposta) {

        Long idade = proposta.getIdade();
        String estadoCivil = proposta.getEstadoCivil();
        Long dependentes = proposta.getDependentes();
        BigDecimal renda = proposta.getRenda();

        return estadoCivil.equals("solteiro") && idade.intValue() >= 16 && renda.intValue() >=1000 && renda.intValue() < 2500 && dependentes.intValue() == 0;
    }

    @Override
    public void AplicarRegra(Proposta proposta) {
        proposta.setResultadoAnalise(true);
        proposta.setLimite(ENTRE_100_500);
    }
}
