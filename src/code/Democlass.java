package code;

import java.util.Scanner;

public class Democlass {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter number_one Number");		
		
		int number_one = sc.nextInt();		
		
		System.out.println("Enter number_two Number");	
		int number_two = sc.nextInt();
		
		Demo demo = new Demo();
		int output_add = demo.Add(number_one, number_two);
		int output_sub = demo.Sub(number_one, number_two);
		int output_mul = demo.Mul(number_one, number_two);
		int output_div = demo.Div(number_one, number_two);
		int output_modul = demo.Modul(number_one, number_two);
				
				System.out.println(output_add);
				System.out.println(output_sub);
				System.out.println(output_mul);
				System.out.println(output_div);
				System.out.println(output_modul);
				

	}

}
