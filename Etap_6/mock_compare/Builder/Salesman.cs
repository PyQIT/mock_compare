using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mock_compare.Builder
{
    public class Salesman
    {
        private CarDealer carDealer;

        public void setCarDealer(CarDealer carDealer)
        {
            this.carDealer = carDealer;
        }

        public CarDealer getCarDealer()
        {
            return carDealer;
        }
    }
}
