package day1;

public class MainUnaryoperator {

	public static void main(String[] args) {
		
		 Unaryoperator demo = new Unaryoperator();

	        int num = 5;
	        boolean flag = true;

	        System.out.println("Unary Plus: " + demo.unaryPlus(num));
	        System.out.println("Unary Minus: " + demo.unaryMinus(num));
	        System.out.println("Pre-Increment: " + demo.preIncrement(num));
	        System.out.println("Post-Increment: " + demo.postIncrement(num)); 
	        System.out.println("Pre-Decrement: " + demo.preDecrement(num));
	        System.out.println("Post-Decrement: " + demo.postDecrement(num)); 
	        System.out.println("Logical NOT: " + demo.logicalNot(flag));
	        System.out.println("Bitwise Complement: " + demo.bitwiseComplement(num));
	}

}
