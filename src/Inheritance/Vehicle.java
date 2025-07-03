package Inheritance;

public class Vehicle {
	
	
	    String brand;
	    int speed;

	    public Vehicle(String brand, int speed) {
	        this.brand = brand;
	        this.speed = speed;
	    }

	    public void start() {
	        System.out.println(brand + " vehicle is starting.");
	    }

	    public void displayInfo() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Speed: " + speed + " km/h");
	    }
	}


