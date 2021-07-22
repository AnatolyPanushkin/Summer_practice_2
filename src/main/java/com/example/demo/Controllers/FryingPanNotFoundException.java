package com.example.demo.Controllers;

class FryingPanNotFoundException extends RuntimeException{
    FryingPanNotFoundException(Integer id) {
        super("Could not find student " + id);
    }
}
