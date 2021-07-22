package com.example.demo.Controllers;

class ChefNotFoundException extends RuntimeException {
    ChefNotFoundException(Integer id) {
        super("Could not find student " + id);
    }
}
