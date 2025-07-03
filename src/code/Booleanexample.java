package code;

public class Booleanexample {

	public static void main(String[] args) {
		
		boolean isJavaFun = true;
        boolean isRaining = false;
        
        int num1 = 10, num2 = 20;

        boolean isGreater = num1 > num2;

        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is it raining? " + isRaining);
        System.out.println("Is " + num1 + " greater than " + num2 + "? " + isGreater);

        
        if (isJavaFun) {
            System.out.println("Yes! Java is fun!");
        } else {
            System.out.println("No, Java is not fun.");

	}

  }
	
}
