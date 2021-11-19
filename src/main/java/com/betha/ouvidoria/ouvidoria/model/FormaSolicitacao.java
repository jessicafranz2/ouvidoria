package com.betha.ouvidoria.ouvidoria.model;

import com.betha.ouvidoria.ouvidoria.enterprise.AbstractRegion;

import javax.persistence.Entity;

@Entity
public class FormaSolicitacao extends AbstractRegion {
    //private Integer id;
    private String tipoSolicitacao;

    public FormaSolicitacao(String tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
    }

    public String getTipoSolicitacao() {
        return tipoSolicitacao;
    }

    public void setTipoSolicitacao(String tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
    }
}
