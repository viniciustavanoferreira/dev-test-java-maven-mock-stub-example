public class SavingsAccount extends Account {
    
    double interestRate;

    public SavingsAccount(double balance) {
        super(balance);
        this.interestRate = 0.01;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

}