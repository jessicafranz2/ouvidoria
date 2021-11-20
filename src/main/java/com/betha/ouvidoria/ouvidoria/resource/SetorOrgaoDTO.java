package com.betha.ouvidoria.ouvidoria.resource;

import com.betha.ouvidoria.ouvidoria.model.Pais;
import com.betha.ouvidoria.ouvidoria.model.SetorOrgao;

public class SetorOrgaoDTO {

    private Long id;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //teste

    public static SetorOrgaoDTO toDTO(SetorOrgao setorOrgao){
        SetorOrgaoDTO dto = new SetorOrgaoDTO();
        dto.setId(setorOrgao.getId());
        dto.setNome(setorOrgao.getDepartamento());
        return dto;
    }

    public static SetorOrgao fromDTO(SetorOrgaoDTO dto){
        SetorOrgao entity = new SetorOrgao();
        entity.setId(dto.getId());
        entity.setDepartamento(dto.getNome());
        return  entity;
    }
}
