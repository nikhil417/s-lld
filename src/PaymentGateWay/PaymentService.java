package PaymentGateWay;

public class PaymentService<T> {

    private final Validator<T> validator;
    private final PaymentProcessor<T> paymentProcessor;

    public PaymentService(Validator<T> validator, PaymentProcessor<T> paymentProcessor ) {
        this.validator = validator;
        this.paymentProcessor = paymentProcessor;
    }

    public boolean makePayment(T details) {
        boolean paymentSuccess = false;
        if (validator.validate(details)){
            paymentSuccess = paymentProcessor.processPayment(details);
        }
        return paymentSuccess;
    }
}
