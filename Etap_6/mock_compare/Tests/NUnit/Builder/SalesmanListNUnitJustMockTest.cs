using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using mock_compare.Tests.NUnit;
using NUnit.Framework;
using Moq;


namespace mock_compare.Tests.NUnit.Builder
{
    [TestFixture]
    public class SalesmanListNUnitJustMockTest
    {

        [Test]
        public void getSalesmanList()
        {

            mock_compare.Builder.SalesmanList salesmanList = new Mock<mock_compare.Builder.SalesmanList>();
            Assert.AreEqual(salesmanList.getSalesmanList().Capacity, 3);


        }

        private List<mock_compare.Builder.Salesman> setSalesmanList()
        {

            mock_compare.Builder.SalesmanList salesmanList = new mock_compare.Builder.SalesmanList();
            salesmanList.initList();

            return salesmanList.getSalesmanList();

        }


    }
}
