package com.example.demo.Controllers;
import com.example.demo.models.Chef;
import com.example.demo.models.FryingPan;
import com.example.demo.models.Material;
import com.example.demo.repositories.ChefRepository;
import com.example.demo.repositories.FryingPanRepository;
import com.example.demo.repositories.MaterialRepository;
import org.springframework.web.bind.annotation.*;
@RestController

public class MaterialController {
    private final MaterialRepository repository;

    MaterialController(MaterialRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/Material")
    Iterable<Material> all() {
        return repository.findAll();
    }

    @PostMapping("/Material")
    Material newMaterial(@RequestBody Material newMaterial) {
        return repository.save(newMaterial);
    }

    @GetMapping("/Material/{id}")
    Material one(@PathVariable Integer id) {

        return repository.findById(id)
                .orElseThrow(() -> new MaterialNotFoundException(id));
    }

    @DeleteMapping("/Material/{id}")
    void deleteMaterial(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
