package com.mock_compare.mock_compare.builder;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.easymock.EasyMock.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;


@SpringBootTest
public class SalesmanListEasyMockTest {

    @Test
    public void getSalesmanList(){

        //given
        SalesmanList salesmanList = createNiceMock(SalesmanList.class);

        //when
        expect(salesmanList.getSalesmanList()).andStubReturn(setSalesmanList());
        replay(salesmanList);

        //then
        Assertions.assertEquals(salesmanList.getSalesmanList().size(), 1000003);


    }

    private ArrayList<Salesman> setSalesmanList(){

        SalesmanList salesmanList = new SalesmanList();
        salesmanList.initList();
        return salesmanList.getSalesmanList();

    }


}
