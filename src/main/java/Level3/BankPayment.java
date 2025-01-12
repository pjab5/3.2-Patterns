package Level3;

public class BankPayment implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("The bank payment is underway");
    }
}
