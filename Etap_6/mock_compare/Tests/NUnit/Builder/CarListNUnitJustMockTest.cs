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
    public class CarListNUnitJustMockTest
    {

        [Test]
        public void getCarList()
        {

            mock_compare.Builder.CarList carList = Mock.Create(() => new mock_compare.Builder.CarList());
            Assert.AreEqual(carList.getCarList().Capacity, 1048576);


        }

        private List<mock_compare.Builder.Car> setCar()
        {

            mock_compare.Builder.CarList carList = new mock_compare.Builder.CarList();
            carList.initList();

            return carList.getCarList();

        }

    }
}
