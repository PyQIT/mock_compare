package com.mock_compare.mock_compare.builder;

import java.util.ArrayList;
import java.util.List;

public class ReportList {

    List<Report> reportList;

    public ReportList(){
        reportList = new ArrayList<>();
    }

    public void addReportToList(Report report){
        reportList.add(report);
    }

    public List<Report> getReportList(){
        return reportList;
    }

    public void removeReportFromList(Report report){
        reportList.remove(report);
    }

    public void initList(){
        Report report = new Report();
        report.setReport("Krzysztof","Siczek", "10/10/2020");

        Report report1 = new Report();
        report1.setReport("Przemysław", "Pyk", "12/12/2019");

        Report report2 = new Report();
        report2.setReport("Pawel","Banach", "21/01/2020");

        Report report3 = new Report();
        report3.setReport("Cecylia", "Adamkiewicz", "01/01/2021");

        Report report4 = new Report();
        report4.setReport("Albert", "Syn", "12/05/2015");

        Report report5 = new Report();
        report5.setReport("Anastazja","Obama", "02/01/2021");

        Report report6 = new Report();
        report6.setReport("Kuba", "Walek", "21/06/2021");

    }

}
