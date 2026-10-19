package PaymentGateWay;

import java.math.BigDecimal;

public interface Refundable {
    boolean refund(String transactionId, BigDecimal amount);
}
