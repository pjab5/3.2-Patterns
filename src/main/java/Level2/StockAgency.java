package Level2;

public class StockAgency {
    private String name;

    public StockAgency(String name) {
        this.name = name;
    }

    void update(Company company, StockMovement stockMovement){
        System.out.println("The stock agency " + name + " has been notified that the stock of " + company.getName() + " has gone " + stockMovement.name().toLowerCase());
    }
}
