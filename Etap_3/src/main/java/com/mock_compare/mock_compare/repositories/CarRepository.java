package com.mock_compare.mock_compare.repositories;

import com.mock_compare.mock_compare.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> getCarByBrand(String brand);
    List<Car> getCarByBrandAndModel(String brand, String model);
    List<Car> getCarById(Long id);

}
