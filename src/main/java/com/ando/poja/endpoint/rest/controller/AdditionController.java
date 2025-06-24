package com.ando.poja.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @GetMapping("/add")
    public double add(@RequestParam(required = true) double a,@RequestParam(required = true) double b) {
        return a+b;
    }
}
