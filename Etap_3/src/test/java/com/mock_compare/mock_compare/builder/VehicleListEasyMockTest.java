package com.mock_compare.mock_compare.builder;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import org.junit.jupiter.api.Assertions;

import static org.easymock.EasyMock.*;

@SpringBootTest
public class VehicleListEasyMockTest {

//    @Test
//    public void getVehicleList(){
//
//        //given
//        VehicleList vehicleList = mock(VehicleList.class);
//
//        //when
//        expect(vehicleList.getVehicleList()).andReturn(setVehicle());
//
//        //then
//        Assertions.assertEquals(vehicleList.getVehicleList().size(), 10);
//
//    }

    private List<Vehicle> setVehicle(){

        VehicleList vehicleList = new VehicleList();
        vehicleList.initList();

        return vehicleList.getVehicleList();

    }

//    @Test
//    public void quantityOfPositiveOverviews(){
//
//        //given
//        VehicleList vehicleList = mock(VehicleList.class);
//
//        //when
//        when(vehicleList.getListPositiveOverview()).thenReturn(setPositiveOverview());
//
//        //then
//        Assertions.assertEquals(vehicleList.getListPositiveOverview().size(), 1);
//    }
//
//    private List<Vehicle> setPositiveOverview(){
//
//        VehicleList vehicleList = new VehicleList();
//        vehicleList.initList();
//
//        return vehicleList.getListPositiveOverview();
//
//    }
//
//    @Test
//    public void quantityOfNegativeOverviews(){
//
//        //given
//        VehicleList vehicleList = mock(VehicleList.class);
//
//        //when
//        when(vehicleList.getListNegativeOverview()).thenReturn(setNegativeOverview());
//
//        //then
//        Assertions.assertEquals(vehicleList.getListNegativeOverview().size(), 9);
//
//    }
//
//    private List<Vehicle> setNegativeOverview(){
//
//        VehicleList vehicleList = new VehicleList();
//        vehicleList.initList();
//
//        return vehicleList.getListNegativeOverview();
//
//    }



}
