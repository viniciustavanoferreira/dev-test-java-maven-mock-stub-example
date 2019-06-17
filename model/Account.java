public class Account {

    private int balance;

    public Account(int amt){
        this.balance = amt;
    }

    public Account(Account acc){
        this.balance = acc.balance();
    }

    public void deposit(int amt){
        this.balance += amt;
    }

    private boolean checkSufficientFunds(int amt){
        if (this.balance >= amt)
            return true;
        else
            return false;
    }

    public int balance(){
        return this.balance;
    }

    public void withdraw(int amt) throws InsufficientFundsException{
        if (checkSufficientFunds(amt))
            this.balance -= amt;
        else
            throw new InsufficientFundsException("Insufficiente funds.");
    }

    public void transfer(int amt, Account acc) throws InsufficientFundsException{
        acc.withdraw(amt);
        deposit(amt);
    }

}