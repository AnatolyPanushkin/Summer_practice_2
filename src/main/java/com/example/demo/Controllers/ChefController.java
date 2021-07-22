package com.example.demo.Controllers;
import com.example.demo.models.Chef;
import com.example.demo.models.FryingPan;
import com.example.demo.repositories.ChefRepository;
import com.example.demo.repositories.FryingPanRepository;
import org.springframework.web.bind.annotation.*;
@RestController
public class ChefController {
    private final ChefRepository repository;

    ChefController(ChefRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/Chef")
    Iterable<Chef> all() {
        return repository.findAll();
    }

    @PostMapping("/Chef")
    Chef newChef(@RequestBody Chef newChef) {
        return repository.save(newChef);
    }

    @GetMapping("/Chef/{id}")
    Chef one(@PathVariable Integer id) {

        return repository.findById(id)
                .orElseThrow(() -> new ChefNotFoundException(id));
    }

    @DeleteMapping("/Chef/{id}")
    void deleteChef(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
