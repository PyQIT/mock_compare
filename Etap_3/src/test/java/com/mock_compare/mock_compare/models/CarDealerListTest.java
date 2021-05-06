package com.mock_compare.mock_compare.models;


import com.mock_compare.mock_compare.builder.CarDealerList;
import com.mock_compare.mock_compare.builder.CarDealer;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.hamcrest.MatcherAssert.assertThat;

public class CarDealerListTest {

    @Test
    public void getCarDealerList(){

        //given
        CarDealerList carDealerList = mock(CarDealerList.class);


        //when
        when(carDealerList.getCarDealerList()).thenReturn(setCarDealer());

        //then
        assertThat(carDealerList.getCarDealerList(), Matchers.hasSize(5));

    }

    private List<CarDealer> setCarDealer(){

        CarDealerList carDealerList = new CarDealerList();
        carDealerList.initList();

        return carDealerList.getCarDealerList();

    }


}
