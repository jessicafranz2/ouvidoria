package com.betha.ouvidoria.ouvidoria.model;

import org.hibernate.cache.spi.support.AbstractRegion;

public class Endereco extends Cidade {
    private Cidade cidade;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    //teste
}
