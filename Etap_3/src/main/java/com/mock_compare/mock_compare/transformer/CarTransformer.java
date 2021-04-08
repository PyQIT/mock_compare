package com.mock_compare.mock_compare.transformer;

import com.mock_compare.mock_compare.dto.CarDto;
import com.mock_compare.mock_compare.models.Car;
import org.springframework.beans.BeanUtils;

public class CarTransformer {

    public static Car convertToEntity(CarDto dto) {
        Car car = new Car();
        BeanUtils.copyProperties(dto, car);
        car.setSalesman("None");
        return car;
    }

    public static CarDto convertToDto(Car car) {
        CarDto dto = new CarDto();
        BeanUtils.copyProperties(car, dto);
        return dto;
    }
}
