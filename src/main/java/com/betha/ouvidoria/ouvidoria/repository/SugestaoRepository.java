package com.betha.ouvidoria.ouvidoria.repository;


import com.betha.ouvidoria.ouvidoria.model.Denuncia;
import com.betha.ouvidoria.ouvidoria.model.Sugestao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SugestaoRepository extends JpaRepository<Sugestao, Long> {
}
