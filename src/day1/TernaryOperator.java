package day1;

public class TernaryOperator {
	
	 public int findMinimum(int a, int b) {
	        return (a < b) ? a : b;
	    }

	    
	    public int findMaximum(int a, int b) {
	        return (a > b) ? a : b;
	    }

	  
	    public String checkEvenOdd(int num) {
	        return (num % 2 == 0) ? "Even" : "Odd";
	    }

}
