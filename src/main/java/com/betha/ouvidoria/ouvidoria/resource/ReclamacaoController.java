package com.betha.ouvidoria.ouvidoria.resource;

import com.betha.ouvidoria.ouvidoria.model.Pais;
import com.betha.ouvidoria.ouvidoria.model.Reclamacao;
import com.betha.ouvidoria.ouvidoria.repository.PaisRepository;
import com.betha.ouvidoria.ouvidoria.repository.ReclamacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/reclamacao")
public class ReclamacaoController {
    @Autowired
    private ReclamacaoRepository repository;

    @GetMapping
    public List<ReclamacaoDTO> getReclamacoes() {
        return repository.findAll().stream().map(p-> ReclamacaoDTO.toDTO(p)).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public ReclamacaoDTO getReclamacoesId(@PathVariable(value = "id") Long reclamacaoId) throws EntityNotFoundException {

        Reclamacao reclamacaoFind = repository.findById(reclamacaoId)
                .orElseThrow(() -> new EntityNotFoundException("Reclamação não encontrado com ID :: " + reclamacaoId));

        return ReclamacaoDTO.toDTO(reclamacaoFind);
    }


    @PostMapping
    public ReclamacaoDTO create(@RequestBody Reclamacao reclamacao) {
        return ReclamacaoDTO.toDTO(repository.save(reclamacao));
    }



    @PutMapping("/{id}")
    public Reclamacao update(@PathVariable(value = "id") Long reclamacaoId,
                       @RequestBody Reclamacao reclamacao) throws EntityNotFoundException {
        Reclamacao reclamacaoFind = repository.findById(reclamacaoId)
                .orElseThrow(() -> new EntityNotFoundException("Reclamação não encontrado com ID :: " + reclamacaoId));
        reclamacaoFind.setId(reclamacao.getId());
        reclamacaoFind.setAssunto(reclamacao.getAssunto());

        return repository.save(reclamacaoFind);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long reclamacaoId) throws EntityNotFoundException {
        Reclamacao reclamacaoFind = repository.findById(reclamacaoId)
                .orElseThrow(() -> new EntityNotFoundException("Reclamação não encontrado com ID :: " + reclamacaoId));

        repository.delete(reclamacaoFind);

        return ResponseEntity.noContent().build();
    }
}
