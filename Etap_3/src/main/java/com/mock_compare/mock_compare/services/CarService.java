package com.mock_compare.mock_compare.services;

import com.mock_compare.mock_compare.models.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars();
    List<Car> getCars(String brand);
    List<Car> getCars(String brand, String model);
    Car createCar(Car car);
    Car getCar(Long id);
}
