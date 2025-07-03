package Inheritance;

public class Animalmain {
	
	    public static void main(String[] args) {
	        Dog dog = new Dog("Buddy");
	        Cat cat = new Cat("Luna");
	        Bird bird = new Bird("Tweety");

	        dog.makeSound();
	        cat.makeSound();
	        bird.makeSound();
	    }
}
