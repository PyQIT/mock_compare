package com.mock_compare.mock_compare.builder;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class SalesmanListAssertJMockitoTest {

    @Test
    public void getSalesmanList(){

        //given
        SalesmanList salesmanList = mock(SalesmanList.class);

        //when
        when(salesmanList.getSalesmanList()).thenReturn(setSalesmanList());

        //then
        assertThat(salesmanList.getSalesmanList().size()).isEqualTo(1000003);


    }

    private ArrayList<Salesman> setSalesmanList(){

        SalesmanList salesmanList = new SalesmanList();
        salesmanList.initList();
        return salesmanList.getSalesmanList();

    }

}
