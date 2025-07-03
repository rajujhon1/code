package day1;

import java.util.Scanner;

public class MainLogicalOperator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);       
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have a driving license? (true/false): ");
        boolean hasLicense = scanner.nextBoolean();

        
        if (age >= 18 && hasLicense) {
            System.out.println("You are allowed to drive.");
        } else {
            System.out.println("You cannot drive.");
        }

        scanner.close();
	}

}
