package com.mock_compare.mock_compare.builder;

import com.mock_compare.mock_compare.builder.SalesmanList;
import com.mock_compare.mock_compare.builder.Salesman;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.hamcrest.MatcherAssert.assertThat;

public class SalesmanListTest {

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
