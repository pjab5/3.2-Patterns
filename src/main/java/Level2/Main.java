package Level2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Company> companyList = new ArrayList<>();
        StockAgent stockAgent;

        companyList.add(new Company("Banc Sabadell"));
        companyList.add(new Company("Naturgy"));

        stockAgent = new StockAgent(companyList);
        StockAgency agency1 = new StockAgency("Agency1");
        StockAgency agency2 = new StockAgency("Agency2");
        StockAgency agency3 = new StockAgency("Agency3");

        stockAgent.subscribe(companyList.get(0),agency1);
        stockAgent.subscribe(companyList.get(0),agency2);
        stockAgent.subscribe(companyList.get(0),agency3);
        stockAgent.unsubscribe(companyList.get(0),agency1);
        stockAgent.subscribe(companyList.get(1),agency1);

        stockAgent.notify(companyList.get(0),StockMovement.UP);
        stockAgent.notify(companyList.get(1),StockMovement.DOWN);
    }
}
