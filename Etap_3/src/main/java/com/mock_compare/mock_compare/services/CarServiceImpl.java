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
        return carRepository.findAll();
    }

    public List<Car> getCars(String brand){
        return carRepository.getCarByBrand(brand);
    }

    public List<Car> getCars(String brand, String model){
        return carRepository.getCarByBrandAndModel(brand, model);
    }

    public Car createCar(Car car){
        return carRepository.save(car);
    }

    public Car getCar(Long id){
        return carRepository.findById(id).orElseThrow(
                () -> new CarNotFoundException("Car id=" + id + " not found.")
    }

}
