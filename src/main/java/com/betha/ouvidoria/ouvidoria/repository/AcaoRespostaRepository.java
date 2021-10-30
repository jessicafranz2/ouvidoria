package com.betha.ouvidoria.ouvidoria.repository;

import com.betha.ouvidoria.ouvidoria.model.AcaoResposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AcaoRespostaRepository extends JpaRepository<AcaoResposta, Long> {
    List<AcaoResposta> findByNome(String tipoResposta);
}
