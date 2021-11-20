package com.betha.ouvidoria.ouvidoria.resource;

import com.betha.ouvidoria.ouvidoria.model.Assunto;
import com.betha.ouvidoria.ouvidoria.model.Denuncia;
import com.betha.ouvidoria.ouvidoria.model.Pais;
import com.betha.ouvidoria.ouvidoria.model.SetorOrgao;

public class DenunciaDTO {
    private Long id;
    private SetorOrgao setorOrgao;
    private Assunto assunto;
    private String descricao;

    public DenunciaDTO() {
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

    public static DenunciaDTO toDTO(Denuncia denuncia){
        DenunciaDTO dto = new DenunciaDTO();
        dto.setId(denuncia.getId());
        dto.setSetorOrgao(denuncia.getSetorOrgao());
        dto.setAssunto(denuncia.getAssunto());
        dto.setDescricao(denuncia.getDescricao());
        return dto;
    }

    public static Denuncia fromDTO(DenunciaDTO dto){
        Denuncia entity = new Denuncia();
        entity.setId(dto.getId());
        entity.setSetorOrgao(dto.getSetorOrgao());
        entity.setAssunto(dto.getAssunto());
        entity.setDescricao(dto.getDescricao());
        return  entity;
    }
}
