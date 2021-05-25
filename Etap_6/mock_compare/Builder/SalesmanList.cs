using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace mock_compare.Builder
{
    public class SalesmanList
    {
        private List<Salesman> salesmanList;

        public SalesmanList()
        {
            salesmanList = new List<Salesman>();
        }

        public void initList()
        {

            CarDealerList carDealerList = new CarDealerList();
            carDealerList.initList();

            Salesman salesman1 = new Salesman();
            salesman1.setEmployee("Krzysztof", "Siczek", "9324424212", "666111222", "Swietokrzyska 123", "salesman");
            salesman1.setCarDealer(carDealerList.getCarDealerList()[0]);
            addSalesmanToList(salesman1);

            Salesman salesman2 = new Salesman();
            salesman2.setEmployee("Janusz", "Boczek", "9702324212", "432214232", "Warszawska 2", "salesman");
            salesman2.setCarDealer(carDealerList.getCarDealerList()[1]);
            addSalesmanToList(salesman2);

            Salesman salesman3 = new Salesman();
            salesman3.setEmployee("Karol", "Soczek", "9703234212", "523123123", "Swietokrzyska 5", "salesman");
            salesman3.setCarDealer(carDealerList.getCarDealerList()[2]);
            addSalesmanToList(salesman3);

            Salesman salesman4 = new Salesman();
            salesman4.setEmployee("Karol", "Boczek", "9703234213", "522223123", "Swietokrzyska 10", "salesman");
            salesman4.setCarDealer(carDealerList.getCarDealerList()[3]);
            addSalesmanToList(salesman4);

        }

        public void addSalesmanToList(Salesman salesman)
        {
            salesmanList.Add(salesman);
        }

        public List<Salesman> getSalesmanList()
        {
            return salesmanList;
        }

    }
}
