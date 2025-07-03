package TrycatchFinally;

public class trycatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1, 2, 3};

        try {
            System.out.println("Accessing 5th element: " + numbers[4]);
        }
        
        catch (ArrayIndexOutOfBoundsException e) {
        	
            System.out.println("Error: Array index is out of bounds!");
        }
        
        finally {
        	
            System.out.println("Finally block executed.");
        }
  
	}

}


