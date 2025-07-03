package day1;

import java.util.Scanner;

public class whileloop1 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Enter numbers (0 to exit): ");
        num = scanner.nextInt();
        
        while (num != 0) {
            System.out.println("You entered: " + num);
            num = scanner.nextInt();
        }
        
        System.out.println("Exited loop.");
        scanner.close();

	}

}
