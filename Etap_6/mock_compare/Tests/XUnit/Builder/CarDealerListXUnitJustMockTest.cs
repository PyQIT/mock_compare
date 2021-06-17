using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Collections;
using mock_compare.Builder;
using Telerik.JustMock;
using Assert = Xunit.Assert;
using Xunit;

namespace mock_compare.Tests.XUnit.Builder
{
    public class CarDealerListXUnitJustMockTest
    {

        [Fact]
        public void getCarDealerList()
        {

            mock_compare.Builder.CarDealerList carDealerList = Mock.Create(() => new mock_compare.Builder.CarDealerList());
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
