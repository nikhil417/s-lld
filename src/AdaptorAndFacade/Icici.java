package AdaptorAndFacade;

public class Icici implements BankAPI{

    @Override
    public void send(int amt) {
        System.out.println("Send money from ICICI");
    }
}
