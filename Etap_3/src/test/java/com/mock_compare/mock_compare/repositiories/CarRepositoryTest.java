package com.mock_compare.mock_compare.repositiories;

import com.mock_compare.mock_compare.models.Car;
import com.mock_compare.mock_compare.repositories.CarRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarRepositoryTest {
    @Autowired
    private CarRepository carRepository;

    @BeforeEach
    void setUp(){
        carRepository.deleteAll();
    }

    @AfterEach
    void tearDown(){
        carRepository.deleteAll();
    }

    @Test
    void shouldAddCar(){
        //given
        Car car = new Car();
        car.setBrand("BMW");
        car.setModel("E30");
        car.setSalesman("Patryk");
        car.setIsAvailable(true);
        car.setId(1l);
        //when
        Car out = carRepository.saveAndFlush(car);
        //then
        out.setId(1l);
        Assertions.assertThat(car).isEqualTo(out);
    }

}
