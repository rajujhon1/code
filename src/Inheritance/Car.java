package Inheritance;

public class Car extends Vehicle {
	    int doors;

	    public Car(String brand, int speed, int doors) {
	        super(brand, speed); 
	        this.doors = doors;
	    }

	    public void honk() {
	        System.out.println(brand + " is honking!");
	    }

	   
	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Doors: " + doors);
	    }
	}


