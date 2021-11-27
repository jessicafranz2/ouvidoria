package com.betha.ouvidoria.ouvidoria.repository;


import com.betha.ouvidoria.ouvidoria.model.Denuncia;
import com.betha.ouvidoria.ouvidoria.model.Elogio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElogioRepository extends JpaRepository<Elogio, Long> {
}
