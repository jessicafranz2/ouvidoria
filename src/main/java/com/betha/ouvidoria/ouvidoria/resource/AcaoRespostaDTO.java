package com.betha.ouvidoria.ouvidoria.resource;

import com.betha.ouvidoria.ouvidoria.model.AcaoResposta;
import com.betha.ouvidoria.ouvidoria.model.Pais;

public class AcaoRespostaDTO {
    private Long id;
    private String tipoResposta;

    public Long getId() {
        return id;
    }
//teste
    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoResposta() {
        return tipoResposta;
    }

    public void setTipoResposta(String tipoResposta) {
        this.tipoResposta = tipoResposta;
    }

    public static AcaoRespostaDTO toDTO(AcaoResposta acaoResposta){
        AcaoRespostaDTO dto = new AcaoRespostaDTO();
        dto.setId(acaoResposta.getId());
        dto.setTipoResposta(acaoResposta.getTipoResposta());
        return dto;
    }

    public static AcaoResposta fromDTO(AcaoRespostaDTO dto){
        AcaoResposta entity = new Pais();
        entity.setId(dto.getId());
        entity.setTipoResposta(dto.getTipoResposta());
        return  entity;
    }
}
