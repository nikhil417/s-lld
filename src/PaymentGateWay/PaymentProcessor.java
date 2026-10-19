package PaymentGateWay;

public interface PaymentProcessor<T> {
    boolean processPayment(T details);
}
