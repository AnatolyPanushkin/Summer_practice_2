package com.example.demo.services;

import com.example.demo.models.Chef;
import com.example.demo.models.Material;
import com.example.demo.models.FryingPan;

import java.util.List;

public interface FryingPanService {
    void save(FryingPan fryingPan);
    void expel(FryingPan fryingPan);
    void expel(int id);
    List<FryingPan> findByMaterial(Material material);
    List<FryingPan> findByChef(Chef chef);
}

