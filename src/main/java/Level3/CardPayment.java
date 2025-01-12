package Level3;

public class CardPayment implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("The card payment is underway");
    }
}
