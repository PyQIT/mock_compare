using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using mock_compare.Builder;
using mock_compare.Tests.NUnit;
using NUnit.Framework;
using Telerik.JustMock;
using Assert = NUnit.Framework.Assert;

namespace mock_compare.Tests.NUnit.Builder
{
    [TestFixture]
    public class VehicleListNUnitJustMockTest
    {

        [Test]
        public void getVehiceList()
        {

            mock_compare.Builder.VehicleList vehicleList = Mock.Create(() => new mock_compare.Builder.VehicleList());
            Car car10 = new Car();
            Assert.AreEqual(vehicleList.getVehicleList().Capacity, 0);

        }

        private List<mock_compare.Builder.Vehicle> setVehicle()
        {

            mock_compare.Builder.VehicleList vehicleList = new mock_compare.Builder.VehicleList();
            vehicleList.initList();

            return vehicleList.getVehicleList();

        }

        [Test]
        public void quantityOfPositiveOverviews()
        {
            mock_compare.Builder.VehicleList vehicleList = Mock.Create(() => new mock_compare.Builder.VehicleList());
            Assert.AreEqual(vehicleList.getListPositiveOverview().Capacity, 0);
        }

        private List<mock_compare.Builder.Vehicle> setPositiveOverview()
        {

            mock_compare.Builder.VehicleList vehicleList = new mock_compare.Builder.VehicleList();
            vehicleList.initList();

            return vehicleList.getListPositiveOverview();

        }

        [Test]
        public void quantityOfNegativeOverviews()
        {
            mock_compare.Builder.VehicleList vehicleList = Mock.Create(() => new mock_compare.Builder.VehicleList());
            Assert.AreEqual(vehicleList.getListNegativeOverview().Capacity, 0);
        }

        private List<mock_compare.Builder.Vehicle> setNegativeOverview()
        {

            mock_compare.Builder.VehicleList vehicleList = new mock_compare.Builder.VehicleList();
            vehicleList.initList();

            return vehicleList.getListNegativeOverview();

        }



    }
}
