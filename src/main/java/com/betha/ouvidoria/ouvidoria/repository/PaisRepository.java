package com.betha.ouvidoria.ouvidoria.repository;


import com.betha.ouvidoria.ouvidoria.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {
    List<Pais> findByNome(String nome);


}
