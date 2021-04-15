package com.mock_compare.mock_compare.files;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CsvImport {

    public List<String[]> convertCsvToArray(String csvFile) throws IOException, CsvException {
        CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build(); // custom separator
        try (CSVReader reader = new CSVReaderBuilder(
                new FileReader(csvFile))
                .withCSVParser(csvParser)   // custom CSV parser
                .withSkipLines(1)           // skip the first line, header info
                .build()) {
            List<String[]> r = reader.readAll();
            r.forEach(x -> System.out.println(Arrays.toString(x)));

            return r;
        }
    }
}
