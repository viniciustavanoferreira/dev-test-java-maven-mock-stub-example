public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public Account(Account acc) {
        this.balance = acc.balance();
    }

    public void deposit(int balance) {
        this.balance += balance;
    }

    private boolean checkSufficientFunds(int balance) {
        if (this.balance >= balance)
            return true;
        else
            return false;
    }

    public int balance() {
        return this.balance;
    }

    public void withdraw(int balance) throws InsufficientFundsException {
        if (checkSufficientFunds(balance))
            this.balance -= balance;
        else
            throw new InsufficientFundsException("Insufficiente funds.");
    }

    public void transfer(int balance, Account acc) throws InsufficientFundsException {
        acc.withdraw(balance);
        deposit(balance);
    }

}