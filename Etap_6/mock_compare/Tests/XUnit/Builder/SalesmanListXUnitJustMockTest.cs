using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using mock_compare.Builder;
using Telerik.JustMock;
using Assert = NUnit.Framework.Assert;
using Xunit;

namespace mock_compare.Tests.XUnit.Builder
{
    public class SalesmanListXUnitJustMockTest
    {
        [Fact]
        public void getSalesmanList()
        {

            mock_compare.Builder.SalesmanList salesmanList = Mock.Create(() => new mock_compare.Builder.SalesmanList());
            Salesman salesman4 = new Salesman();
            salesmanList.addSalesmanToList(salesman4);
            Assert.AreEqual(salesmanList.getSalesmanList().Capacity, 4);


        }

        private List<mock_compare.Builder.Salesman> setSalesmanList()
        {

            mock_compare.Builder.SalesmanList salesmanList = new mock_compare.Builder.SalesmanList();
            salesmanList.initList();

            return salesmanList.getSalesmanList();

        }
    }
}
