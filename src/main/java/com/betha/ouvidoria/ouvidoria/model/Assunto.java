package com.betha.ouvidoria.ouvidoria.model;

public class Assunto {
    private Integer id;
    private String descricaoAssunto;

    public Assunto(Integer id, String descricaoAssunto) {
        this.id = id;
        this.descricaoAssunto = descricaoAssunto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricaoAssunto() {
        return descricaoAssunto;
    }

    public void setDescricaoAssunto(String descricaoAssunto) {
        this.descricaoAssunto = descricaoAssunto;
    }
}
