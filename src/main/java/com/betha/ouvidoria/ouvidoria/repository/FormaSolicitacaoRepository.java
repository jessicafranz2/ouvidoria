package com.betha.ouvidoria.ouvidoria.repository;

import com.betha.ouvidoria.ouvidoria.model.Estado;
import com.betha.ouvidoria.ouvidoria.model.FormaSolicitacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FormaSolicitacaoRepository extends JpaRepository<FormaSolicitacao, Long>{

}
