package com.betha.ouvidoria.ouvidoria.model;

import com.betha.ouvidoria.ouvidoria.enterprise.AbstractEntity;
import com.betha.ouvidoria.ouvidoria.enterprise.AbstractRegion;

import javax.persistence.Entity;

@Entity
public class Assunto extends AbstractEntity {
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
