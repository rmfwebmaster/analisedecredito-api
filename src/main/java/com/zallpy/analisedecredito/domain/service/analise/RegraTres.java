package com.zallpy.analisedecredito.domain.service.analise;

import com.zallpy.analisedecredito.domain.model.Proposta;

import java.math.BigDecimal;

public class RegraTres implements RegraDeCreditoInterface {

    public static final String ENTRE_1000_1500 = "entre 1000 - 1500";

    @Override
    public Boolean RegraAplicavel(Proposta proposta) {
        Long idade = proposta.getIdade();
        Long dependentes = proposta.getDependentes();
        String estadoCivil = proposta.getEstadoCivil();
        BigDecimal renda = proposta.getRenda();

        return idade.intValue() >= 16 && idade.intValue() <= 61 && renda.intValue() >= 5000 && renda.intValue() <= 8000 && dependentes.intValue() >= 3 &&
                dependentes.intValue() <= 5 && estadoCivil.equals("casado");
    }

    @Override
    public void AplicarRegra(Proposta proposta) {
        proposta.setResultadoAnalise(true);
        proposta.setLimite(ENTRE_1000_1500);
    }
}
