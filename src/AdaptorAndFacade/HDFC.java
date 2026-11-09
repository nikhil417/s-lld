package AdaptorAndFacade;

public class HDFC implements BankAPI{

    @Override
    public void send(int amt) {
        System.out.println("Sent money from HDFC");
    }
}
