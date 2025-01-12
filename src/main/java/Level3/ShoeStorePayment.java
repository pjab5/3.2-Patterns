package Level3;

public class ShoeStorePayment extends Gateway{


    @Override
    public void pay(PaymentMethod method) {
        method.pay();
    }
}
