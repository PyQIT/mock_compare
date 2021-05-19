﻿using System;
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
    public class CarListNUnitJustMockTest
    {

        [Test]
        public void getCarList()
        {

            mock_compare.Builder.CarList carList = new Mock<mock_compare.Builder.CarList>();
            Assert.AreEqual(carList.getCarList().Capacity, 5);


        }

        private List<mock_compare.Builder.CarList> setCar()
        {

            mock_compare.Builder.CarList carList = new mock_compare.Builder.CarList();
            carList.initList();

            return carList.getCarList();

        }

    }
}
