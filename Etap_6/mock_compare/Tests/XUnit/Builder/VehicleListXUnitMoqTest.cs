using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using mock_compare.Builder;
using Assert = Xunit.Assert;
using Moq;
using Xunit;

namespace mock_compare.Tests.XUnit.Builder
{
    public class VehicleListXUnitMoqTest
    {

        [Fact]
        public void getVehiceList()
        {

            var vehicleListMock = new Mock<VehicleList>();
            VehicleList vehicleList = new VehicleList(vehicleListMock.Object);
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
            var vehicleListMock = new Mock<VehicleList>();
            VehicleList vehicleList = new VehicleList(vehicleListMock.Object);
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
            var vehicleListMock = new Mock<VehicleList>();
            VehicleList vehicleList = new VehicleList(vehicleListMock.Object);
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
