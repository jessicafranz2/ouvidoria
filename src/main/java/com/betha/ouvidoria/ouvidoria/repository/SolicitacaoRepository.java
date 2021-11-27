package com.betha.ouvidoria.ouvidoria.repository;


import com.betha.ouvidoria.ouvidoria.model.Denuncia;
import com.betha.ouvidoria.ouvidoria.model.Solicitacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {
}
