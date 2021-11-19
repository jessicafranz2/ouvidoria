package com.betha.ouvidoria.ouvidoria.model;

import com.betha.ouvidoria.ouvidoria.enterprise.AbstractRegion;

import javax.persistence.Entity;

@Entity
public class SetorOrgao extends AbstractRegion {
//    private Integer id;
    private String departamento;

    public SetorOrgao(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
