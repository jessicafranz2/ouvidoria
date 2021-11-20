package com.betha.ouvidoria.ouvidoria.model;

import com.betha.ouvidoria.ouvidoria.enterprise.AbstractEntity;
import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reclamacao extends AbstractEntity {
    @NotNull
    @ManyToOne
    @JoinColumn(name = "I_SETORORGAO", referencedColumnName = "ID")
    private SetorOrgao setorOrgao;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "I_ASSUNTOS", referencedColumnName = "ID")
    private Assunto assunto;
    private String descricao;

    public Reclamacao() {
        this.setorOrgao = setorOrgao;
        this.assunto = assunto;
        this.descricao = descricao;
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
}
