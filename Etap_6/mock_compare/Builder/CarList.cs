﻿using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mock_compare.Builder
{
    public class CarList : Car
    {
        private ArrayList carList;

        public CarList()
        {
            carList = new ArrayList();
        }

        public void initList()
        {
            Car car = new Car();
            Car car2 = new Car();
            Car car3 = new Car();
            Car car4 = new Car();
            Car car5 = new Car();

            car.setCar("ASDWWA11S60595228", "WR12345", "BMW", "sedan", "asdfqwdaer");
            carList.Add(car);

            car2.setCar("ASDWWA11S60595333", "TI12345", "FIAT", "kombi", "dasd4sdaewr");
            carList.Add(car2);

            car3.setCar("ASDWWA1113595333", "WRA12345", "AUDI", "sedan", "da13233ewr");
            carList.Add(car3);

            car4.setCar("ASDWWA11S60fs5333", "FA1234", "VW", "SUV", "das3421wr");
            carList.Add(car4);

            car5.setCar("ASDWWA11S21395333", "FT1235", "VOLVO", "SUV", "dgfggdf");
            carList.Add(car5);


        }

        public ArrayList getCarList()
        {
            return carList;
        }

        public void deleteCar(String identificationNumber)
        {

            for (int i = 0; i < carList.Capacity; i++)
            {
                if (identificationNumber.Equals(carList[i].getIdentificationNumber()))
                {
                    carList.Remove(carList[i]);
                }
            }
        }

        public Object getCar(String identificationNumber)
        {
            for (int i = 0; i < carList.Capacity; i++)
            {
                if (carList[i].getIdentificationNumber().Equals(identificationNumber))
                {
                    return carList[i];
                }
            }
            return null;
        }
    }
}
