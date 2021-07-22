package com.example.demo.Controllers;

class MaterialNotFoundException extends RuntimeException{
    MaterialNotFoundException(Integer id) {
        super("Could not find student " + id);
    }
}
