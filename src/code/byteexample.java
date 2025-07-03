package code;

public class byteexample {

	public static void main(String[] args) {
		
		byte num1 = 100;  
        byte num2 = 20;
        
       
        byte sum = (byte) (num1 + num2); 
        byte difference = (byte) (num1 - num2);
        byte product = (byte) (num1 * num2);
        byte quotient = (byte) (num1 / num2);

       
        System.out.println("Byte 1: " + num1);
        System.out.println("Byte 2: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
	}

}
