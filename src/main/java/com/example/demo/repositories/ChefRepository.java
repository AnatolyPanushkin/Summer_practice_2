package com.example.demo.repositories;

import com.example.demo.models.Chef;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChefRepository extends CrudRepository<Chef,Integer> {

}
