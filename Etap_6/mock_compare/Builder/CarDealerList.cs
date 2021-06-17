using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mock_compare.Builder
{
    public class CarDealerList : CarDealer
    {

        public List<CarDealerList> carDealerList;

        public CarDealerList()
        {
            this.carDealerList = new List<CarDealerList>();
        }

        public CarDealerList(CarDealerList @Object)
        {
            this.carDealerList = new List<CarDealerList>();
        }

        public void initList()
        {

            CarDealer carDealer = new CarDealer("Jesionowski sp.z o.o.", "Swietokrzyska 5", "Radom", "BMW");
            CarDealer carDealer1 = new CarDealer("PSK sp. z o.o.", "Kielecka 124", "Kielce", "Fiat");
            CarDealer carDealer2 = new CarDealer("BanachCars sp. z o.o.", "Poliglocka 123", "Warszawa", "Audi");
            CarDealer carDealer3 = new CarDealer("BestCars sp. z o.o.", "Wiejska 11", "Warszawa", "VW");
            CarDealer carDealer4 = new CarDealer("CarYouNeedToBuy sp. z o.o.", "Jana Pawla 2", "Krakow", "Ford");

            carDealerList.Add((CarDealerList)carDealer);
            carDealerList.Add((CarDealerList)carDealer1);
            carDealerList.Add((CarDealerList)carDealer2);
            carDealerList.Add((CarDealerList)carDealer3);
            carDealerList.Add((CarDealerList)carDealer4);


            for (int i = 0; i < 1000000; i++)
            {
                CarDealer carDealerNew = new CarDealer("Jesionowski sp.z o.o.", "Swietokrzyska 5", "Radom", "BMW");
                carDealerList.Add((CarDealerList)carDealerNew);
            }

        }


        public List<CarDealerList> getCarDealerList()
        {
            return carDealerList;
        }

        public void addDealer(CarDealerList carDealer)
        {
            carDealerList.Add(carDealer);
        }

        public void removeDealer(CarDealer carDealer)
        {
            for (int i = 0; i < carDealerList.Capacity; i++)
            {
                if (carDealerList[i].Equals(carDealer))
                {
                    carDealerList.RemoveAt(i);
                }
            }
        }

    }
}
