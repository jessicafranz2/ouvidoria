package com.betha.ouvidoria.ouvidoria.resource;

import com.betha.ouvidoria.ouvidoria.model.*;

public class SolicitacaoDTO {
    private Long id;
    private SetorOrgao setorOrgao;
    private Assunto assunto;
    private String descricao;

    public SolicitacaoDTO() {
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

    public static SolicitacaoDTO toDTO(Solicitacao solicitacao){
        SolicitacaoDTO dto = new SolicitacaoDTO();
        dto.setId(solicitacao.getId());
        dto.setSetorOrgao(solicitacao.getSetorOrgao());
        dto.setAssunto(solicitacao.getAssunto());
        dto.setDescricao(solicitacao.getDescricao());
        return dto;
    }

    public static Solicitacao fromDTO(SolicitacaoDTO dto){
        Solicitacao entity = new Solicitacao();
        entity.setId(dto.getId());
        entity.setSetorOrgao(dto.getSetorOrgao());
        entity.setAssunto(dto.getAssunto());
        entity.setDescricao(dto.getDescricao());
        return  entity;
    }
}
