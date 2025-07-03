package code;

public class Floatexample {

	public static void main(String[] args) {
		
		float price = 99.99f;
        float pi = 3.14159f;
        float discount = 5.5f;

        
        float newPrice = price - discount;
        float areaOfCircle = pi * (5 * 5); 

        System.out.println("Original Price: $" + price);
        System.out.println("Discount: $" + discount);
        System.out.println("New Price after Discount: $" + newPrice);
        System.out.println("Value of Pi: " + pi);
        System.out.println("Area of Circle (radius = 5): " + areaOfCircle);
	}

}
