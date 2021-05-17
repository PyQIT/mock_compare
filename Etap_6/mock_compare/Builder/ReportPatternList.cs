using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mock_compare.Builder
{
    public class ReportPatternList
    {
        ArrayList patternList;

        public ReportPatternList()
        {
            patternList = new ArrayList();
        }

        public void addReportToList(ReportPattern report)
        {
            patternList.Add(report);
        }

        public ArrayList getPatternList()
        {
            return patternList;
        }

        public void initList()
        {
            CarDealerList carDealerList = new CarDealerList();
            carDealerList.initList();
            VehicleList vehicleList = new VehicleList();
            vehicleList.initList();
            SalesmanList salesmanList = new SalesmanList();
            salesmanList.initList();

            ReportPattern report = new ReportPattern.ReportBuilder().setCarDealer(carDealerList[2].getCarDealerList()).build();
            ReportPattern report1 = new ReportPattern.ReportBuilder().setCarDealer(carDealerList[1].getCarDealerList()).build();
            ReportPattern report2 = new ReportPattern.ReportBuilder().setCarDealer(carDealerList[4].getCarDealerList()).build();
            ReportPattern report3 = new ReportPattern.ReportBuilder().setCarDealer(carDealerList[3].getCarDealerList()).build();

            patternList.Add(report);
            patternList.Add(report1);
            patternList.Add(report2);
            patternList.Add(report3);
        }
    }
}
