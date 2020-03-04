package com.zallpy.analisedecredito.api.assembler;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zallpy.analisedecredito.api.model.PropostaModel;
import com.zallpy.analisedecredito.domain.model.Proposta;

@Component
public class PropostaModelAssembler {

    @Autowired
    private ModelMapper modelMapper;

    public PropostaModel toModel(Proposta proposta) {
        return modelMapper.map(proposta, PropostaModel.class);
    }

    public List<PropostaModel> toCollectionModel(Collection<Proposta> propostas) {
        return propostas.stream()
                .map(proposta -> toModel(proposta))
                .collect(Collectors.toList());
    }

}
