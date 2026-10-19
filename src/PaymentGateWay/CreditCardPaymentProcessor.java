package PaymentGateWay;

import java.math.BigDecimal;

public class CreditCardPaymentProcessor implements PaymentProcessor<CreditCardDetails>, Refundable{

    @Override
    public boolean processPayment(CreditCardDetails details) {
            System.out.println("Make payment");
            return true;

    }

    @Override
    public boolean refund(String transactionId, BigDecimal amount) {
        System.out.println("Process refund");
        return true;
    }
}
