package MultiLevelInheritance;

public class AccountMain {

	public static void main(String[] args) {
		
        CustomerAccount customer = new CustomerAccount(123456789, "Ramesh", 20000.0);

		        customer.showCustomerSummary();
		        customer.deposit(5000);
		        customer.withdraw(3000);
		        customer.applyInterest();

	}
}
	


