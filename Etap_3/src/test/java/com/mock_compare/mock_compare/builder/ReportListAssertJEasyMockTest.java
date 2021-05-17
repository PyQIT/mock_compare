package com.mock_compare.mock_compare.builder;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.easymock.EasyMock.*;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class ReportListAssertJEasyMockTest {

    @Test
    public void getReportList(){

        //given
        ReportList reportList = createNiceMock(ReportList.class);

        //when
        expect(reportList.getReportList()).andStubReturn(setReport());
        replay(reportList);

        //then
        assertThat(reportList.getReportList().size()).isEqualTo(0);

    }

    private List<Report> setReport(){
        ReportList reportList = new ReportList();
        reportList.initList();

        return reportList.getReportList();
    }

}
