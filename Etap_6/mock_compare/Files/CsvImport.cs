using System;
using System.Collections.Generic;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Threading.Tasks;
using CsvHelper;


namespace mock_compare.Files
{
    public class CsvImport
    {
        public IEnumerable<String> convertCsvToArray(String csvFile)
        {
            using (var reader = new StreamReader(csvFile))
            using (var csv = new CsvReader(reader, CultureInfo.InvariantCulture))
            {
                var anonymousTypeDefinition = new
                {
                    Id = default(int),
                    Name = string.Empty
                };
                var records = csv.GetRecords(anonymousTypeDefinition);
                return (IEnumerable<string>)records;
            }
        }
    }
}
