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

        public List<string> convertCsvToArray(string absolutePath)
        {
            List<string> result = new List<string>();
            string[] lines = File.ReadAllLines(absolutePath);
            foreach (string line in lines)
            {
                string[] columns = line.Split(',');
                foreach (string column in columns)
                {
                    result.Add(column);
                }
            }
            return result;
        }
    }
}
