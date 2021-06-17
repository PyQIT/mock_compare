using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using mock_compare.Builder;
using mock_compare.Files;
using mock_compare.Tests.NUnit;
using NUnit.Framework;
using Telerik.JustMock;
using Assert = NUnit.Framework.Assert;

namespace mock_compare.Tests.NUnit.Files
{
    [TestFixture]
    public class CsvImportNUnitTest
    {
        [Test]
        public void convertCsvToArraySucces() {

        CsvImport csvImport = new CsvImport();
        var test = csvImport.convertCsvToArray("C:\\Users\\Admin\\Desktop\\studia\\Projekt_TO\\mock_compare\\test.csv").Count();
        Assert.AreNotEqual(0, test);

        }
    }
}
