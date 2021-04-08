package com.mock_compare.mock_compare.dto;

import lombok.Data;

@Data
public class CarDto {
    private Long id;
    private String brand;
    private String model;
    private Boolean isAvailable;
}
