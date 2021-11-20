package com.betha.ouvidoria.ouvidoria.resource;
import com.betha.ouvidoria.ouvidoria.model.Assunto;
import com.betha.ouvidoria.ouvidoria.model.Denuncia;
import com.betha.ouvidoria.ouvidoria.model.FormaSolicitacao;
import com.betha.ouvidoria.ouvidoria.model.Pais;
import com.betha.ouvidoria.ouvidoria.repository.AssuntoRepository;
import com.betha.ouvidoria.ouvidoria.repository.DenunciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api/assunto")
public class AssuntoController {

    @Autowired
    private AssuntoRepository repository;

    @GetMapping
    public List<Object> getAssunto() {
        return repository.findAll().stream().map(p -> AssuntoDTO.toDTO(p)).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public AssuntoDTO getAssuntoId(@PathVariable(value = "id") Long assuntoId) throws EntityNotFoundException {

        Assunto assuntoFind = repository.findById(assuntoId)
                .orElseThrow(() -> new EntityNotFoundException("Assunto não encontrado com ID :: " + assuntoId));

        return AssuntoDTO.toDTO(assuntoFind);
    }


    @PostMapping
    public AssuntoDTO create(@RequestBody Assunto assunto) {
        return AssuntoDTO.toDTO(repository.save(assunto));
    }


    @PutMapping("/{id}")
    public Assunto update(@PathVariable(value = "id") Long assuntoId,
                           @RequestBody Assunto assunto) throws EntityNotFoundException {
        Assunto assuntoFind = repository.findById(assuntoId)
                .orElseThrow(() -> new EntityNotFoundException("Assunto não encontrado com ID :: " + assuntoId));
        assuntoFind.setId(assunto.getId());
        assuntoFind.setDescricaoAssunto(assunto.getDescricaoAssunto());

        return repository.save(assuntoFind);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long assuntoId) throws EntityNotFoundException {
        Assunto assuntoFind = repository.findById(assuntoId)
                .orElseThrow(() -> new EntityNotFoundException("Assunto não encontrado com ID :: " + assuntoId));

        repository.delete(assuntoFind);

        return ResponseEntity.noContent().build();
    }
}
