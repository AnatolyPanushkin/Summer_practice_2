package com.example.demo.Controllers;
import com.example.demo.models.FryingPan;
import com.example.demo.repositories.FryingPanRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class FryingPanController {
    private final FryingPanRepository repository;

    FryingPanController(FryingPanRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/fryingPan")
    Iterable<FryingPan> all() {
        return repository.findAll();
    }

    @PostMapping("/fryingPan")
    FryingPan newFryingPan(@RequestBody FryingPan newFryingPan) {
        return repository.save(newFryingPan);
    }

    @GetMapping("/fryingPan/{id}")
    FryingPan one(@PathVariable Integer id) {

        return repository.findById(id)
                .orElseThrow(() -> new FryingPanNotFoundException(id));
    }

    @DeleteMapping("/fryingPan/{id}")
    void deleteFryingPan(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
