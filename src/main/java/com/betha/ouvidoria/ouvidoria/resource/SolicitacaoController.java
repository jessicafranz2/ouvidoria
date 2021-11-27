package com.betha.ouvidoria.ouvidoria.resource;
import com.betha.ouvidoria.ouvidoria.model.Denuncia;
import com.betha.ouvidoria.ouvidoria.model.FormaSolicitacao;
import com.betha.ouvidoria.ouvidoria.model.Pais;
import com.betha.ouvidoria.ouvidoria.model.Solicitacao;
import com.betha.ouvidoria.ouvidoria.repository.DenunciaRepository;
import com.betha.ouvidoria.ouvidoria.repository.SolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api/solicitacao")
public class SolicitacaoController {

    @Autowired
    private SolicitacaoRepository repository;

    @GetMapping
    public List<Object> getSolicitacao() {
        return repository.findAll().stream().map(p -> SolicitacaoDTO.toDTO(p)).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public SolicitacaoDTO getSolicitacaoId(@PathVariable(value = "id") Long solicitacaoId) throws EntityNotFoundException {

        Solicitacao solicitacaoFind = repository.findById(solicitacaoId)
                .orElseThrow(() -> new EntityNotFoundException("Solicitação não encontrado com ID :: " + solicitacaoId));

        return SolicitacaoDTO.toDTO(solicitacaoFind);
    }


    @PostMapping
    public SolicitacaoDTO create(@RequestBody Solicitacao solicitacao) {
        return SolicitacaoDTO.toDTO(repository.save(solicitacao));
    }


    @PutMapping("/{id}")
    public Solicitacao update(@PathVariable(value = "id") Long solicitacaoId,
                           @RequestBody Solicitacao solicitacao) throws EntityNotFoundException {
        Solicitacao solicitacaoFind = repository.findById(solicitacaoId)
                .orElseThrow(() -> new EntityNotFoundException("Solicitação não encontrado com ID :: " + solicitacaoId));
        solicitacaoFind.setId(solicitacao.getId());
        solicitacaoFind.setNome(solicitacao.getNome());

        return repository.save(solicitacaoFind);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long solicitacaoId) throws EntityNotFoundException {
        Solicitacao solicitacaoFind = repository.findById(solicitacaoId)
                .orElseThrow(() -> new EntityNotFoundException("Solicitação não encontrado com ID :: " + solicitacaoId));

        repository.delete(solicitacaoFind);

        return ResponseEntity.noContent().build();
    }
}
