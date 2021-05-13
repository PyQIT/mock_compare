package com.mock_compare.mock_compare.builder;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ReportListEasyMockTest {

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
