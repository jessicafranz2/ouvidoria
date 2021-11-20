package com.betha.ouvidoria.ouvidoria.resource;
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
@RequestMapping("/api/denuncia")
public class DenunciaController {

    @Autowired
    private DenunciaRepository repository;

    @GetMapping
    public List<Object> getDenuncia() {
        return repository.findAll().stream().map(p -> DenunciaDTO.toDTO(p)).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public DenunciaDTO getDenunciaId(@PathVariable(value = "id") Long denunciaId) throws EntityNotFoundException {

        Denuncia denunciaFind = repository.findById(denunciaId)
                .orElseThrow(() -> new EntityNotFoundException("Denuncia não encontrado com ID :: " + denunciaId));

        return DenunciaDTO.toDTO(denunciaFind);
    }


    @PostMapping
    public DenunciaDTO create(@RequestBody Denuncia denuncia) {
        return DenunciaDTO.toDTO(repository.save(denuncia));
    }


    @PutMapping("/{id}")
    public Denuncia update(@PathVariable(value = "id") Long denunciaId,
                       @RequestBody Denuncia denuncia) throws EntityNotFoundException {
        Denuncia denunciaFind = repository.findById(denunciaId)
                .orElseThrow(() -> new EntityNotFoundException("Denuncia não encontrado com ID :: " + denunciaId));
        denunciaFind.setId(denuncia.getId());
        denunciaFind.setNome(denuncia.getNome());

        return repository.save(denunciaFind);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long denunciaId) throws EntityNotFoundException {
        Denuncia denunciaFind = repository.findById(denunciaId)
                .orElseThrow(() -> new EntityNotFoundException("Denuncia não encontrado com ID :: " + denunciaId));

        repository.delete(denunciaFind);

        return ResponseEntity.noContent().build();
    }
}
