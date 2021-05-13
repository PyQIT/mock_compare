package com.mock_compare.mock_compare.services;

import com.mock_compare.mock_compare.models.Car;
import com.mock_compare.mock_compare.repositories.CarRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Optional;

@SpringBootTest
public class CarServiceMockImplAssertJTest {

    @Autowired
    private CarRepository carRepository;
    private java.util.Optional Optional;

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
        car.setId(4l);
        car.setSalesman("Pracownik");
        car.setIsAvailable(true);

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car);

        carRepository.saveAndFlush(car);

        assertThat(cars).isEqualTo(carRepository.findAll());
    }

    @Test
    void getCarsByBrandTest(){
        Car car = new Car();
        car.setModel("E46");
        car.setBrand("BMW");
        car.setId(2l);
        car.setSalesman("Pracownik");
        car.setIsAvailable(true);

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car);

        carRepository.saveAndFlush(car);

        assertThat(cars).isEqualTo(carRepository.getCarByBrand("BMW"));
    }

    @Test
    void getCarsByBrandAndModelTest(){
        Car car = new Car();
        car.setModel("E46");
        car.setBrand("BMW");
        car.setId(1l);
        car.setSalesman("Pracownik");
        car.setIsAvailable(true);

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car);

        carRepository.saveAndFlush(car);

        assertThat(cars).isEqualTo(carRepository.getCarByBrandAndModel("BMW","E46"));
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

        assertThat(Optional.empty()).isEqualTo(carRepository.findById(4l));
    }
}
