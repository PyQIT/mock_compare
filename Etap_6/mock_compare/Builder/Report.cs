using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mock_compare.Builder
{
    public class Report
    {
        private String clientName;
        private String clientSurname;
        private Vehicle vehicle;
        private Salesman salesman;
        private CarDealer carDealer;
        private String data;
        private Boolean accepted;

        public void setCarDealer(CarDealer carDealer)
        {
            this.carDealer = carDealer;
        }

        public void setSalesman(Salesman salesman)
        {
            this.salesman = salesman;
        }

        public void setVehicle(Vehicle vehicle)
        {
            this.vehicle = vehicle;
        }

        public void setClientName(String clientName)
        {
            this.clientName = clientName;
        }

        public void setClientSurname(String clientSurname)
        {
            this.clientSurname = clientSurname;
        }

        private void setData(String data)
        {
            this.data = data;
        }

        private void setAccepted(Boolean accepted)
        {
            this.accepted = accepted;
        }

        public Boolean isAccepted()
        {
            return accepted;
        }

        public String getData()
        {
            return data;
        }

        public String getClientName()
        {
            return clientName;
        }

        public String getClientSurname()
        {
            return clientSurname;
        }

        public Vehicle getVehicle()
        {
            return vehicle;
        }

        public Salesman getSalesman()
        {
            return salesman;
        }

        public CarDealer getCarDealer()
        {
            return carDealer;
        }

        public void setReport(String clientName, String clientSurname, String data)
        {
            this.clientName = clientName;
            this.clientSurname = clientSurname;
            this.data = data;
        }
    }
}
