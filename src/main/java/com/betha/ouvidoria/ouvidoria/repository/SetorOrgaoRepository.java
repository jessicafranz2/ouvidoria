package com.betha.ouvidoria.ouvidoria.repository;

import com.betha.ouvidoria.ouvidoria.model.Processo;
import com.betha.ouvidoria.ouvidoria.model.SetorOrgao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SetorOrgaoRepository extends JpaRepository<SetorOrgao, Long> {

}
