package com.mock_compare.mock_compare.builder;

public class Car extends Vehicle {

    private String registrationNumber;

    public void setCar(String identificationNumber, String registrationNumber, String brand, String type, String insurance){
        this.identificationNumber = identificationNumber;
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.type = type;
        this.insurance = insurance;
    }

    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

}
