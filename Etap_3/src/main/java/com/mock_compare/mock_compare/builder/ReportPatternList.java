package com.mock_compare.mock_compare.builder;

import java.util.ArrayList;
import java.util.List;

public class ReportPatternList {

    List<ReportPattern> patternList;

    public ReportPatternList(){
        patternList = new ArrayList<>();
    }

    public void addReportToList(ReportPattern report){
        patternList.add(report);
    }

    public List<ReportPattern> getPatternList(){
        return patternList;
    }

    public void initList(){
        CarDealerList carDealerList = new CarDealerList();
        carDealerList.initList();
        VehicleList vehicleList = new VehicleList();
        vehicleList.initList();
        SalesmanList salesmanList = new SalesmanList();
        salesmanList.initList();

        ReportPattern report = new ReportPattern.ReportBuilder().setCarDealer(carDealerList.getCarDealerList().get(2)).build();
        ReportPattern report1 = new ReportPattern.ReportBuilder().setCarDealer(carDealerList.getCarDealerList().get(1)).build();
        ReportPattern report2 = new ReportPattern.ReportBuilder().setCarDealer(carDealerList.getCarDealerList().get(4)).build();
        ReportPattern report3 = new ReportPattern.ReportBuilder().setCarDealer(carDealerList.getCarDealerList().get(3)).build();

        patternList.add(report);
        patternList.add(report1);
        patternList.add(report2);
        patternList.add(report3);

        for(int i = 0; i < 1000000; i++){
            ReportPattern newreport = new ReportPattern.ReportBuilder().setCarDealer(carDealerList.getCarDealerList().get(2)).build();
            patternList.add(newreport);
        }
    }

}
