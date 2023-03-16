
public class Account {

    //properties
    private int accountNo;
    private String name;
    private String address;
    private int phoneNo;
    private int dob;
    private int balance;

    public Account(int accountNO, String name, String address, int phoneNo,
                   int dob, int balance){
        this.accountNo = accountNO;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void closeAccount(){

        System.out.println("Account Closed Successfully");
    }

    @Override
    public String toString() {
        return "Account Details - " + '{' +
                "accountNo=" + accountNo +
                "\nName='" + name  +
                "\nAddress='" + address + '\'' +
                "\nPhoneNo=" + phoneNo +
                "\nDob=" + dob +
                "\nBalance=" + balance +
                '}';
    }
}
