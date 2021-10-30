package com.betha.ouvidoria.ouvidoria.resource;

import com.betha.ouvidoria.ouvidoria.model.AcaoResposta;
import com.betha.ouvidoria.ouvidoria.model.Pais;
import com.betha.ouvidoria.ouvidoria.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/acao-resposta")
public class AcaoRespostaController {
    @Autowired
    private PaisRepository repository;

    @GetMapping
    public List<AcaoRespostaDTO> getAcaoResposta() {
        return repository.findAll().stream().map(p-> AcaoRespostaDTO.toDTO(p)).collect(Collectors.toList());
    }
//teste

    @GetMapping("/{id}")
    public PaisDTO getAcaoRespostaId(@PathVariable(value = "id") Long paisId) throws EntityNotFoundException {

        AcaoResposta acaoRespostaFind = repository.findById(acaoRespostaId)
                .orElseThrow(() -> new EntityNotFoundException("Acão não encontrado com ID :: " + acaoRespostaId));

        return PaisDTO.toDTO(acaoRespostaFind);
    }


    @PostMapping
    public AcaoRespostaDTO create(@RequestBody AcaoResposta acaoResposta) {
        return AcaoRespostaDTO.toDTO(repository.save(acaoResposta));
    }



    @PutMapping("/{id}")
    public AcaoResposta update(@PathVariable(value = "id") Long acaoRespostaId,
                       @RequestBody AcaoResposta acaoResposta) throws EntityNotFoundException {
        AcaoResposta acaoRespostaFind = repository.findById(acaoRespostaId)
                .orElseThrow(() -> new EntityNotFoundException("AcaoResposta não encontrado com ID :: " + acaoRespostaId));
        acaoRespostaFind.setId(acaoResposta.getId());
        acaoRespostaFind.setTipoResposta(acaoResposta.getTipoResposta());

        return repository.save(acaoRespostaFind);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long paisId) throws EntityNotFoundException {
        AcaoResposta acaoRespostaFind = repository.findById(acaoRespostaId)
                .orElseThrow(() -> new EntityNotFoundException("AcaoResposta não encontrado com ID :: " + acaoRespostaId));

        repository.delete(acaoRespostaFind);

        return ResponseEntity.noContent().build();
    }
}
