package HierarchicalInheritance;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter the UserName");
		String UserName= sc.next();
		
		System.out.println("Enter the Password");
		String Password= sc.next();
		
		System.out.println("Enter the ProductName");
		String ProductName= sc.next();
		
		Customer CustomerData= new Customer(UserName,Password,ProductName);
		CustomerData.Customer();

	}

}
