package com.betha.ouvidoria.ouvidoria.model;

import com.betha.ouvidoria.ouvidoria.enterprise.AbstractEntity;
import com.betha.ouvidoria.ouvidoria.enterprise.AbstractRegion;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Processo extends AbstractEntity {
    //private Integer id;
    private String status;
    private Date dataMovimento;

    public Processo(String status, Date dataMovimento) {
        this.status = status;
        this.dataMovimento = dataMovimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }
}
