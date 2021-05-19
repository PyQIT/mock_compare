﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using mock_compare.Tests.NUnit;
using NUnit.Framework;
using Moq;
using System.Collections;

namespace mock_compare.Tests.NUnit.Builder
{
    [TestFixture]
    public class ReportListNUnitJustMockTest
    {

        [Test]
        public void getReportList()
        {

            mock_compare.Builder.ReportList reportList = new Mock<mock_compare.Builder.ReportList>();
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
