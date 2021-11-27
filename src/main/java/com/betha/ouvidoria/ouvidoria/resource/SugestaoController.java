package com.betha.ouvidoria.ouvidoria.resource;
import com.betha.ouvidoria.ouvidoria.model.Denuncia;
import com.betha.ouvidoria.ouvidoria.model.FormaSolicitacao;
import com.betha.ouvidoria.ouvidoria.model.Pais;
import com.betha.ouvidoria.ouvidoria.model.Sugestao;
import com.betha.ouvidoria.ouvidoria.repository.DenunciaRepository;
import com.betha.ouvidoria.ouvidoria.repository.SugestaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api/sugestao")
public class SugestaoController {

    @Autowired
    private SugestaoRepository repository;

    @GetMapping
    public List<Object> getSugestao() {
        return repository.findAll().stream().map(p -> SugestaoDTO.toDTO(p)).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public SugestaoDTO getSugestaoId(@PathVariable(value = "id") Long sugestaoId) throws EntityNotFoundException {

        Sugestao sugestaoFind = repository.findById(sugestaoId)
                .orElseThrow(() -> new EntityNotFoundException("Sugestão não encontrado com ID :: " + sugestaoId));

        return SugestaoDTO.toDTO(sugestaoFind);
    }


    @PostMapping
    public SugestaoDTO create(@RequestBody Sugestao sugestao) {
        return SugestaoDTO.toDTO(repository.save(sugestao));
    }


    @PutMapping("/{id}")
    public Sugestao update(@PathVariable(value = "id") Long sugestaoId,
                           @RequestBody Sugestao sugestao) throws EntityNotFoundException {
        Sugestao sugestaoFind = repository.findById(sugestaoId)
                .orElseThrow(() -> new EntityNotFoundException("Sugestão não encontrado com ID :: " + sugestaoId));
        sugestaoFind.setId(sugestao.getId());
        sugestaoFind.setNome(sugestao.getNome());

        return repository.save(sugestaoFind);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long sugestaoId) throws EntityNotFoundException {
        Sugestao sugestaoFind = repository.findById(sugestaoId)
                .orElseThrow(() -> new EntityNotFoundException("Sugestão não encontrado com ID :: " + sugestaoId));

        repository.delete(sugestaoFind);

        return ResponseEntity.noContent().build();
    }
}
