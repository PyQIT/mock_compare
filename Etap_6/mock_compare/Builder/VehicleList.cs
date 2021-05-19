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

        public VehicleList()
        {
            vehicleList = new List<Vehicle>();
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

            car.setCar("W0L0AHL4878062512", "TI069AJ", "OPEL", "kombi", "AGASAB5423");
            car.setVehicleOverview(true);
            vehicleList.Add(car1);

            car.setCar("WAUZZZ4L47D017597", "WRAWNSRA", "AUDI", "sedan", "TGGSTF3123");
            car.setVehicleOverview(false);
            vehicleList.Add(car2);

            car.setCar("ZFA17800002385215", "TKI13523", "FIAT", "suv", "YYYSGF1111");
            car.setVehicleOverview(true);
            vehicleList.Add(car3);

            car.setCar("WF0WXXGCDW5P55686", "TKI11111", "FORD", "suv", "YWEGDR2222");
            car.setVehicleOverview(true);
            vehicleList.Add(car4);

            car.setCar("WVWZZZ1KZ5P079215", "TKI22222", "FORD", "sedan", "FSAEWQ33333");
            car.setVehicleOverview(true);
            vehicleList.Add(car5);

            car.setCar("SB1BR56L50E151114", "WRA12352", "TOYOTA", "van", "IVZST4125");
            car.setVehicleOverview(true);
            vehicleList.Add(car6);

            car.setCar("SB1BR56L50E151114", "WI12353", "DODGE", "coupe", "ZCGDR4232");
            car.setVehicleOverview(true);
            vehicleList.Add(car7);

            car.setCar("VSSZZZ5FZJR056379", "WR12345", "SEAT", "hatchback", "LOVER1234");
            car.setVehicleOverview(true);
            vehicleList.Add(car8);

            car.setCar("VSSZZZ5FZJR056379", "WR12345", "SEAT", "hatchback", "LOVER1234");
            car.setVehicleOverview(true);
            vehicleList.Add(car9);

        }

        public List<Vehicle> getVehicleList()
        {
            return vehicleList;
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

        public static implicit operator VehicleList(Mock<VehicleList> v)
        {
            throw new NotImplementedException();
        }
    }
}
