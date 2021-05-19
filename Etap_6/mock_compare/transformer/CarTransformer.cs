using mock_compare.Dto;
using mock_compare.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mock_compare.transformer
{
    public class CarTransformer
    {
        public static Car convertToEntity(CarDto dto)
        {
            Car car = new Car();
            car.setBrand(dto.Getbrand());
            car.setId(dto.Getid());
            car.setIsAvailable(dto.GetisAvailable());
            car.setModel(dto.Getmodel());
            car.setSalesman("None");
            return car;
        }

        public static CarDto convertToDto(Car car)
        {
            CarDto dto = new CarDto();
            dto.Setbrand(car.getBrand());
            dto.Setid(car.getId());
            dto.SetisAvailable(car.getIsAvailable());
            dto.Setmodel(car.getModel());
            return dto;
        }
    }
}
