package com.mock_compare.mock_compare.builder;

import java.util.*;
import java.util.ArrayList;

public class CarList extends Car {

    private ArrayList<Car> carList;

    public CarList(){
        carList = new ArrayList<>();
    }

    public void initList(){
        Car car = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car.setCar("ASDWWA11S60595228","WR12345","BMW", "sedan", "asdfqwdaer");
        carList.add(car);

        car2.setCar("ASDWWA11S60595333","TI12345", "FIAT","kombi","dasd4sdaewr");
        carList.add(car2);

        car3.setCar("ASDWWA1113595333","WRA12345", "AUDI","sedan","da13233ewr");
        carList.add(car3);

        car4.setCar("ASDWWA11S60fs5333","FA1234", "VW","SUV","das3421wr");
        carList.add(car4);

        car5.setCar("ASDWWA11S21395333","FT1235", "VOLVO","SUV","dgfggdf");
        carList.add(car5);

        for(int i = 0; i < 1000000; i++){
            Car newCar = new Car();
            newCar.setCar("ASDWWA11S21395333","FT1235", "VOLVO","SUV","dgfggdf");
            carList.add(newCar);
        }
    }

    public List<Car> getCarList(){
        return carList;
    }

    public void deleteCar(String identificationNumber){

        for(int i = 0; i<carList.size();i++){
            if(identificationNumber.equals(carList.get(i).getIdentificationNumber())){
                carList.remove(carList.get(i));
            }
        }
    }

    public Car getCar(String identificationNumber){
        for(int i = 0; i<carList.size();i++){
            if(carList.get(i).getIdentificationNumber().equals(identificationNumber)){
                return carList.get(i);
            }
        }
        return null;
    }

}
