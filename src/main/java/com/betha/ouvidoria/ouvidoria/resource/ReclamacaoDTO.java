package com.betha.ouvidoria.ouvidoria.resource;

import com.betha.ouvidoria.ouvidoria.model.Assunto;
import com.betha.ouvidoria.ouvidoria.model.Reclamacao;
import com.betha.ouvidoria.ouvidoria.model.SetorOrgao;

public class ReclamacaoDTO {
    private Long id;
    private SetorOrgao setorOrgao;
    private Assunto assunto;
    private String descricao;

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

    public static ReclamacaoDTO toDTO(Reclamacao reclamacao){
        ReclamacaoDTO dto = new ReclamacaoDTO();
        dto.setId(reclamacao.getId());
        dto.setSetorOrgao(reclamacao.getSetorOrgao());
        dto.setAssunto(reclamacao.getAssunto());
        dto.setDescricao(reclamacao.getDescricao());
        return dto;
    }

    public static Reclamacao fromDTO(ReclamacaoDTO dto){
        Reclamacao entity = new Reclamacao();
        entity.setId(dto.getId());
        entity.setSetorOrgao(dto.getSetorOrgao());
        entity.setAssunto(dto.getAssunto());
        entity.setDescricao(dto.getDescricao());
        return  entity;
    }
}
