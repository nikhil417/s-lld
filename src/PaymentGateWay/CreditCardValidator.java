package PaymentGateWay;

import java.time.YearMonth;

public class CreditCardValidator implements Validator<CreditCardDetails>{


    @Override
    public boolean validate(CreditCardDetails details) {
        if (details == null || details.getCvv() == null || details.getCardNumber() == null || details.getDate() == null) {
            return false;
        }
        if (details.getCvv().length() == 3 && details.getCardNumber().length() == 16 && YearMonth.now().isBefore(details.getDate()) {
            return true;
        }
        return false;
    }
}
