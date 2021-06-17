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
    public class CarListXUnitMoqTest
    {

        [Fact]
        public void getCarList()
        {
            var carListMock = new Mock<CarList>();
            CarList carList = new CarList(carListMock.Object);
            Assert.Equal(1048576, carList.getCarList().Capacity);


        }

        private List<mock_compare.Builder.Car> setCar()
        {

            mock_compare.Builder.CarList carList = new mock_compare.Builder.CarList();
            carList.initList();

            return carList.getCarList();

        }

    }
}
