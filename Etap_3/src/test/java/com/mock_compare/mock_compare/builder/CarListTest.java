package com.mock_compare.mock_compare.builder;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
public class CarListTest {

    @Test
    public void getCarList(){

        //given
        CarList carList = mock(CarList.class);

        //when
        when(carList.getCarList()).thenReturn(setCar());

        //then
        Assertions.assertEquals(carList.getCarList().size(), 5);

    }

    private List<Car> setCar(){
        CarList carList = new CarList();
        carList.initList();

        return carList.getCarList();
    }


}
