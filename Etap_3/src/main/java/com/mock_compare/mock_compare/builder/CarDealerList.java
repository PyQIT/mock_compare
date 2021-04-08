package com.mock_compare.mock_compare.builder;

import java.util.ArrayList;
import java.util.List;


public class CarDealerList {


    private List<CarDealer> carDealerList = new ArrayList<>();

    public void initList(){

        CarDealer carDealer = new CarDealer("Jesionowski sp. z o.o.","Swietokrzyska 5", "Radom","BMW");
        CarDealer carDealer1 = new CarDealer("PSK sp. z o.o.","Kielecka 124", "Kielce","Fiat");
        CarDealer carDealer2 = new CarDealer("BanachCars sp. z o.o.","Poliglocka 123", "Warszawa","Audi");
        CarDealer carDealer3 = new CarDealer("BestCars sp. z o.o.","Wiejska 11", "Warszawa","VW");
        CarDealer carDealer4 = new CarDealer("CarYouNeedToBuy sp. z o.o.","Jana Pawla 2", "Krakow","Ford");

        carDealerList.add(carDealer);
        carDealerList.add(carDealer1);
        carDealerList.add(carDealer2);
        carDealerList.add(carDealer3);
        carDealerList.add(carDealer4);

    }

    public  List<CarDealer> getCarDealerList(){
        return carDealerList;
    }

    public void addDealer(CarDealer carDealer){
        carDealerList.add(carDealer);
    }

    public void removeDealer(CarDealer carDealer){
        for(int i=0; i<carDealerList.size(); i++){
            if(carDealerList.get(i).equals(carDealer)){
                carDealerList.remove(i);
            }
        }
    }

}
