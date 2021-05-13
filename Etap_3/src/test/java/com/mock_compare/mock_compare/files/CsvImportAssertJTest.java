package com.mock_compare.mock_compare.files;

import com.opencsv.exceptions.CsvException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class CsvImportAssertJTest {
    @Test
    void convertCsvToArraySucces() throws IOException, CsvException {
        CsvImport csvImport = new CsvImport();

        assertThat("test").isNotEqualTo(csvImport.convertCsvToArray("C:\\Users\\Asus\\mock_compare\\Etap_3\\test.csv"));
    }
}
