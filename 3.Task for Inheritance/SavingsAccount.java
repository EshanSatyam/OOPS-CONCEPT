
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

    //method for withdraw

    public void withdraw(double amount){

        if (amount <= 0){
            System.out.println("Please enter valid Amount");
        } else if (amount > getBalance()) {
            System.out.println("Sorry! You are having Insufficient Balance");
        }else {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal Successful!");
            System.out.println("Current Balance: " + getBalance());
        }
    }

    //method for Deposit

    public void Deposit(double amount){
        if (amount <= 0){
            System.out.println("Cannot complete process. Please enter valid amount");
        }else {
            setBalance(getBalance() + amount);
            System.out.println("Deposit Successful");
            System.out.println("Current Balance: " + getBalance());
        }
    }

    //Method for Fixed Deposit

    public void fixedDeposit(double amount, int years, double interestRate) {
        if (amount <= 0 || years <= 0 || interestRate <= 0) {
            System.out.println("Invalid Operations. Please enter valid values for amount, years, and interest rate.");
        } else {
            double maturityAmount = amount * Math.pow((1 + interestRate / 100), years);
            setBalance(getBalance() + maturityAmount);
            System.out.println("Fixed deposit successful. Maturity amount: " + maturityAmount + ", Current balance: " + getBalance());
        }
    }
}

