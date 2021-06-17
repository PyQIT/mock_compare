using Moq;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mock_compare.Builder
{
    public class VehicleList : Car
    {
        private List<Vehicle> vehicleList;

        public VehicleList(VehicleList @object)
        {
            vehicleList = new List<Vehicle>();
            initList();
        }

        public VehicleList()
        {
            vehicleList = new List<Vehicle>();
            initList();
        }

        public void initList()
        {
            Car car = new Car();
            Car car1 = new Car();
            Car car2 = new Car();
            Car car3 = new Car();
            Car car4 = new Car();
            Car car5 = new Car();
            Car car6 = new Car();
            Car car7 = new Car();
            Car car8 = new Car();
            Car car9 = new Car();


            car.setCar("YV1MK76F2A2182012", "WR065CJ", "BMW", "sedan", "ADAYUB1997");
            car.setVehicleOverview(true);
            vehicleList.Add(car);

            car1.setCar("W0L0AHL4878062512", "TI069AJ", "OPEL", "kombi", "AGASAB5423");
            car1.setVehicleOverview(true);
            addVehicleToList(car1);

            car2.setCar("WAUZZZ4L47D017597", "WRAWNSRA", "AUDI", "sedan", "TGGSTF3123");
            car2.setVehicleOverview(false);
            addVehicleToList(car2);

            car3.setCar("ZFA17800002385215", "TKI13523", "FIAT", "suv", "YYYSGF1111");
            car3.setVehicleOverview(true);
            addVehicleToList(car3);

            car4.setCar("WF0WXXGCDW5P55686", "TKI11111", "FORD", "suv", "YWEGDR2222");
            car4.setVehicleOverview(true);
            addVehicleToList(car4);

            car5.setCar("WVWZZZ1KZ5P079215", "TKI22222", "FORD", "sedan", "FSAEWQ33333");
            car5.setVehicleOverview(true);
            addVehicleToList(car5);

            car6.setCar("SB1BR56L50E151114", "WRA12352", "TOYOTA", "van", "IVZST4125");
            car6.setVehicleOverview(true);
            addVehicleToList(car6);

            car7.setCar("SB1BR56L50E151114", "WI12353", "DODGE", "coupe", "ZCGDR4232");
            car7.setVehicleOverview(true);
            addVehicleToList(car7);

            car8.setCar("VSSZZZ5FZJR056379", "WR12345", "SEAT", "hatchback", "LOVER1234");
            car8.setVehicleOverview(true);
            addVehicleToList(car8);

            car9.setCar("VSSZZZ5FZJR056379", "WR12345", "SEAT", "hatchback", "LOVER1234");
            car9.setVehicleOverview(true);
            addVehicleToList(car9);

            for(int i = 0; i < 1000000; i++)
            {
                Car newCar = new Car();
                newCar.setCar("VSSZZZ5FZJR056379", "WR12345", "SEAT", "hatchback", "LOVER1234");
                newCar.setVehicleOverview(true);
                addVehicleToList(newCar);
            }

            for (int i = 0; i < 1000000; i++)
            {
                Car newCar = new Car();
                newCar.setCar("VSSZZZ5FZJR056379", "WR12345", "SEAT", "hatchback", "LOVER1234");
                newCar.setVehicleOverview(false);
                addVehicleToList(newCar);
            }

        }

        public List<Vehicle> getVehicleList()
        {
            return vehicleList;
        }

        public void addVehicleToList(Car car)
        {
            vehicleList.Add(car);
        }

        public Object getCar(String identificationNumber)
        {
            for (int i = 0; i < vehicleList.Capacity; i++)
            {
                if (vehicleList[i].getIdentificationNumber().Equals(identificationNumber))
                {
                    return vehicleList[i];
                }
            }
            return null;
        }

        public List<Vehicle> getListPositiveOverview()
        {
            List<Vehicle> overViewPositive = new List<Vehicle>();
            for (int i = 0; i < vehicleList.Capacity; i++)
            {
                if (vehicleList[i].getVehicleOverView() == true)
                {
                    overViewPositive.Add(vehicleList[i]);
                }
            }
            return overViewPositive;
        }

        public List<Vehicle> getListNegativeOverview()
        {
            List<Vehicle> overViewNegative = new List<Vehicle>();
            for (int i = 0; i < vehicleList.Capacity; i++)
            {
                if (vehicleList[i].getVehicleOverView() == false)
                {
                    overViewNegative.Add(vehicleList[i]);
                }
            }
            return overViewNegative;
        }
    }
}
