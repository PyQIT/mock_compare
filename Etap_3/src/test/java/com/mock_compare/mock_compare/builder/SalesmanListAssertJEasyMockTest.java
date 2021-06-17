package com.mock_compare.mock_compare.builder;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;
import static org.easymock.EasyMock.*;

@SpringBootTest
public class SalesmanListAssertJEasyMockTest {

    @Test
    public void getSalesmanList(){

        //given
        SalesmanList salesmanList = createNiceMock(SalesmanList.class);

        //when
        expect(salesmanList.getSalesmanList()).andStubReturn(setSalesmanList());
        replay(salesmanList);

        //then
        assertThat(salesmanList.getSalesmanList().size()).isEqualTo(1000003);


    }

    private ArrayList<Salesman> setSalesmanList(){

        SalesmanList salesmanList = new SalesmanList();
        salesmanList.initList();
        return salesmanList.getSalesmanList();

    }

}
