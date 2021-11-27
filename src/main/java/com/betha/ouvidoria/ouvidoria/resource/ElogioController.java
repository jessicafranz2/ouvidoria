package com.betha.ouvidoria.ouvidoria.resource;
import com.betha.ouvidoria.ouvidoria.model.*;
import com.betha.ouvidoria.ouvidoria.repository.DenunciaRepository;
import com.betha.ouvidoria.ouvidoria.repository.ElogioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;
import com.betha.ouvidoria.ouvidoria.model.Denuncia;
import com.betha.ouvidoria.ouvidoria.model.FormaSolicitacao;
import com.betha.ouvidoria.ouvidoria.model.Pais;
import com.betha.ouvidoria.ouvidoria.repository.DenunciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api/elogio")
public class ElogioController {

    @Autowired
    private ElogioRepository repository;

    @GetMapping
    public List<Object> getElogio() {
        return repository.findAll().stream().map(p -> ElogioDTO.toDTO(p)).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public ElogioDTO getElogioId(@PathVariable(value = "id") Long elogioId) throws EntityNotFoundException {

        Elogio elogioFind = repository.findById(elogioId)
                .orElseThrow(() -> new EntityNotFoundException("Elogio não encontrado com ID :: " + elogioId));

        return ElogioDTO.toDTO(elogioFind);
    }


    @PostMapping
    public ElogioDTO create(@RequestBody Elogio elogio) {
        return ElogioDTO.toDTO(repository.save(elogio));
    }


    @PutMapping("/{id}")
    public Elogio update(@PathVariable(value = "id") Long elogioId,
                           @RequestBody Elogio elogio) throws EntityNotFoundException {
        Elogio elogioFind = repository.findById(elogioId)
                .orElseThrow(() -> new EntityNotFoundException("Elogio não encontrado com ID :: " + elogioId));
        elogioFind.setId(elogio.getId());
        elogioFind.setNome(elogio.getNome());

        return repository.save(elogioFind);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long elogioId) throws EntityNotFoundException {
        Elogio elogioFind = repository.findById(elogioId)
                .orElseThrow(() -> new EntityNotFoundException("Elogio não encontrado com ID :: " + elogioId));

        repository.delete(elogioFind);

        return ResponseEntity.noContent().build();
    }
}
