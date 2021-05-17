package com.mock_compare.mock_compare.controller;

import com.mock_compare.mock_compare.models.Car;
import com.mock_compare.mock_compare.repositories.CarRepository;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class CarControllerEasyMockTest {
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private CarRepository carRepository;

    @BeforeEach
    void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    public static Car createMockCar(){
        Car car = new Car();
        car.setIsAvailable(true);
        car.setId(1l);
        car.setSalesman("Pracownik");
        car.setModel("E30");
        car.setBrand("BNW");
        return car;
    }

    @Test
    void shouldReturnCars() throws Exception{
        Car tmp = carRepository.saveAndFlush(createMockCar());

        mockMvc.perform(MockMvcRequestBuilders.get("/cars")
                .header("id", "1"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void shouldReturnCarById() throws Exception{
        Car tmp = carRepository.saveAndFlush(createMockCar());

        mockMvc.perform(MockMvcRequestBuilders.get("/cars/" + tmp.getId())
                .header("id", "1"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void shouldReturnCarsByBrandAndModel() throws Exception{
        Car tmp = carRepository.saveAndFlush(createMockCar());

        mockMvc.perform(MockMvcRequestBuilders.get("/cars/"+tmp.getBrand()+"/"+tmp.getModel())
                .header("id", "1"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void shouldAddACar() throws Exception{

        JSONObject json = new JSONObject();
        json.put("id","8");
        json.put("brand", "BMW");
        json.put("model", "E30");
        json.put("salesman", "Pracownik");
        json.put("isAvailable", "true");
        String data = "{\"id\":8,\"brand\":\"BMW\",\"model\":\"E30\",\"salesman\":\"Pracownik\",\"isAvailable\":true}";

        mockMvc.perform(MockMvcRequestBuilders.post("/car")
                .content(String.valueOf(json))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());


    }

}
