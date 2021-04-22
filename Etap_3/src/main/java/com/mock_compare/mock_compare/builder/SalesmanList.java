package com.mock_compare.mock_compare.builder;

import java.util.ArrayList;

public class SalesmanList {

    private ArrayList<Salesman> salesmanList;

    public SalesmanList(){
        salesmanList = new ArrayList<>();
    }

    public void initList(){

        CarDealerList carDealerList = new CarDealerList();
        carDealerList.initList();

        Salesman salesman1 = new Salesman();
        salesman1.setEmployee("Krzysztof","Siczek","9324424212","666111222","Swietokrzyska 123","salesman");
        salesman1.setCarDealer(carDealerList.getCarDealerList().get(0));
        addSalesmanToList(salesman1);

        Salesman salesman2 = new Salesman();
        salesman2.setEmployee("Janusz","Boczek","9702324212","432214232","Warszawska 2","salesman");
        salesman2.setCarDealer(carDealerList.getCarDealerList().get(1));
        addSalesmanToList(salesman2);

        Salesman salesman3 = new Salesman();
        salesman3.setEmployee("Karol","Soczek","9703234212","523123123","Swietokrzyska 5","salesman");
        salesman3.setCarDealer(carDealerList.getCarDealerList().get(2));
        addSalesmanToList(salesman3);


    }

    public void addSalesmanToList(Salesman salesman){
        salesmanList.add(salesman);
    }

    public ArrayList<Salesman> getSalesmanList(){
        return salesmanList;
    }

}
