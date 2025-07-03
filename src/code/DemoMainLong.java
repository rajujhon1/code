package code;

import java.util.Scanner;

public class DemoMainLong {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Enter Longnumber_one Number");		
		
		long Longnumber_one = scanner.nextLong();		
		
		System.out.println("Enter Longnumber_two Number");	
		long Longnumber_two = scanner.nextLong();
		
		Demolong demolong = new DemoLong();
		
		long long_output_add = demolong.Add(Longnumber_one, Longnumber_two);
		long long_output_sub = demolong.Sub(Longnumber_one, Longnumber_two);
		long long_output_mul = demolong.Mul(Longnumber_one, Longnumber_two);
		long long_output_div = demolong.Div(Longnumber_one, Longnumber_two);
		long long_output_modul = demolong.Modul(Longnumber_one, Longnumber_two);
				
				System.out.println("Addition          ="+ long_output_add);
				System.out.println("Subtraction       ="+ long_output_add);
				System.out.println("Multiplication    ="+ long_output_add);
				System.out.println("Division          ="+ long_output_add);
				System.out.println("Modulus           ="+ long_output_add);
		

	}

}
