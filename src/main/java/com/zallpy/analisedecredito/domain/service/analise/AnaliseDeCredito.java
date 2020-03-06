package com.zallpy.analisedecredito.domain.service.analise;

import com.zallpy.analisedecredito.domain.model.Proposta;

import java.util.Arrays;
import java.util.List;

public class AnaliseDeCredito {

    static List<RegraDeCreditoInterface> regras = Arrays.asList(new RegraUm(), new RegraDois(), new RegraTres(),
            new RegraQuatro(), new RegraCinco(), new RegraSeis(), new RegraSete(), new RegraOito());

    public static Proposta analiseDeCredito(Proposta proposta) {

        for (RegraDeCreditoInterface regra : regras) {
            if (regra.RegraAplicavel(proposta)) {
                regra.AplicarRegra(proposta);
                break;
            }
        }

        return proposta;

    }

}
