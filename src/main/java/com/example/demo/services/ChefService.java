package com.example.demo.services;

import com.example.demo.models.Chef;

public interface ChefService {
    void add(Chef chef);
    Chef findChef(int id);
}
