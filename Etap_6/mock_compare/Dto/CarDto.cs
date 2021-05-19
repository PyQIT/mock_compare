using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mock_compare.Dto
{
    public class CarDto
    {
        private long id;

        public long Getid()
        {
            return id;
        }

        public void Setid(long value)
        {
            id = value;
        }

        private string brand;

        public string Getbrand()
        {
            return brand;
        }

        public void Setbrand(string value)
        {
            brand = value;
        }

        private string model;

        public string Getmodel()
        {
            return model;
        }

        public void Setmodel(string value)
        {
            model = value;
        }

        private bool isAvailable;

        public bool GetisAvailable()
        {
            return isAvailable;
        }

        public void SetisAvailable(bool value)
        {
            isAvailable = value;
        }
    }

}
