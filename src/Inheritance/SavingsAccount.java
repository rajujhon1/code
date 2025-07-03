package Inheritance;

public class SavingsAccount {
	
	public static double balance = 0;
	public double interestRate;

	    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
	        super();
	        this.interestRate = interestRate;
	    }

	    public void applyInterest() {
	        double interest = balance * interestRate / 100;
	        balance += interest;
	        System.out.println("Interest Applied: " + interest);
	    }

		public void displayDetails() {
			// TODO Auto-generated method stub
			
		}

		public void withdraw(int i) {
			// TODO Auto-generated method stub
			
		}

		public void deposit(int i) {
			// TODO Auto-generated method stub
			
		}

		public void addInterest() {
			// TODO Auto-generated method stub
			
		}

		
		}
		



