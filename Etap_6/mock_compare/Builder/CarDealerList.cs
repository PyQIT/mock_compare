﻿using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mock_compare.Builder
{
    public class CarDealerList
    {
        private ArrayList carDealerList = new ArrayList();

        public void initList()
        {

            CarDealer carDealer = new CarDealer("Jesionowski sp. z o.o.", "Swietokrzyska 5", "Radom", "BMW");
            CarDealer carDealer1 = new CarDealer("PSK sp. z o.o.", "Kielecka 124", "Kielce", "Fiat");
            CarDealer carDealer2 = new CarDealer("BanachCars sp. z o.o.", "Poliglocka 123", "Warszawa", "Audi");
            CarDealer carDealer3 = new CarDealer("BestCars sp. z o.o.", "Wiejska 11", "Warszawa", "VW");
            CarDealer carDealer4 = new CarDealer("CarYouNeedToBuy sp. z o.o.", "Jana Pawla 2", "Krakow", "Ford");

            carDealerList.Add(carDealer);
            carDealerList.Add(carDealer1);
            carDealerList.Add(carDealer2);
            carDealerList.Add(carDealer3);
            carDealerList.Add(carDealer4);

        }

        public ArrayList getCarDealerList()
        {
            return carDealerList;
        }

        public void addDealer(CarDealer carDealer)
        {
            carDealerList.Add(carDealer);
        }

        public void removeDealer(CarDealer carDealer)
        {
            for (int i = 0; i < carDealerList.Capacity; i++)
            {
                if (carDealerList[i].Equals(carDealer))
                {
                    carDealerList.Remove(i);
                }
            }
        }
    }
}
