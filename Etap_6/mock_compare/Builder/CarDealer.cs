using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mock_compare.Builder
{
    public class CarDealer
    {
        private String carDealer;
        private String address;
        private String city;
        private String dealerMainBrand;

        public CarDealer(String carDealer, String address, String city, String dealerMainBrand)
        {
            this.carDealer = carDealer;
            this.address = address;
            this.city = city;
            this.dealerMainBrand = dealerMainBrand;
        }

        public String getCarDealer()
        {
            return carDealer;
        }

        public void setCarDealer(String carDealer)
        {
            this.carDealer = carDealer;
        }

        public void setAddress(String address)
        {
            this.address = address;
        }

        public String getAddress()
        {
            return address;
        }

        public void setCity(String city)
        {
            this.city = city;
        }

        public String getCity()
        {
            return city;
        }

        public void setDealerMainBrand(String dealerMainBrand)
        {
            this.dealerMainBrand = dealerMainBrand;
        }

        public String getDealerMainBrand()
        {
            return dealerMainBrand;
        }
    }
}
