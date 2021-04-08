package com.mock_compare.mock_compare.services;

import com.mock_compare.mock_compare.models.Car;
import com.mock_compare.mock_compare.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService{

    private final CarRepository carRepository;

    @Override
    public List<Car> getCars(){

    }

    public List<Car> getCars(String brand){

    }

    public List<Car> getCars(String brand, String model){

    }

    public Car createCar(Car car){

    }

    public Car getCar(Long id){

    }


}
