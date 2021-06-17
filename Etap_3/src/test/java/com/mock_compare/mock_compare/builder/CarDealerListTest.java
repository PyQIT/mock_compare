package com.mock_compare.mock_compare.builder;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
public class CarDealerListTest {

    @Test
    public void getCarDealerList(){

        //given
        CarDealerList carDealerList = mock(CarDealerList.class);


        //when
        when(carDealerList.getCarDealerList()).thenReturn(setCarDealer());

        //then
        Assertions.assertEquals(carDealerList.getCarDealerList().size(), 1000005);

    }

    private List<CarDealer> setCarDealer(){

        CarDealerList carDealerList = new CarDealerList();
        carDealerList.initList();

        return carDealerList.getCarDealerList();

    }


}
