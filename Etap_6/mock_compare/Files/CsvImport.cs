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

        /*public List<string> convertCsvToArray(string absolutePath)
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
        }*/

        public int convertCsvToArray(string filename)
        {
            int number = 0;

            // Get the file's text.
            string whole_file = System.IO.File.ReadAllText(filename);

            // Split into lines.
            whole_file = whole_file.Replace('\n', '\r');
            string[] lines = whole_file.Split(new char[] { '\r' },
                StringSplitOptions.RemoveEmptyEntries);

            // See how many rows and columns there are.
            int num_rows = lines.Length;
            int num_cols = lines[0].Split(',').Length;

            // Allocate the data array.
            string[,] values = new string[num_rows, num_cols];

            // Load the array.
            for (int r = 0; r < num_rows; r++)
            {
                string[] line_r = lines[r].Split(',');
                for (int c = 0; c < num_cols; c++)
                {
                    number++;
                    values[r, c] = line_r[c];
                }
            }

            // Return the values.
            return number;
        }
    }
}
