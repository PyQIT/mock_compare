package com.mock_compare.mock_compare.controllers;

import com.mock_compare.mock_compare.dto.CarDto;
import com.mock_compare.mock_compare.models.Car;
import com.mock_compare.mock_compare.services.CarService;
import com.mock_compare.mock_compare.transformer.CarTransformer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class CarController {

    private final CarService carService;

    @GetMapping("/cars")
    @ResponseStatus(HttpStatus.OK)
    public List<CarDto> getCars(){
        List<Car> cars = carService.getCars();
        return cars.stream().map(CarTransformer::convertToDto).collect(Collectors.toList());
    }

    @GetMapping("/cars/{brand}")
    @ResponseStatus(HttpStatus.OK)
    public List<CarDto> getCars(@PathVariable String brand){
        List<Car> cars = carService.getCars(brand);
        return cars.stream().map(CarTransformer::convertToDto).collect(Collectors.toList());
    }

    @GetMapping("/cars/{brand}/{model}")
    @ResponseStatus(HttpStatus.OK)
    public List<CarDto> getCars(@PathVariable String brand, String model){
        List<Car> cars = carService.getCars(brand, model);
        return cars.stream().map(CarTransformer::convertToDto).collect(Collectors.toList());
    }

    @GetMapping("/car/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CarDto getCar(@PathVariable Long id){
        return CarTransformer.convertToDto(carService.getCar(id));
    }

    @PostMapping("/car")
    @ResponseStatus(HttpStatus.OK)
    public void createCar(@RequestBody CarDto carDto){
        Car tmpCar = CarTransformer.convertToEntity(carDto);
        carService.createCar(tmpCar);
    }
}
