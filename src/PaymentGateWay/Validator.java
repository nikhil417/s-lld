package PaymentGateWay;

public interface Validator<T> {
    boolean validate(T details);
}
