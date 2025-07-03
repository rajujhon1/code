package MultiLevelInheritance;

public class Account {
	
	public int accountNumber;
	public String accountHolder;
	public double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void showAccountInfo() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: ₹" + balance);
    }
}


