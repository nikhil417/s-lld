package AdaptorAndFacade;

public class Client {

    public static void main(String[] args) {
        PhonePe payment = new PhonePe(new Icici());
        payment.makePayment(243);
    }


}
