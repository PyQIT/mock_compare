package com.mock_compare.mock_compare.builder;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import org.junit.jupiter.api.Assertions;

import static org.easymock.EasyMock.*;

@SpringBootTest
public class VehicleListEasyMockTest {

    @Test
    public void getVehicleList(){

        //given
        VehicleList vehicleList = createNiceMock(VehicleList.class);

        //when
        expect(vehicleList.getVehicleList()).andStubReturn(setVehicle());
        replay(vehicleList);

        //then
        Assertions.assertEquals(vehicleList.getVehicleList().size(), 2000010);

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
        Assertions.assertEquals(vehicleList.getListPositiveOverview().size(), 1000001);
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
        Assertions.assertEquals(vehicleList.getListNegativeOverview().size(), 1000009);

    }

    private List<Vehicle> setNegativeOverview(){

        VehicleList vehicleList = new VehicleList();
        vehicleList.initList();

        return vehicleList.getListNegativeOverview();

    }



}
