package MultiLevelInheritance;

public class SavingsAccount extends Account {
	
	public double interestRate;

	public SavingsAccount(int accountNumber, String accountHolder, double balance) {
		super(accountNumber, accountHolder, balance);
		
		this.interestRate=interestRate;
		
	}
	 
	public void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest applied: $" + interest + "New Balance: $" + balance);
    }
}
	
	