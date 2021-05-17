package com.mock_compare.mock_compare.builder;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.easymock.EasyMock.*;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class CarListAssertJEasyMockTest {

    @Test
    public void getCarList(){

        //given
        CarList carList = createNiceMock(CarList.class);

        //when
        expect(carList.getCarList()).andStubReturn(setCar());
        replay(carList);

        //then
        assertThat(carList.getCarList().size()).isEqualTo(5);

    }

    private List<Car> setCar(){
        CarList carList = new CarList();
        carList.initList();

        return carList.getCarList();
    }

}
