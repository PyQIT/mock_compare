package com.mock_compare.mock_compare.builder;

public abstract class Vehicle {

    protected String identificationNumber;
    protected String brand;
    protected String type;
    protected String insurance;
    protected boolean vehicleOverview;

    public void setIdentificationNumber(String identificationNumber){
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationNumber(){
        return identificationNumber;
    }

   public String getBrand(){
       return brand;
   }

   public String getType(){
       return type;
   }

   public String getInsurance(){
       return insurance;
   }

   public void setVehicleOverview(boolean vehicleOverview){
        this.vehicleOverview = vehicleOverview;
   }

   public boolean getVehicleOverView(){
        return vehicleOverview;
   }

   public boolean isVehicleOverview(){
       return vehicleOverview;
    }


}
