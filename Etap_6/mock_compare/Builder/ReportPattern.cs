using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Reflection;

namespace mock_compare.Builder
{
    public class ReportPattern
    {
        private String clientName;
        private String clientSurname;
        static private Car car;
        static private Employee employee;
        static private CarDealer carDealer;
        private String data;
        private Boolean accepted;

        ReportPattern(ReportBuilder builder)
        {

            this.clientName = builder.clientName;
            this.clientSurname = builder.clientSurname;
            this.data = builder.data;
            employee = builder.employee;
            carDealer = builder.carDealer;
            this.accepted = false;
        }

        public String getClientName()
        {
            return clientName;
        }


        public String getClientSurname()
        {
            return clientSurname;
        }

        public String getData()
        {
            return data;
        }


        public Boolean getAccepted()
        {
            return accepted;
        }

        public void setCarDealer(CarDealer carDealer) { carDealer = carDealer; }

        public void setCar(Car car) { car = car; }

        public void modifyAccepted(Boolean accepted)
        {
            this.accepted = accepted;
        }


        public class ReportBuilder
        {
            public String clientName;
            public String clientSurname;
            public Car car;
            public Employee employee;
            public CarDealer carDealer;
            public String data;
            public Boolean accepted;


            public ReportBuilder setClientName(String clientName)
            {
                this.clientName = clientName;
                return this;
            }

            public ReportBuilder setClientSurname(String clientSurname)
            {
                this.clientSurname = clientSurname;
                return this;
            }

            public ReportBuilder setCar(Car car)
            {
                this.car = car;
                return this;
            }

            public ReportBuilder setEmployee(Employee employee)
            {
                this.employee = employee;
                return this;
            }

            public ReportBuilder setCarDealer(CarDealer carDealer)
            {
                this.carDealer = carDealer;
                return this;
            }

            public ReportBuilder setData(String data)
            {
                this.data = data;
                return this;
            }

            public ReportPattern build()
            {
                return new ReportPattern(this);
            }

        }

        ReportBuilder reportPattern1 = new ReportBuilder()
                .setClientName("Krzysztof")
                .setClientSurname("Pyk")
                .setCar(car)
                .setEmployee(employee)
                .setCarDealer(carDealer)
                .setData("test")
                .build().reportPattern1;
    }
}
