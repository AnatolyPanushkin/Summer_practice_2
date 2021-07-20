package com.example.demo.services.impl;

import com.example.demo.models.Chef;
import com.example.demo.repositories.ChefRepository;
import com.example.demo.services.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ChefServiceImpl implements ChefService {
    @Autowired
    private ChefRepository chefRepository;

    @Override
    public void add(Chef chef){chefRepository.save(chef);}

    @Override
    public Chef findChef(int id){return chefRepository.findById(id).get();}

}
