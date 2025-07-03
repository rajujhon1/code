package code;

public class Stringexample {

	public static void main(String[] args) {
		
		String greeting = "Hello, Java!";
        String name = "Alice";
        String upperCaseGreeting = greeting.toUpperCase();
        int length = greeting.length();
        String combined = greeting + " My name is " + name + ".";

        System.out.println("Original String: " + greeting);
        System.out.println("Uppercase: " + upperCaseGreeting);
        System.out.println("Length: " + length);
        System.out.println("Concatenation: " + combined);
	}

}
