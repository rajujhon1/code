package MultiLevelInheritance;

public class CustomerAccount extends SavingsAccount  {
	
	public String customerId;

	public CustomerAccount(int accountNumber, String accountHolder, double balance) {
		super(accountNumber, accountHolder, balance);
		this.customerId=customerId;
		
	}
	
	public void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited. New Balance: $" + balance);
    }

	public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn. Remaining Balance: $" + balance);
        }
    }
	
	public void showCustomerSummary() {
        showAccountInfo();
        System.out.println("Customer ID: " + customerId);
    }
}

