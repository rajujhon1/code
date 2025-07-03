package day1;

import java.util.Scanner;

public class Mainassignmentoperators {

	public static void main(String[] args) {
		
		
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        
        System.out.println("Initial value of a: " + a); 
        System.out.println("After a += 5: " + a);          
        System.out.println("After a -= 3: " + a); 
        System.out.println("After a *= 2: " + a); 
        System.out.println("After a /= 4: " + a);  
        System.out.println("After a %= 5: " + a); 

	}

}
