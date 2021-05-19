using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mock_compare.Builder
{
    public class Car : Vehicle
    {
        public String registrationNumber;

        public void setCar(String identificationNumber, String registrationNumber, String brand, String type, String insurance)
        {
            this.identificationNumber = identificationNumber;
            this.registrationNumber = registrationNumber;
            this.brand = brand;
            this.type = type;
            this.insurance = insurance;
        }

        public void setRegistrationNumber(String registrationNumber)
        {
            this.registrationNumber = registrationNumber;
        }

        public String getRegistrationNumber()
        {
            return registrationNumber;
        }
    }
}
