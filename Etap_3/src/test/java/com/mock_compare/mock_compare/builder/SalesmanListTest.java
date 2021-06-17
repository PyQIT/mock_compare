package com.mock_compare.mock_compare.builder;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;


@SpringBootTest
public class SalesmanListTest {

    @Test
    public void getSalesmanList(){

        //given
        SalesmanList salesmanList = mock(SalesmanList.class);

        //when
        when(salesmanList.getSalesmanList()).thenReturn(setSalesmanList());

        //then
        Assertions.assertEquals(salesmanList.getSalesmanList().size(), 1000003);


    }

    private ArrayList<Salesman> setSalesmanList(){

        SalesmanList salesmanList = new SalesmanList();
        salesmanList.initList();
        return salesmanList.getSalesmanList();

    }


}
