package com.mock_compare.mock_compare.builder;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class VehicleListAssertJMockitoTest {

    @Test
    public void getVehicleList(){

        //given
        VehicleList vehicleList = mock(VehicleList.class);

        //when
        when(vehicleList.getVehicleList()).thenReturn(setVehicle());

        //then
        assertThat(vehicleList.getVehicleList(), Matchers.hasSize(10));

    }

    private List<Vehicle> setVehicle(){

        VehicleList vehicleList = new VehicleList();
        vehicleList.initList();

        return vehicleList.getVehicleList();

    }

    @Test
    public void quantityOfPositiveOverviews(){

        //given
        VehicleList vehicleList = mock(VehicleList.class);

        //when
        when(vehicleList.getListPositiveOverview()).thenReturn(setPositiveOverview());

        //then
        assertThat(vehicleList.getListPositiveOverview(), Matchers.hasSize(1));
    }

    private List<Vehicle> setPositiveOverview(){

        VehicleList vehicleList = new VehicleList();
        vehicleList.initList();

        return vehicleList.getListPositiveOverview();

    }

    @Test
    public void quantityOfNegativeOverviews(){

        //given
        VehicleList vehicleList = mock(VehicleList.class);

        //when
        when(vehicleList.getListNegativeOverview()).thenReturn(setNegativeOverview());

        //then
        assertThat(vehicleList.getListNegativeOverview(), Matchers.hasSize(9));

    }

    private List<Vehicle> setNegativeOverview(){

        VehicleList vehicleList = new VehicleList();
        vehicleList.initList();

        return vehicleList.getListNegativeOverview();

    }




}
