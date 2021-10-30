package com.betha.ouvidoria.ouvidoria.repository;

import com.betha.ouvidoria.ouvidoria.model.SetorOrgao;
import com.betha.ouvidoria.ouvidoria.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
