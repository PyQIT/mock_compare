package com.mock_compare.mock_compare.builder;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.easymock.EasyMock.*;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
public class CarDealerListEasyMockTest {

    @Test
    public void getCarDealerList(){

        //given
        CarDealerList carDealerList = createNiceMock(CarDealerList.class);


        //when
        expect(carDealerList.getCarDealerList()).andStubReturn(setCarDealer());
        replay(carDealerList);

        //then
        Assertions.assertEquals(carDealerList.getCarDealerList().size(), 5);

    }

    private List<CarDealer> setCarDealer(){

        CarDealerList carDealerList = new CarDealerList();
        carDealerList.initList();

        return carDealerList.getCarDealerList();

    }


}
