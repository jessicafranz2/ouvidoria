package com.betha.ouvidoria.ouvidoria.repository;

import com.betha.ouvidoria.ouvidoria.model.Cidade;
import com.betha.ouvidoria.ouvidoria.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
