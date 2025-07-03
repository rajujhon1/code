package day1;

import java.util.Scanner;

public class DemoMainAssign {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        
        DemoAssign demo = new DemoAssign();

        
        int output_simple = demo.Simpleassign(a, b);
        int output_add = demo.Add_Equal(a, b);
        int output_sub = demo.Sub_Equal(a, b);
        int output_mul = demo.Multi_Equal(a, b);
        int output_div = demo.Div_Equal(a, b);
        int output_modul = demo.Modul_Equal(a, b);

       
        System.out.println("Simple Assign = " + output_simple);
        System.out.println("Add Equal = " + output_add);
        System.out.println("Sub Equal = " + output_sub);
        System.out.println("Multi Equal = " + output_mul);
        System.out.println("Div Equal = " + output_div);
        System.out.println("Modul Equal = " + output_modul);

	}

}
