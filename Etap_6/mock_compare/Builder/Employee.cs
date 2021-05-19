using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mock_compare.Builder
{
    public class Employee
    {
        private String name;
        private String surname;
        private String pesel;
        private String phone_numer;
        private String address;
        private String position;

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getSurname()
        {
            return surname;
        }

        public void setSurname(String surname)
        {
            this.surname = surname;
        }

        public String getPesel()
        {
            return pesel;
        }

        public void setPesel(String pesel)
        {
            this.pesel = pesel;
        }

        public String getPhone_numer()
        {
            return phone_numer;
        }

        public void setPhone_numer(String phone_numer)
        {
            this.phone_numer = phone_numer;
        }

        public String getAddress()
        {
            return address;
        }

        public void setAddress(String address)
        {
            this.address = address;
        }

        public String getPosition()
        {
            return position;
        }

        public void setPosition(String position)
        {
            this.position = position;
        }

        public void setEmployee(String name, String surname, String pesel, String phone_numer, String address, String position)
        {
            this.name = name;
            this.surname = surname;
            this.pesel = pesel;
            this.phone_numer = phone_numer;
            this.address = address;
            this.position = position;
        }
    }
}
