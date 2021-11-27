package com.betha.ouvidoria.ouvidoria.resource;

import com.betha.ouvidoria.ouvidoria.model.*;

public class SugestaoDTO {
    private Long id;
    private SetorOrgao setorOrgao;
    private Assunto assunto;
    private String descricao;

    public SugestaoDTO() {
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

    public static SugestaoDTO toDTO(Sugestao sugestao){
        SugestaoDTO dto = new SugestaoDTO();
        dto.setId(sugestao.getId());
        dto.setSetorOrgao(sugestao.getSetorOrgao());
        dto.setAssunto(sugestao.getAssunto());
        dto.setDescricao(sugestao.getDescricao());
        return dto;
    }

    public static Sugestao fromDTO(SugestaoDTO dto){
        Sugestao entity = new Sugestao();
        entity.setId(dto.getId());
        entity.setSetorOrgao(dto.getSetorOrgao());
        entity.setAssunto(dto.getAssunto());
        entity.setDescricao(dto.getDescricao());
        return  entity;
    }
}
