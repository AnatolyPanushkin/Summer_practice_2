package com.example.demo.services.impl;

import com.example.demo.models.Material;
import com.example.demo.repositories.MaterialRepository;
import com.example.demo.services.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    private MaterialRepository materialRepository;

    @Override
    public void save(Material material) {
        materialRepository.save(material);
    }

    @Override
    public Material findMaterial(int id) {
        return materialRepository.findById(id).get();
    }
}
