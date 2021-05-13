package com.mock_compare.mock_compare.builder;

import com.mock_compare.mock_compare.builder.SalesmanList;
import com.mock_compare.mock_compare.builder.Salesman;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
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
        Assertions.assertEquals(salesmanList.getSalesmanList().size(), 3);


    }

    private ArrayList<Salesman> setSalesmanList(){

        SalesmanList salesmanList = new SalesmanList();
        salesmanList.initList();
        return salesmanList.getSalesmanList();

    }


}
