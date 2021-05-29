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
    public class CarDealerListNUnitMoqTest
    {


        [Test]
        public void getCarDealerList()
        {
            var carDealerListMock = new Mock<CarDealerList>();
            CarDealerList carDealerList = new CarDealerList(carDealerListMock.Object);
            Assert.AreEqual(carDealerList.getCarDealerList().Capacity, 0);



        }

        private List<mock_compare.Builder.CarDealerList> setCarDealer()
        {

            mock_compare.Builder.CarDealerList carDealerList = new mock_compare.Builder.CarDealerList();
            carDealerList.initList();

            return carDealerList.getCarDealerList();

        }

    }
}
