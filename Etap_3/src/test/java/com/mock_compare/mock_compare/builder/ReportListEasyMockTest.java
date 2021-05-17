package com.mock_compare.mock_compare.builder;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.easymock.EasyMock.*;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
public class ReportListEasyMockTest {

    @Test
    public void getReportList(){

        //given
        ReportList reportList = createNiceMock(ReportList.class);

        //when
        expect(reportList.getReportList()).andStubReturn(setReport());
        replay(reportList);
        //then
        Assertions.assertEquals(reportList.getReportList().size(), 0);

    }

    private List<Report> setReport(){
        ReportList reportList = new ReportList();
        reportList.initList();

        return reportList.getReportList();
    }

}
