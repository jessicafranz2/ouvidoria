package com.betha.ouvidoria.ouvidoria.resource;

import com.betha.ouvidoria.ouvidoria.model.*;

public class ElogioDTO {
    private Long id;
    private SetorOrgao setorOrgao;
    private Assunto assunto;
    private String descricao;

    public void Elogio() {
        this.id = id;
        this.setorOrgao = setorOrgao;
        this.assunto = assunto;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SetorOrgao getSetorOrgao() {
        return setorOrgao;
    }

    public void setSetorOrgao(SetorOrgao setorOrgao) {
        this.setorOrgao = setorOrgao;
    }

    public Assunto getAssunto() {
        return assunto;
    }

    public void setAssunto(Assunto assunto) {
        this.assunto = assunto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static ElogioDTO toDTO(Elogio elogio){
        ElogioDTO dto = new ElogioDTO();
        dto.setId(elogio.getId());
        dto.setSetorOrgao(elogio.getSetorOrgao());
        dto.setAssunto(elogio.getAssunto());
        dto.setDescricao(elogio.getDescricao());
        return dto;
    }

    public static Elogio fromDTO(ElogioDTO dto){
        Elogio entity = new Elogio();
        entity.setId(dto.getId());
        entity.setSetorOrgao(dto.getSetorOrgao());
        entity.setAssunto(dto.getAssunto());
        entity.setDescricao(dto.getDescricao());
        return  entity;
    }
}
