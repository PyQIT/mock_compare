package com.mock_compare.mock_compare.transformer;

import com.mock_compare.mock_compare.dto.CarDto;
import com.mock_compare.mock_compare.models.Car;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class CarTransformerAssertJTest {

    @Test
    void convertToEntitySuccessTest(){
        CarDto car = new CarDto();
        car.setBrand("BMW");
        car.setId(1L);
        car.setModel("E46");
        car.setIsAvailable(true);

        CarTransformer carTransformer = new CarTransformer();

        assertThat(car.getBrand().equals(carTransformer.convertToEntity(car).getBrand())).isTrue();
        assertThat(car.getId().equals(carTransformer.convertToEntity(car).getId())).isTrue();
        assertThat(car.getModel().equals(carTransformer.convertToEntity(car).getModel())).isTrue();
        assertThat(car.getIsAvailable().equals(carTransformer.convertToEntity(car).getIsAvailable())).isTrue();
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

        assertThat(car.getId().equals(carTransformer.convertToDto(car).getId())).isTrue();
        assertThat(car.getModel().equals(carTransformer.convertToDto(car).getModel())).isTrue();
        assertThat(car.getIsAvailable().equals(carTransformer.convertToDto(car).getIsAvailable())).isTrue();
        assertThat(car.getSalesman().equals(carTransformer.convertToDto(car).getBrand())).isFalse();
    }

}
