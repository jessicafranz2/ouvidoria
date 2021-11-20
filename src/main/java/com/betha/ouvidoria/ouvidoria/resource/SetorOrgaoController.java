package com.betha.ouvidoria.ouvidoria.resource;

import com.betha.ouvidoria.ouvidoria.model.Reclamacao;
import com.betha.ouvidoria.ouvidoria.model.SetorOrgao;
import com.betha.ouvidoria.ouvidoria.repository.SetorOrgaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/setor-orgao")
public class SetorOrgaoController {
    @Autowired
    private SetorOrgaoRepository repository;
//t
    @GetMapping
    public List<SetorOrgaoDTO> getSetorOrgaos() {
        return repository.findAll().stream().map(p-> SetorOrgaoDTO.toDTO(p)).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public SetorOrgaoDTO getSetorOrgaosId(@PathVariable(value = "id") Long setorOrgaoId) throws EntityNotFoundException {

        SetorOrgao setorOrgaoFind = repository.findById(setorOrgaoId)
                .orElseThrow(() -> new EntityNotFoundException("Setor Orgão não encontrado com ID :: " + setorOrgaoId));

        return SetorOrgaoDTO.toDTO(setorOrgaoFind);
    }


    @PostMapping
    public SetorOrgaoDTO create(@RequestBody SetorOrgao setorOrgao) {
        return SetorOrgaoDTO.toDTO(repository.save(setorOrgao));
    }



    @PutMapping("/{id}")
    public SetorOrgao update(@PathVariable(value = "id") Long setorOrgaoId,
                       @RequestBody SetorOrgao setorOrgao) throws EntityNotFoundException {
        SetorOrgao setorOrgaoFind = repository.findById(setorOrgaoId)
                .orElseThrow(() -> new EntityNotFoundException("Setor Orgão não encontrado com ID :: " + setorOrgaoId));
        setorOrgaoFind.setId(setorOrgao.getId());
        setorOrgaoFind.setDepartamento(setorOrgao.getDepartamento());

        return repository.save(setorOrgaoFind);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long setorOrgaoId) throws EntityNotFoundException {
        SetorOrgao setorOrgaoFind = repository.findById(setorOrgaoId)
                .orElseThrow(() -> new EntityNotFoundException("Setor Orgão não encontrado com ID :: " + setorOrgaoId));

        repository.delete(setorOrgaoFind);

        return ResponseEntity.noContent().build();
    }
}
