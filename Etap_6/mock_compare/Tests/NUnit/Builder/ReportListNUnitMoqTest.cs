using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using mock_compare.Builder;
using mock_compare.Tests.NUnit;
using NUnit.Framework;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Moq;
using Assert = NUnit.Framework.Assert;

namespace mock_compare.Tests.NUnit.Builder
{
    [TestFixture]
    public class ReportListNUnitTypeMockTest
    {

        [Test]
        public void getReportList()
        {

            var reportListMock = new Mock<ReportList>();
            ReportList reportList = new ReportList(reportListMock.Object);
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
