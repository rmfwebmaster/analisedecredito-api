package com.zallpy.analisedecredito.domain.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zallpy.analisedecredito.domain.model.Proposta;

@Repository
public interface PropostaRepository extends JpaRepository<Proposta, Long> {
    List<Proposta> findAll();

    Optional<Proposta> findByCpf(String cpf);
}