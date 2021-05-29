﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Collections;
using Telerik.JustMock;
using Assert = Xunit.Assert;
using Xunit;

namespace mock_compare.Tests.XUnit.Builder
{
    public class ReportListXUnitJustMockTest
    {

        [Fact]
        public void getReportList()
        {

            mock_compare.Builder.ReportList reportList = Mock.Create(() => new mock_compare.Builder.ReportList());
            Assert.Equal(0, reportList.getReportList().Capacity);

        }

        private List<mock_compare.Builder.ReportList> setReportList()
        {

            mock_compare.Builder.ReportList reportList = new mock_compare.Builder.ReportList();
            reportList.initList();

            return reportList.getReportList();

        }

    }
}
