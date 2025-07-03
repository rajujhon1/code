package code;

public class Charexample {

	public static void main(String[] args) {
		
		char letter = 'A';
        char digit = '5';
        char symbol = '@';
        char unicodeChar = '\u2764'; 
        char nextLetter = (char) (letter + 1); 
        
        System.out.println("Letter: " + letter);
        System.out.println("Digit: " + digit);
        System.out.println("Symbol: " + symbol);
        System.out.println("Unicode Character (Heart): " + unicodeChar);
        System.out.println("Next Letter after 'A': " + nextLetter);
	}

}
