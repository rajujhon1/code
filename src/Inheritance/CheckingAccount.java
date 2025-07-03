package Inheritance;

public class CheckingAccount {
	
	public double overdraftLimit;

    public CheckingAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super();
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        double balance = 0;
		if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

	
	}

   

	

