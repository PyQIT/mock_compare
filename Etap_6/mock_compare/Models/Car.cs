using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mock_compare.Models
{
    public class Car
    {

        private long id;
        private String brand;
        private String model;
        private String salesman;
        private Boolean isAvailable;

        public long getId()
        {
            return id;
        }

        public void setId(long id)
        {
            this.id = id;
        }

        public String getBrand()
        {
            return brand;
        }

        public void setBrand(String Brand)
        {
            this.brand = brand;
        }

        public String getModel()
        {
            return model;
        }

        public void setModel(String model)
        {
            this.model = model;
        }

        public String getSalesman()
        {
            return salesman;
        }

        public void setSalesman(String salesman)
        {
            this.salesman = salesman;
        }

        public Boolean getIsAvailable()
        {
            return isAvailable;
        }

        public void setIsAvailable(Boolean isAvailable)
        {
            this.isAvailable = isAvailable;
        }

    }
}
