package code;

import java.util.Scanner;

public class DemoMainDouble {



	public static void main(String[] args, String output_add, String output_sub, String output_mul, String output_div, String output_modul) {
		
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Enter Doublenumber_one Number");		
		
		double Doublenumber_one = scanner.nextDouble();		
		
		System.out.println("Enter Doublenumber_two Number");	
		double Doublenumber_two = scanner.nextDouble();
		
		DemoDouble demodouble = new DemoDouble();
		
		double  double_output_add = demodouble.Add(Doublenumber_one, Doublenumber_two);
		double  double_output_sub = demodouble.Sub(Doublenumber_one, Doublenumber_two);
		double double_output_mul = demodouble.Multi(Doublenumber_one, Doublenumber_two);
		double  double_output_div = demodouble.Div(Doublenumber_one, Doublenumber_two);
		double double_output_modul = demodouble.Modul(Doublenumber_one, Doublenumber_two);
				
				System.out.println("Addition          ="+ output_add);
				System.out.println("Subtraction       ="+ output_sub);
				System.out.println("Multiplication    ="+ output_mul);
				System.out.println("Division          ="+ output_div);
				System.out.println("Modulus           ="+ output_modul);
		
	}
}

