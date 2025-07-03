package day1;

public class Bitwiseoperator {
	
	  Bitwiseoperator bitwise = new Bitwiseoperator();
      int a = 5, b = 3;

	
	 public int bitwiseAnd(int a, int b) {
	        return a & b;
	    }

	   
	    public int bitwiseOr(int a, int b) {
	        return a | b;
	    }

	    
	    public int bitwiseXor(int a, int b) {
	        return a ^ b;
	    }

	    
	    public int bitwiseComplement(int a) {
	        return ~a;
	    }

	  
	    public int leftShift(int a, int positions) {
	        return a << positions;
	    }

	  
	    public int rightShift(int a, int positions) {
	        return a >> positions;
	    }

	    
	    public int unsignedRightShift(int a, int positions) {
	        return a >>> positions;
	    }

}
	

 


