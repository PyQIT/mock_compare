package com.mock_compare.mock_compare.builder;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class CarListAssertJMockitoTest {

    @Test
    public void getCarList(){

        //given
        CarList carList = mock(CarList.class);

        //when
        when(carList.getCarList()).thenReturn(setCar());

        //then
        assertThat(carList.getCarList().size()).isEqualTo(5);

    }

    private List<Car> setCar(){
        CarList carList = new CarList();
        carList.initList();

        return carList.getCarList();
    }

}
