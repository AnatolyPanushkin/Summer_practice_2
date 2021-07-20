package com.example.demo.services;

import com.example.demo.models.Material;

public interface MaterialService {
    void save(Material material);
    Material findMaterial(int id);


}
