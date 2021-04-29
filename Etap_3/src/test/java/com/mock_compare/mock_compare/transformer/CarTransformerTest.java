package com.mock_compare.mock_compare.transformer;

import com.mock_compare.mock_compare.dto.CarDto;
import com.mock_compare.mock_compare.models.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTransformerTest {

    @Test
    void convertToEntitySuccessTest(){
        CarDto car = new CarDto();
        car.setBrand("BMW");
        car.setId(1L);
        car.setModel("E46");
        car.setIsAvailable(true);

        CarTransformer carTransformer = new CarTransformer();

        assertEquals(true, car.getBrand().equals(carTransformer.convertToEntity(car).getBrand()));
        assertEquals(true, car.getId().equals(carTransformer.convertToEntity(car).getId()));
        assertEquals(true, car.getModel().equals(carTransformer.convertToEntity(car).getModel()));
        assertEquals(true, car.getIsAvailable().equals(carTransformer.convertToEntity(car).getIsAvailable()));
    }

    @Test
    void convertToDtoSuccessTest(){
        Car car = new Car();
        car.setBrand("BMW");
        car.setId(1L);
        car.setModel("E46");
        car.setIsAvailable(true);
        car.setSalesman("Krzysiu");

        CarTransformer carTransformer = new CarTransformer();

        assertEquals(true, car.getBrand().equals(carTransformer.convertToDto(car).getBrand()));
        assertEquals(true, car.getId().equals(carTransformer.convertToDto(car).getId()));
        assertEquals(true, car.getModel().equals(carTransformer.convertToDto(car).getModel()));
        assertEquals(true, car.getIsAvailable().equals(carTransformer.convertToDto(car).getIsAvailable()));
        assertEquals(false, car.getSalesman().equals(carTransformer.convertToDto(car).getBrand()));

    }

}
