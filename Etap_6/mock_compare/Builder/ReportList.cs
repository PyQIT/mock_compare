using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mock_compare.Builder
{
    public class ReportList : Report
    {
        List<ReportList> reportList;

        public ReportList()
        {
            reportList = new List<ReportList>();
            initList();
        }

        public ReportList(ReportList @object)
        {
            reportList = new List<ReportList>();
            initList();
        }

        public void addReportToList(ReportList report)
        {
            reportList.Add(report);
        }

        public List<ReportList> getReportList()
        {
            return reportList;
        }

        public void removeReportFromList(ReportList report)
        {
            reportList.Remove(report);
        }

        public void initList()
        {
            Report report = new Report();
            report.setReport("Krzysztof", "Siczek", "10/10/2020");
            addReportToList((ReportList)report);

            Report report1 = new Report();
            report1.setReport("Przemysław", "Pyk", "12/12/2019");
            addReportToList((ReportList)report1);

            Report report2 = new Report();
            report2.setReport("Pawel", "Banach", "21/01/2020");
            addReportToList((ReportList)report2);

            Report report3 = new Report();
            report3.setReport("Cecylia", "Adamkiewicz", "01/01/2021");
            addReportToList((ReportList)report3);

            Report report4 = new Report();
            report4.setReport("Albert", "Syn", "12/05/2015");
            addReportToList((ReportList)report4);

            Report report5 = new Report();
            report5.setReport("Anastazja", "Obama", "02/01/2021");
            addReportToList((ReportList)report5);

            Report report6 = new Report();
            report6.setReport("Kuba", "Walek", "21/06/2021");
            addReportToList((ReportList)report6);

            for (int i = 0; i < 1000000; i++)
            {
                Report reportNew = new Report();
                report6.setReport("Kuba", "Walek", "21/06/2021");
                addReportToList((ReportList)reportNew);
            }

        }

    }
}
