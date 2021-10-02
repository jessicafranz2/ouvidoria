package Resource;

import com.betha.ouvidoria.ouvidoria.model.Pais;
import com.betha.ouvidoria.ouvidoria.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/paises")
public class PaisController {

    @Autowired
    private PaisRepository repository;

    @GetMapping
    public List<Pais> getPaises() {
        return repository.findAll().stream().map(p-> new Pais(p)).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public Pais getPaisesId(@PathVariable(value = "id") Long paisId) throws EntityNotFoundException {

        Pais paisFind = repository.findById(paisId)
                .orElseThrow(() -> new EntityNotFoundException("Pais não encontrado com ID :: " + paisId));

        return Pais(paisFind);
    }


    @PostMapping
    public Pais create(@RequestBody Pais pais) {
        return Pais(repository.save(pais));
    }


    @PutMapping("/{id}")
    public Pais update(@PathVariable(value = "id") Long paisId,
                       @RequestBody Pais pais) throws EntityNotFoundException {
        Pais paisFind = repository.findById(paisId)
                .orElseThrow(() -> new EntityNotFoundException("Pais não encontrado com ID :: " + paisId));
        paisFind.setId(pais.getId());
        paisFind.setNome(pais.getNome());

        return repository.save(paisFind);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long paisId) throws EntityNotFoundException {
        Pais paisFind = repository.findById(paisId)
                .orElseThrow(() -> new EntityNotFoundException("Pais não encontrado com ID :: " + paisId));

        repository.delete(paisFind);

        return ResponseEntity.noContent().build();
    }

}

