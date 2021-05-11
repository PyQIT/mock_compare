package com.mock_compare.mock_compare.builder;

import com.mock_compare.mock_compare.builder.CarList;
import com.mock_compare.mock_compare.builder.Car;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.hamcrest.MatcherAssert.assertThat;

public class CarListTest {

    @Test
    public void getCarList(){

        //given
        CarList carList = mock(CarList.class);

        //when
        when(carList.getCarList()).thenReturn(setCar());

        //then
        assertThat(carList.getCarList(), Matchers.hasSize(5));

    }

    private List<Car> setCar(){
        CarList carList = new CarList();
        carList.initList();

        return carList.getCarList();
    }


}
