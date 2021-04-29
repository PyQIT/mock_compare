package com.mock_compare.mock_compare.files;

import com.opencsv.exceptions.CsvException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CsvImportTest {

    @Test
    void convertCsvToArraySucces() throws IOException, CsvException {
        CsvImport csvImport = new CsvImport();

        assertNotEquals("test",csvImport.convertCsvToArray("C:\\Users\\Asus\\mock_compare\\Etap_3\\test.csv"));
    }
}
