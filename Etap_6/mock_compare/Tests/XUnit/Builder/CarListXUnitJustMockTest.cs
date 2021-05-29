using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Collections;
using Telerik.JustMock;
using Assert = Xunit.Assert;
using Xunit;

namespace mock_compare.Tests.XUnit.Builder
{
    public class CarListXUnitJustMockTest
    {

        [Fact]
        public void getCarList()
        {

            mock_compare.Builder.CarList carList = Mock.Create(() => new mock_compare.Builder.CarList());
            Assert.Equal(0, carList.getCarList().Capacity);


        }

        private List<mock_compare.Builder.CarList> setCar()
        {

            mock_compare.Builder.CarList carList = new mock_compare.Builder.CarList();
            carList.initList();

            return carList.getCarList();

        }

    }
}
