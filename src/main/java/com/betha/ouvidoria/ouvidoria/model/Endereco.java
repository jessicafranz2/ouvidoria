package com.betha.ouvidoria.ouvidoria.model;

import org.hibernate.cache.spi.support.AbstractRegion;

public class Endereco extends Cidade {
    private Cidade cidade;
    private String nome;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Endereco(Cidade cidade, String nome) {
        this.cidade = cidade;
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    //teste
}
