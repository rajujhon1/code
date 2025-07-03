package code;

interface Animal {
 void makeSound(); 
}


class Dog implements Animal {
 public void makeSound() {
     System.out.println("Dog says: Woof! Woof!");
 }
}

public class Interfaceexample {
 public static void main(String[] args) {
	 
     Dog myDog = new Dog();
     myDog.makeSound();
 }
}

