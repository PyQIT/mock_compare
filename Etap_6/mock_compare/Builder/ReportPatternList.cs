using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mock_compare.Builder
{
    public class ReportPatternList
    {
        List<ReportPattern> patternList;

        public ReportPatternList()
        {
            patternList = new List<ReportPattern>();
            initList();
        }

        public void addReportToList(ReportPattern report)
        {
            patternList.Add(report);
        }

        public List<ReportPattern> getPatternList()
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

            ReportPattern report = new ReportPattern.ReportBuilder().setCarDealer(carDealerList.getCarDealerList()[2]).build();
            ReportPattern report1 = new ReportPattern.ReportBuilder().setCarDealer(carDealerList.getCarDealerList()[1]).build();
            ReportPattern report2 = new ReportPattern.ReportBuilder().setCarDealer(carDealerList.getCarDealerList()[4]).build();
            ReportPattern report3 = new ReportPattern.ReportBuilder().setCarDealer(carDealerList.getCarDealerList()[3]).build();

            patternList.Add(report);
            patternList.Add(report1);
            patternList.Add(report2);
            patternList.Add(report3);

            for (int i = 0; i < 1000000; i++)
            {
                ReportPattern reportNew = new ReportPattern.ReportBuilder().setCarDealer(carDealerList.getCarDealerList()[2]).build();
                patternList.Add(reportNew);
            }

        }
    }
}
