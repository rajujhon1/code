package Inheritance;

public class Main1 {
	
	public static void main(String[] args) {
	
	SavingsAccount savings = new SavingsAccount(1001, "Alice", 1000.0, 5.0);
    CheckingAccount checking = new CheckingAccount(1002, "Bob", 500.0, 300.0);

    System.out.println("==== Savings Account ====");
    savings.displayDetails();
    savings.deposit(200);
    savings.withdraw(100);
    savings.addInterest();
    savings.displayDetails();

	}
}

