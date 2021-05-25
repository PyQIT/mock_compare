using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using mock_compare.Tests.NUnit;
using NUnit.Framework;
using System.Collections;
using Telerik.JustMock;
using Assert = NUnit.Framework.Assert;

namespace mock_compare.Tests.NUnit.Builder
{
    [TestFixture]
    public class ReportListNUnitJustMockTest
    {

        [Test]
        public void getReportList()
        {

            mock_compare.Builder.ReportList reportList = Mock.Create(() => new mock_compare.Builder.ReportList());
            Assert.AreEqual(reportList.getReportList().Capacity, 0);


        }

        private List<mock_compare.Builder.ReportList> setReportList()
        {

            mock_compare.Builder.ReportList reportList = new mock_compare.Builder.ReportList();
            reportList.initList();

            return reportList.getReportList();

        }

    }
}
