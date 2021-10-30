package com.betha.ouvidoria.ouvidoria.repository;

import com.betha.ouvidoria.ouvidoria.model.Assunto;
import com.betha.ouvidoria.ouvidoria.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
