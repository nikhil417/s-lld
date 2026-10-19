package PaymentGateWay;

import java.math.BigDecimal;
import java.time.YearMonth;

public class Client {
    public static void main(String[] args) {

        CreditCardDetails detail = new CreditCardDetails( "1231231231231232",  "123", YearMonth.of(2027, 4),
                 new BigDecimal("3213.31"));

        CreditCardPaymentProcessor creditCardPaymentProcessor = new CreditCardPaymentProcessor();

        Validator<CreditCardDetails> validator = new CreditCardValidator();
        PaymentProcessor<CreditCardDetails> paymentProcessor = creditCardPaymentProcessor;

        PaymentService<CreditCardDetails> paymentService = new PaymentService<>(validator, paymentProcessor);

        paymentService.makePayment(detail);

        RefundService refundService = new RefundService(creditCardPaymentProcessor);
        refundService.refund("wqewqdaasdas", new BigDecimal("1231.23"));

    }
}
