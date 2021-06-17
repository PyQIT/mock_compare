using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using mock_compare.Builder;
using Moq;
using Assert = Xunit.Assert;
using Xunit;

namespace mock_compare.Tests.XUnit.Builder
{
    public class ReportListXUnitMoqTest
    {

        [Fact]
        public void getReportList()
        {

            var reportListMock = new Mock<ReportList>();
            ReportList reportList = new ReportList(reportListMock.Object);
            Assert.Equal(1048576, reportList.getReportList().Capacity);

        }

        private List<mock_compare.Builder.Report> setReportList()
        {

            mock_compare.Builder.ReportList reportList = new mock_compare.Builder.ReportList();
            reportList.initList();

            return reportList.getReportList();

        }

    }
}
