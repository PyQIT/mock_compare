using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using mock_compare.Builder;
using mock_compare.Files;
using Assert = Xunit.Assert;
using Xunit;


namespace mock_compare.Tests.XUnit.Files
{
    public class CsvImportXUnitTest
    {
        [Fact]
        public void convertCsvToArraySucces()
        {

            CsvImport csvImport = new CsvImport();
            var test = csvImport.convertCsvToArray("C:\\Users\\Admin\\Desktop\\studia\\Projekt_TO\\mock_compare\\test.csv").Count();
            Assert.NotEqual(0, test);

        }

    }
}
