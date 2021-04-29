package com.mock_compare.mock_compare.services;

import com.mock_compare.mock_compare.models.Car;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CarServiceMockImplTest {

    @InjectMocks
    private CarServiceImpl carService;

    @Test
    void getCarsTest(){
        Car car = new Car();
        car.setModel("E46");
        car.setBrand("BMW");

        carService.createCar(car);
        carService.getCars();
        carService.getCars("BMW");
        carService.getCars("BMW", "E46");
        carService.getCar(1L);
    }

}
