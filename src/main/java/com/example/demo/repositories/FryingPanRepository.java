package com.example.demo.repositories;

import com.example.demo.models.Chef;
import com.example.demo.models.Material;
import com.example.demo.models.FryingPan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FryingPanRepository extends CrudRepository<FryingPan, Integer> {
    List<FryingPan> findByMaterial(Material material);
    List<FryingPan> findByChef(Chef chef);
}

