package com.zallpy.analisedecredito.domain.service.analise;

import com.zallpy.analisedecredito.domain.model.Proposta;

import java.math.BigDecimal;

public class RegraQuatro implements RegraDeCreditoInterface {

    public static final String ENTRE_1500_2000 = "entre 1500 - 2000";

    @Override
    public Boolean RegraAplicavel(Proposta proposta) {
        Long idade = proposta.getIdade();
        Long dependentes = proposta.getDependentes();
        String estadoCivil = proposta.getEstadoCivil();
        BigDecimal renda = proposta.getRenda();

        return idade >= 16 && renda.intValue() == 8000 && dependentes == 3 && estadoCivil == "casado(a)";
    }

    @Override
    public void AplicarRegra(Proposta proposta) {
        proposta.setResultadoAnalise(true);
        proposta.setLimite(ENTRE_1500_2000);
    }
}
