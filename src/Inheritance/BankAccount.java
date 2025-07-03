package Inheritance;

public class BankAccount {
	public int accountNumber;
	public String accountHolder;
	public double balance;

	    public BankAccount(int accountNumber, String accountHolder, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient balance.");
	        }
	    }

	    public void displayDetails() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Balance: " + balance);
	    }
	}



