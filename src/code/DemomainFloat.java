package code;

import java.util.Scanner;

public class DemomainFloat {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Enter Floatnumber_one Number");		
		
		float Floatnumber_one = scanner.nextFloat();		
		
		System.out.println("Enter Floatnumber_two Number");	
		float Floatnumber_two = scanner.nextFloat();
		
		DemoFloat demoFloat = new DemoFloat();
		
		float  float_output_add = demoFloat.Add(Floatnumber_one, Floatnumber_two);
		float  float_output_sub = demoFloat.Sub(Floatnumber_one, Floatnumber_two);
		float  float_output_mul = demoFloat.Multi(Floatnumber_one, Floatnumber_two);
		float  float_output_div = demoFloat.Div(Floatnumber_one, Floatnumber_two);
		float  float_output_modul = demoFloat.Modul(Floatnumber_one, Floatnumber_two);
				
				System.out.println("Addition          ="+ 	float_output_add);
				System.out.println("Subtraction       ="+ 	float_output_sub);
				System.out.println("Multiplication    ="+ 	float_output_mul);
				System.out.println("Division          ="+ 	float_output_div);
				System.out.println("Modulus           ="+	float_output_modul);
		
			
	}

}
