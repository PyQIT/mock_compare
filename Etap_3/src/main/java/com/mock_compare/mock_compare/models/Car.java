package com.mock_compare.mock_compare.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, insertable = false)
    private Long id;

    @Column
    private String brand;

    @Column
    private String model;

    @Column
    private String salesman;

    @Column
    private Boolean isAvailable;
}
