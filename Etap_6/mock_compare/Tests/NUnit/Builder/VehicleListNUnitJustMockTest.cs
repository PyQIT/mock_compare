using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using mock_compare.Tests.NUnit;
using NUnit.Framework;
using Moq;

namespace mock_compare.Tests.NUnit.Builder
{
    [TestFixture]
    public class VehicleListNUnitJustMockTest
    {

        [Test]
        public void getVehiceList()
        {

            mock_compare.Builder.VehicleList vehicleList = new Mock<mock_compare.Builder.VehicleList>();
            Assert.AreEqual(vehicleList.getVehicleList().Capacity, 10);

        }

        private List<mock_compare.Builder.Vehicle> setVehicle()
        {

            mock_compare.Builder.VehicleList vehicleList = new mock_compare.Builder.VehicleList();
            vehicleList.initList();

            return vehicleList.getVehicleList();

        }


    }
}
