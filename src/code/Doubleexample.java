package code;

public class Doubleexample {

	public static void main(String[] args) {
		
		double price = 99.999;
        double pi = 3.141592653589793;
        double interestRate = 4.75;
        double radius = 7.5;
        double areaOfCircle = pi * (radius * radius); 
        double discountedPrice = price - (price * 0.10); 
        
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + discountedPrice);
        System.out.println("Value of Pi: " + pi);
        System.out.println("Area of Circle (radius = " + radius + "): " + areaOfCircle);
        System.out.println("Annual Interest Rate: " + interestRate + "%");
	}

}
