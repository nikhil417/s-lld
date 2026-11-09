package AdaptorAndFacade;

public class PhonePe {
    BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    public void makePayment(int amt) {
        bankAPI.send(amt);
    }
}
