package com.zallpy.analisedecredito.domain.service.analise;

import com.zallpy.analisedecredito.domain.model.Proposta;

public interface RegraDeCreditoInterface {

    Boolean RegraAplicavel(Proposta proposta);
    void AplicarRegra(Proposta proposta);

}