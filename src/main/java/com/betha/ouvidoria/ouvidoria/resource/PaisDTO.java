package com.betha.ouvidoria.ouvidoria.resource;

import com.betha.ouvidoria.ouvidoria.model.Pais;

public class PaisDTO {

    private Long id;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //teste

    public static PaisDTO toDTO(Pais pais){
        PaisDTO dto = new PaisDTO();
        dto.setId(pais.getId());
        dto.setNome(pais.getNome());
        return dto;
    }

    public static Pais fromDTO(PaisDTO dto){
        Pais entity = new Pais();
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        return  entity;
    }
}
