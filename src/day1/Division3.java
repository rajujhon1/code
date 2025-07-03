package day1;

public class Division3 {

	public static void main(String[] args) {
		int num1 = 40;
		int num2 = 3;
		
		int quotientInt = num1 / num2;
		double quotientDouble =(double) num1 / num2;
		System.out.println("integer division:"+ num1 + "/" + num2 +"=" +quotientInt);
		System.out.println("Floating-point division:"+ num1 +"/" + num2 +"="+ quotientDouble);
	}

}
