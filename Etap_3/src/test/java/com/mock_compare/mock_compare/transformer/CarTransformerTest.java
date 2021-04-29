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

    }

}
