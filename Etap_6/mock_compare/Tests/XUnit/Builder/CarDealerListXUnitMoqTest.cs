using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using mock_compare.Builder;
using Moq;
using Assert = Xunit.Assert;
using Xunit;

namespace mock_compare.Tests.XUnit.Builder
{
    public class CarDealerListXUnitMoqTest
    {

        [Fact]
        public void getCarDealerList()
        {
            var carDealerListMock = new Mock<CarDealerList>();
            CarDealerList carDealerList = new CarDealerList(carDealerListMock.Object);
            Assert.Equal(0, carDealerList.getCarDealerList().Capacity);



        }

        private List<mock_compare.Builder.CarDealerList> setCarDealer()
        {

            mock_compare.Builder.CarDealerList carDealerList = new mock_compare.Builder.CarDealerList();
            carDealerList.initList();

            return carDealerList.getCarDealerList();

        }

    }
}
