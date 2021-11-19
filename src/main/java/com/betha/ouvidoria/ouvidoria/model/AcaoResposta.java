package com.betha.ouvidoria.ouvidoria.model;

import com.betha.ouvidoria.ouvidoria.enterprise.AbstractEntity;
import com.betha.ouvidoria.ouvidoria.enterprise.AbstractRegion;

import javax.persistence.Entity;

@Entity
public class AcaoResposta extends AbstractEntity {

    private String tipoResposta;

    public AcaoResposta(String tipoResposta) {
        this.tipoResposta = tipoResposta;
    }

    public String getTipoResposta() {
        return tipoResposta;
    }

    public void setTipoResposta(String tipoResposta) {
        this.tipoResposta = tipoResposta;
    }
}
