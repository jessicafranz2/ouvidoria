package com.betha.ouvidoria.ouvidoria.resource;

import com.betha.ouvidoria.ouvidoria.model.Assunto;

import java.util.List;
import java.util.stream.Collector;

public class AssuntoDTO {
    private Long id;
    private String descricaoAssunto;

    public AssuntoDTO() {
        this.id = id;
        this.descricaoAssunto = descricaoAssunto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricaoAssunto() {
        return descricaoAssunto;
    }

    public void setDescricaoAssunto(String descricaoAssunto) {
        this.descricaoAssunto = descricaoAssunto;
    }

    public static AssuntoDTO toDTO(Assunto assunto){
        AssuntoDTO dto = new AssuntoDTO();
        dto.setId(assunto.getId());
        dto.setDescricaoAssunto(assunto.getDescricaoAssunto());
        return dto;
    }

    public static Assunto fromDTO(AssuntoDTO dto){
        Assunto entity = new Assunto();
        entity.setId(dto.getId());
        entity.setDescricaoAssunto(dto.getDescricaoAssunto());
        return  entity;
    }

    public void collect(Collector<Object,?, List<Object>> toList) {
    }
    }
