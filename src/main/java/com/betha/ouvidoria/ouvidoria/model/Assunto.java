package com.betha.ouvidoria.ouvidoria.model;

import com.betha.ouvidoria.ouvidoria.enterprise.AbstractRegion;

import javax.persistence.Entity;

@Entity
public class Assunto extends AbstractRegion {
    //private Integer id;
    private String descricaoAssunto;

    public Assunto(String descricaoAssunto) {
        this.descricaoAssunto = descricaoAssunto;
    }

    public String getDescricaoAssunto() {
        return descricaoAssunto;
    }

    public void setDescricaoAssunto(String descricaoAssunto) {
        this.descricaoAssunto = descricaoAssunto;
    }
}
