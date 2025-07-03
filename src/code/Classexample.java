package code;

   class Car {
   String brand;
   int speed;
   
   Car(String brand, int speed) {
     this.brand = brand;
     this.speed = speed;
 }

 void display() {
     System.out.println("Car Brand: " + brand);
     System.out.println("Speed: " + speed + " km/h");
 }
}

public class Classexample {
 public static void main(String[] args) {
     
     Car myCar = new Car("Tesla", 200);
     myCar.display();
 }
}

