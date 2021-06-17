package com.mock_compare.mock_compare.builder;

import java.util.*;

public class VehicleList extends Car {

    private ArrayList<Vehicle> vehicleList;

    public VehicleList(){
        vehicleList = new ArrayList<>();
    }

    public void initList(){
        Car car = new Car();
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
        Car car6 = new Car();
        Car car7 = new Car();
        Car car8 = new Car();
        Car car9 = new Car();


        car.setCar("YV1MK76F2A2182012", "WR065CJ", "BMW", "sedan", "ADAYUB1997");
        car.setVehicleOverview(true);
        vehicleList.add(car);

        car.setCar("W0L0AHL4878062512", "TI069AJ", "OPEL", "kombi", "AGASAB5423");
        car.setVehicleOverview(true);
        vehicleList.add(car1);

        car.setCar("WAUZZZ4L47D017597", "WRAWNSRA", "AUDI", "sedan", "TGGSTF3123");
        car.setVehicleOverview(false);
        vehicleList.add(car2);

        car.setCar("ZFA17800002385215", "TKI13523", "FIAT", "suv", "YYYSGF1111");
        car.setVehicleOverview(true);
        vehicleList.add(car3);

        car.setCar("WF0WXXGCDW5P55686", "TKI11111", "FORD", "suv", "YWEGDR2222");
        car.setVehicleOverview(true);
        vehicleList.add(car4);

        car.setCar("WVWZZZ1KZ5P079215", "TKI22222", "FORD", "sedan", "FSAEWQ33333");
        car.setVehicleOverview(true);
        vehicleList.add(car5);

        car.setCar("SB1BR56L50E151114", "WRA12352", "TOYOTA", "van", "IVZST4125");
        car.setVehicleOverview(true);
        vehicleList.add(car6);

        car.setCar("SB1BR56L50E151114", "WI12353", "DODGE", "coupe", "ZCGDR4232");
        car.setVehicleOverview(true);
        vehicleList.add(car7);

        car.setCar("VSSZZZ5FZJR056379", "WR12345", "SEAT", "hatchback", "LOVER1234");
        car.setVehicleOverview(true);
        vehicleList.add(car8);

        car.setCar("VSSZZZ5FZJR056379", "WR12345", "SEAT", "hatchback", "LOVER1234");
        car.setVehicleOverview(true);
        vehicleList.add(car9);

        for(int i = 0; i < 1000000; i++){
            Car newcar = new Car();
            newcar.setCar("VSSZZZ5FZJR056379", "WR12345", "SEAT", "hatchback", "LOVER1234");
            newcar.setVehicleOverview(true);
            vehicleList.add(newcar);
        }

        for(int i = 0; i < 1000000; i++){
            Car newcar = new Car();
            newcar.setCar("VSSZZZ5FZJR056379", "WR12345", "SEAT", "hatchback", "LOVER1234");
            newcar.setVehicleOverview(false);
            vehicleList.add(newcar);
        }

    }

    public List<Vehicle> getVehicleList(){
        return vehicleList;
    }

    public Vehicle getCar(String identificationNumber){
        for (int i = 0; i < vehicleList.size(); i++){
            if(vehicleList.get(i).getIdentificationNumber().equals(identificationNumber)){
                return vehicleList.get(i);
            }
        }
        return null;
    }

    public List<Vehicle> getListPositiveOverview(){
        List<Vehicle> overViewPositive = new ArrayList<>();
        for (int i = 0; i < vehicleList.size(); i++){
            if(vehicleList.get(i).getVehicleOverView()==true){
                overViewPositive.add(vehicleList.get(i));
            }
        }
        return overViewPositive;
    }

    public List<Vehicle> getListNegativeOverview(){
        List<Vehicle> overViewNegative = new ArrayList<>();
        for (int i = 0; i < vehicleList.size(); i++){
            if(vehicleList.get(i).getVehicleOverView()==false){
                overViewNegative.add(vehicleList.get(i));
            }
        }
        return overViewNegative;
    }




}
