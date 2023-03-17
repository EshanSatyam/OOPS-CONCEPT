
public class LoanAccount extends Account {

    private double loanAmount;
    private double EMI;
    private int tenure;
    private double interestRate;

    //Constructor

    public LoanAccount(int accountNO, String name, String address, int phoneNo, int dob, int balance) {
        super(accountNO, name, address, phoneNo, dob, balance);
        this.loanAmount = loanAmount;
        this.EMI = EMI;
        this.tenure = tenure;
        this.interestRate = interestRate;
    }

    //Getter and Setter Methods


    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getEMI() {
        return EMI;
    }

    public void setEMI(double EMI) {
        this.EMI = EMI;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    //Method to calculate EMI
    public void calculateEMI(){
        double r = interestRate / 1200;  // monthly interest rate
        double n = tenure * 12;          // number of months
        EMI = loanAmount * r * Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1);
    }

    //Method to Pay EMI
    public void payEMI(){
        if (getBalance() >= EMI){
            setBalance(getBalance() - EMI);
            System.out.println("EMI payment successful.");
            System.out.println("Current Balance: " + getBalance());
        }else {
            System.out.println("Insufficient balance. EMI Payment Unsuccessful.");
        }
    }

    //Method for top-up loan
    public void topUpLoan(double amount){
        if (amount <= 0){
            System.out.println("Operation Unsuccessful.");
            System.out.println("Please Enter Valid Amount");
        }else {
            loanAmount += amount;
            calculateEMI();
            System.out.println("Top-Up loan successful.");
            System.out.println("Current EMI: " + EMI);
        }
    }

    //Method for loan repayment
    public void repayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            System.out.println("Please enter a Valid Amount.");
        } else {
            double outstandingAmount = loanAmount - (EMI * (tenure * 12));
            if (amount > outstandingAmount) {
                double excessAmount = amount - outstandingAmount;
                setBalance(getBalance() + excessAmount);
                System.out.println("Loan fully repaid.");
                System.out.println("Excess amount get added to account balance.");
                System.out.println("Current balance: " + getBalance());
            } else {
                setBalance(getBalance() - amount);
                System.out.println("Partial loan repayment successful.");
                System.out.println("Outstanding amount: " + (outstandingAmount - amount));
                System.out.println("Current balance: " + getBalance());
            }
        }
    }
}
