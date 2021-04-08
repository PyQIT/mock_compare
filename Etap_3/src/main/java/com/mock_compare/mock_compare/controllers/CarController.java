package com.mock_compare.mock_compare.controllers;

import com.mock_compare.mock_compare.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class CarController {

    private final CarService carService;

    @GetMapping("/hello")
    public String getData(){
        return "Hello there";
    }
}
