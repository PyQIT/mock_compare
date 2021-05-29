using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using mock_compare.Builder;
using Telerik.JustMock;
using Assert = Xunit.Assert;
using Xunit;


namespace mock_compare.Tests.XUnit.Builder
{
    public class VehicleListXUnitJustMockTest
    {

        [Fact]
        public void getVehiceList()
        {

            mock_compare.Builder.VehicleList vehicleList = Mock.Create(() => new mock_compare.Builder.VehicleList());
            Car car10 = new Car();
            Assert.Equal(0, vehicleList.getVehicleList().Capacity);

        }

        private List<mock_compare.Builder.Vehicle> setVehicle()
        {

            mock_compare.Builder.VehicleList vehicleList = new mock_compare.Builder.VehicleList();
            vehicleList.initList();

            return vehicleList.getVehicleList();

        }

        [Fact]
        public void quantityOfPositiveOverviews()
        {
            mock_compare.Builder.VehicleList vehicleList = Mock.Create(() => new mock_compare.Builder.VehicleList());
            Assert.Equal(0, vehicleList.getListPositiveOverview().Capacity);
        }

        private List<mock_compare.Builder.Vehicle> setPositiveOverview()
        {

            mock_compare.Builder.VehicleList vehicleList = new mock_compare.Builder.VehicleList();
            vehicleList.initList();

            return vehicleList.getListPositiveOverview();

        }

        [Fact]
        public void quantityOfNegativeOverviews()
        {
            mock_compare.Builder.VehicleList vehicleList = Mock.Create(() => new mock_compare.Builder.VehicleList());
            Assert.Equal(0, vehicleList.getListNegativeOverview().Capacity);
        }

        private List<mock_compare.Builder.Vehicle> setNegativeOverview()
        {

            mock_compare.Builder.VehicleList vehicleList = new mock_compare.Builder.VehicleList();
            vehicleList.initList();

            return vehicleList.getListNegativeOverview();

        }

    }
}
