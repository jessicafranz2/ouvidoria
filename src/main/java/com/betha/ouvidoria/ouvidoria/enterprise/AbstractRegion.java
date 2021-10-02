package com.betha.ouvidoria.ouvidoria.enterprise;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractRegion extends AbstractEntity {

    @Column(name= "NOME")
    private String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "AbstractRegion{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

