package PaymentGateWay;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.Date;

public class CreditCardDetails {
    private final String cardNumber;
    private final String cvv;
    private final YearMonth expiryDate;
    private final BigDecimal amount;

    public CreditCardDetails(String cardNumber, String cvv, YearMonth expiryDate, BigDecimal amount) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
        this.amount = amount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public YearMonth getDate() {
        return expiryDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
