package Level2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockAgent {
    Map<Company, ArrayList<StockAgency>> stockAgencies = new HashMap<>();

    public StockAgent(List<Company> companies){
        for (Company company: companies){
            this.stockAgencies.put(company,new ArrayList<>());
        }
    }

    public void subscribe (Company company, StockAgency stockAgency){
        ArrayList<StockAgency> agencies = stockAgencies.get(company);
        agencies.add(stockAgency);
    }

    public void unsubscribe(Company company, StockAgency stockAgency){
        ArrayList<StockAgency> agencies = stockAgencies.get(company);
        agencies.remove(stockAgency);
    }

    public void notify(Company company, StockMovement stockMovement){
        ArrayList<StockAgency> agencies = stockAgencies.get(company);
        for(StockAgency agency: agencies){
            agency.update(company,stockMovement);
        }
    }
}
