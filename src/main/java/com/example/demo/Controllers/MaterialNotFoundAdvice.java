package com.example.demo.Controllers;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice

public class MaterialNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(MaterialNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String MaterialNotFoundHandler(MaterialNotFoundException ex) {
        return ex.getMessage();
    }
}
