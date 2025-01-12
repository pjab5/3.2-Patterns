package Level3;

public class PaypalPayment implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("The Paypal payment is underway");
    }
}
