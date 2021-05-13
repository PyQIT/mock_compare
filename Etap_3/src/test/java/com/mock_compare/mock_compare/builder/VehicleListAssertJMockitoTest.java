package com.mock_compare.mock_compare.builder;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class VehicleListAssertJMockitoTest {

    @Test
    public void getVehicleList(){

        //given
        VehicleList vehicleList = mock(VehicleList.class);

        //when
        when(vehicleList.getVehicleList()).thenReturn(setVehicle());

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
        VehicleList vehicleList = mock(VehicleList.class);

        //when
        when(vehicleList.getListPositiveOverview()).thenReturn(setPositiveOverview());

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
        VehicleList vehicleList = mock(VehicleList.class);

        //when
        when(vehicleList.getListNegativeOverview()).thenReturn(setNegativeOverview());

        //then
        assertThat(vehicleList.getListNegativeOverview().size()).isEqualTo(9);

    }

    private List<Vehicle> setNegativeOverview(){

        VehicleList vehicleList = new VehicleList();
        vehicleList.initList();

        return vehicleList.getListNegativeOverview();

    }




}
