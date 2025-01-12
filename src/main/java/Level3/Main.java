package Level3;

import Level2.Company;
import Level2.StockAgency;
import Level2.StockAgent;
import Level2.StockMovement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ShoeStorePayment payment = new ShoeStorePayment();
        payment.payWith(new Notification() {
            @Override
            public void notifyPayment() {
                System.out.println("The payment has finished");
            }
        },new PaypalPayment());
    }
}
