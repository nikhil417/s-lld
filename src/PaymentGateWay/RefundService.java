package PaymentGateWay;

import java.math.BigDecimal;

public class RefundService {

    private final Refundable refund;

    public RefundService(Refundable refundable) {
        refund = refundable;
    }

    public boolean refund(String transactionId, BigDecimal amount) {
        return refund.refund(transactionId, amount);
    }


}
