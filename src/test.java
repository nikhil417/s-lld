import java.util.concurrent.locks.ReentrantLock;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

public class AccountTransfer {


    public static boolean transfer(
            Account from,
            Account to,
            int amount) {

        try {
            if (from == null || to == null || amount <= 0) {
                return false;
            }
            if (from.getBalance() < amount) {
                throw new InsufficientFundsException("Insufficient Balance");
            }

            from.setBalance(from.getBalance() - amount);
            to.setBalance(to.getBalance() + amount);

            System.out.println("Transfer completed");
            return true;

        } catch (ArithmeticException | InsufficientFundsException e) {
            System.out.println("Transfer failed");
            return false;

        }
    }
}
