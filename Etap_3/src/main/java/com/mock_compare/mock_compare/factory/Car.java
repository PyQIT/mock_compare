package com.mock_compare.mock_compare.factory;

public abstract class Car {

    protected String identificationNumber;
    protected String brand;
    protected String type;
    protected String insurance;
    protected boolean carOverview;

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

   public void setCarOverview(boolean carOverview){
        this.carOverview = carOverview;
   }

   public boolean getCarOverView(){
        return carOverview;
   }

   public boolean isCarOverview(){
       return carOverview;
    }


}
