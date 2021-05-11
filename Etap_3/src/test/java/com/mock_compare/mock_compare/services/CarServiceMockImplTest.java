package com.mock_compare.mock_compare.services;

import com.mock_compare.mock_compare.models.Car;
import com.mock_compare.mock_compare.repositories.CarRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Optional;

@SpringBootTest
public class CarServiceMockImplTest {

    @Autowired
    private CarRepository carRepository;
    private Optional Optional;

    @BeforeEach
    void setUp(){
        carRepository.deleteAll();
    }

    @AfterEach
    void tearDown(){
        carRepository.deleteAll();
    }

    @Test
    void getCarsTest(){
        Car car = new Car();
        car.setModel("E46");
        car.setBrand("BMW");
        car.setId(6l);
        car.setSalesman("Pracownik");
        car.setIsAvailable(true);

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car);

        carRepository.saveAndFlush(car);


        Assertions.assertEquals(cars, carRepository.findAll());
    }

    @Test
    void getCarsByBrandTest(){
        Car car = new Car();
        car.setModel("E46");
        car.setBrand("BMW");
        car.setId(4l);
        car.setSalesman("Pracownik");
        car.setIsAvailable(true);

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car);

        carRepository.saveAndFlush(car);


        Assertions.assertEquals(cars, carRepository.getCarByBrand("BMW"));
    }

    @Test
    void getCarsByBrandAndModelTest(){
        Car car = new Car();
        car.setModel("E46");
        car.setBrand("BMW");
        car.setId(3l);
        car.setSalesman("Pracownik");
        car.setIsAvailable(true);

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car);

        carRepository.saveAndFlush(car);


        Assertions.assertEquals(cars, carRepository.getCarByBrandAndModel("BMW","E46"));
    }

    @Test
    void getCarsByIdTest(){
        Car car = new Car();
        car.setModel("E46");
        car.setBrand("BMW");
        car.setId(4l);
        car.setSalesman("Pracownik");
        car.setIsAvailable(true);

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car);

        carRepository.saveAndFlush(car);

        Optional<Car> opt = Optional.of(car);

        Assertions.assertEquals(Optional.empty(),carRepository.findById(4l));
    }

}
