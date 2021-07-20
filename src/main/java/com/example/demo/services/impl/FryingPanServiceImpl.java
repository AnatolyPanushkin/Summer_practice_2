package com.example.demo.services.impl;

import com.example.demo.models.Chef;
import com.example.demo.models.Material;
import com.example.demo.models.FryingPan;
import com.example.demo.repositories.FryingPanRepository;
import com.example.demo.services.FryingPanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class FryingPanServiceImpl implements FryingPanService {

    @Autowired
    private FryingPanRepository fryingPanRepository;

    @Override
    public void save(FryingPan fryingPan) {
        fryingPanRepository.save(fryingPan);
    }

    @Override
    public void expel(FryingPan fryingPan) {
        fryingPanRepository.delete(fryingPan);
    }

    @Override
    public void expel(int id) {
        fryingPanRepository.deleteById(id);
    }

    @Override
    public List<FryingPan> findByMaterial(Material material) {
        return fryingPanRepository.findByMaterial(material);
    }

    @Override
    public List<FryingPan> findByChef(Chef chef){return fryingPanRepository.findByChef(chef);}
}

