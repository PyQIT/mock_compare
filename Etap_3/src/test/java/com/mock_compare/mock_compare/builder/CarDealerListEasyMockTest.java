package com.mock_compare.mock_compare.builder;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CarDealerListEasyMockTest {

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
