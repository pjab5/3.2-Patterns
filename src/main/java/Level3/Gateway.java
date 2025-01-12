package Level3;

import java.util.Optional;

public abstract class Gateway {

    final void payWith(Notification notification, PaymentMethod method){
        pay(method);
        Optional.ofNullable(notification).ifPresent(Notification::notifyPayment);
    }

    public abstract void pay(PaymentMethod method);
}
