package com.mock_compare.mock_compare.builder;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class SalesmanListEasyMockTest {

    @Test
    public void getSalesmanList(){

        //given
        SalesmanList salesmanList = mock(SalesmanList.class);

        //when
        when(salesmanList.getSalesmanList()).thenReturn(setSalesmanList());

        //then
        assertThat(salesmanList.getSalesmanList(), Matchers.hasSize(3));


    }

    private ArrayList<Salesman> setSalesmanList(){

        SalesmanList salesmanList = new SalesmanList();
        salesmanList.initList();
        return salesmanList.getSalesmanList();

    }


}
