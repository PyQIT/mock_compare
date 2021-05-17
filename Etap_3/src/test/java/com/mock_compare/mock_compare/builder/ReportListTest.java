package com.mock_compare.mock_compare.builder;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
public class ReportListTest {

    @Test
    public void getReportList(){

        //given
        ReportList reportList = mock(ReportList.class);

        //when
        when(reportList.getReportList()).thenReturn(setReport());

        //then
        Assertions.assertEquals(reportList.getReportList().size(), 0);

}

private List<Report> setReport(){
        ReportList reportList = new ReportList();
        reportList.initList();

        return reportList.getReportList();
}

}
