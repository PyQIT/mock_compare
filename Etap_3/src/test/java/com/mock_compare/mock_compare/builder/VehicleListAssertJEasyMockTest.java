package com.mock_compare.mock_compare.builder;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.easymock.EasyMock.*;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class VehicleListAssertJEasyMockTest {

    @Test
    public void getVehicleList(){

        //given
        VehicleList vehicleList = createNiceMock(VehicleList.class);

        //when
        expect(vehicleList.getVehicleList()).andStubReturn(setVehicle());
        replay(vehicleList);

        //then
        assertThat(vehicleList.getVehicleList().size()).isEqualTo(10);

    }

    private List<Vehicle> setVehicle(){

        VehicleList vehicleList = new VehicleList();
        vehicleList.initList();

        return vehicleList.getVehicleList();

    }

    @Test
    public void quantityOfPositiveOverviews(){

        //given
        VehicleList vehicleList = createNiceMock(VehicleList.class);

        //when
        expect(vehicleList.getListPositiveOverview()).andStubReturn(setPositiveOverview());
        replay(vehicleList);

        //then
        assertThat(vehicleList.getListPositiveOverview().size()).isEqualTo(1);
    }

    private List<Vehicle> setPositiveOverview(){

        VehicleList vehicleList = new VehicleList();
        vehicleList.initList();

        return vehicleList.getListPositiveOverview();

    }

    @Test
    public void quantityOfNegativeOverviews(){

        //given
        VehicleList vehicleList = createNiceMock(VehicleList.class);

        //when
        expect(vehicleList.getListNegativeOverview()).andStubReturn(setNegativeOverview());
        replay(vehicleList);

        //then
        assertThat(vehicleList.getListNegativeOverview().size()).isEqualTo(9);

    }

    private List<Vehicle> setNegativeOverview(){

        VehicleList vehicleList = new VehicleList();
        vehicleList.initList();

        return vehicleList.getListNegativeOverview();

    }




}
