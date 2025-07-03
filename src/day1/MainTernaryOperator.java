package day1;

public class MainTernaryOperator {

   
    public int findMinimum(int a, int b) {
        return (a < b) ? a : b;
    }

    
    public int findMaximum(int a, int b) {
        return (a > b) ? a : b;
    }


    public String checkEvenOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

	public static void main(String[] args, MainTernaryOperator demo) {
		
		MainTernaryOperator demo1 = new MainTernaryOperator();

        int num1 = 10, num2 = 5;

        
        System.out.println("Minimum: " + demo1.findMinimum(num1, num2));
        System.out.println("Maximum: " + demo1.findMaximum(num1, num2));
        System.out.println(num1 + " is " + demo1.checkEvenOdd(num1));
        System.out.println(num2 + " is " + demo1.checkEvenOdd(num2));
	}

   }


