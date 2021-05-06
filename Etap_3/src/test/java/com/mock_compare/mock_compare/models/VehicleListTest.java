package com.mock_compare.mock_compare.models;

import com.mock_compare.mock_compare.builder.VehicleList;
import com.mock_compare.mock_compare.builder.Vehicle;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.hamcrest.MatcherAssert.assertThat;

public class VehicleListTest {

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

}
