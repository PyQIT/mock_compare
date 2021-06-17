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
    public class CarListNUnitMoqTest
    {
        [Test]
        public void getCarList()
        {
            var carListMock = new Mock<CarList>();
            CarList carList = new CarList(carListMock.Object);
            Assert.AreEqual(carList.getCarList().Capacity, 0);


        }

        private List<mock_compare.Builder.CarList> setCar()
        {

            mock_compare.Builder.CarList carList = new mock_compare.Builder.CarList();
            carList.initList();

            return carList.getCarList();

        }


    }
}
