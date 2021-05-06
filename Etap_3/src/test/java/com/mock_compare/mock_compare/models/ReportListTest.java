package com.mock_compare.mock_compare.models;

import com.mock_compare.mock_compare.builder.ReportList;
import com.mock_compare.mock_compare.builder.Report;
import com.mock_compare.mock_compare.builder.VehicleList;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.platform.engine.support.discovery.SelectorResolver;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.hamcrest.MatcherAssert.assertThat;


public class ReportListTest {

    @Test
    public void getReportList(){

        //given
        ReportList reportList = mock(ReportList.class);

        //when
        when(reportList.getReportList()).thenReturn(setReport());

        //then
        assertThat(reportList.getReportList(), Matchers.hasSize(0));

}

private List<Report> setReport(){
        ReportList reportList = new ReportList();
        reportList.initList();

        return reportList.getReportList();
}

}
