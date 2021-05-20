using System;
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
    public class CarDealerListNUnitJustMockTest
    {

        [Test]
        public void getCarDealerList()
        {

            mock_compare.Builder.CarDealerList carDealerList = new Mock<mock_compare.Builder.CarDealerList>();
            Assert.AreEqual(carDealerList.getCarDealerList().Capacity, 5);


        }

        private List<mock_compare.Builder.CarDealerList> setCarDealer()
        {

            mock_compare.Builder.CarDealerList carDealerList = new mock_compare.Builder.CarDealerList();
            carDealerList.initList();

            return carDealerList.getCarDealerList();

        }

    }
}
