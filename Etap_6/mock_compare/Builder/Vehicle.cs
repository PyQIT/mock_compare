using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mock_compare.Builder
{
    public class Vehicle
    {
        protected String identificationNumber;
        protected String brand;
        protected String type;
        protected String insurance;
        protected Boolean vehicleOverview;

        public void setIdentificationNumber(String identificationNumber)
        {
            this.identificationNumber = identificationNumber;
        }

        public String getIdentificationNumber()
        {
            return identificationNumber;
        }

        public String getBrand()
        {
            return brand;
        }

        public String getType()
        {
            return type;
        }

        public String getInsurance()
        {
            return insurance;
        }

        public void setVehicleOverview(Boolean vehicleOverview)
        {
            this.vehicleOverview = vehicleOverview;
        }

        public Boolean getVehicleOverView()
        {
            return vehicleOverview;
        }

        public Boolean isVehicleOverview()
        {
            return vehicleOverview;
        }
    }
}
