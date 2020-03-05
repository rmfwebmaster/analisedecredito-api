package com.zallpy.analisedecredito.domain.service.analise;

import com.zallpy.analisedecredito.domain.model.Proposta;

import java.math.BigDecimal;

public class RegraSete implements RegraDeCreditoInterface {

    public static final String REPROVADO_PELA_POLITICA_DE_CREDITO = "reprovado pela política de crédito";

    @Override
    public Boolean RegraAplicavel(Proposta proposta) {

        Long idade = proposta.getIdade();
        String estadoCivil = proposta.getEstadoCivil();
        Long dependentes = proposta.getDependentes();
        BigDecimal renda = proposta.getRenda();

        return idade >= 16 && renda.intValue() >= 1500 && renda.intValue() <= 2000 && dependentes >= 1 &&
                dependentes < 3 && (estadoCivil == "divorciado(a)" || estadoCivil == "viúvo(a)");
    }

    @Override
    public void AplicarRegra(Proposta proposta) {
        proposta.setResultadoAnalise(false);
        proposta.setLimite(REPROVADO_PELA_POLITICA_DE_CREDITO);
    }
}
