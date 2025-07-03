package day1;

public class Unaryoperator {
	
	 public int unaryPlus(int a) {
	        return +a;
	    }

	
	    public int unaryMinus(int a) {
	        return -a;
	    }

	   
	    public int preIncrement(int a) {
	        return ++a;
	    }

	   
	    public int postIncrement(int a) {
	        return a++;
	    }

	
	    public int preDecrement(int a) {
	        return --a;
	    }

	
	    public int postDecrement(int a) {
	        return a--;
	    }

	    public boolean logicalNot(boolean flag) {
	        return !flag;
	    }

	   
	    public int bitwiseComplement(int a) {
	        return ~a;
	    }


}
