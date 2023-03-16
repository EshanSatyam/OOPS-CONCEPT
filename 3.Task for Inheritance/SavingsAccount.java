
public class SavingsAccount extends Account {

    private double interestRate;

    //Constructor
    public SavingsAccount(int accountNO, String name, String address, int phoneNo, int dob, int balance) {
        super(accountNO, name, address, phoneNo, dob, balance);

        this.interestRate = interestRate;
        }
    //Getter and Setter methods for interestRate
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    //method to calculate interestRate
    public double calculateInterest() {

        return getBalance()*interestRate/100;
    }
}

