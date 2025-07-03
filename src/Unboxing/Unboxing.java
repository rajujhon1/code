package Unboxing;

public class Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer data_one = 100000;
		int data_ones = data_one.intValue();
		System.out.println(data_ones);
		
		Float data_two = 65f;
		Float data_twos = data_two.floatValue();
		System.out.println(data_two);
		
		Short data_three = 60;
		short data_threes = data_three.shortValue();
		System.out.println(data_three);
		
		Byte data_four = 125;
		byte data_fours = data_four.byteValue();
		System.out.println(data_four);
		
		
		Character data_five = 'r';
		char data_fives = data_five.charValue();
		System.out.println(data_five);
		
		
		Double data_six = 6220.00;
		double data_sixs = data_six.doubleValue();
		System.out.println(data_six);
		
		Boolean data_seven = true;
		boolean data_sevens = data_seven.booleanValue();
		System.out.println(data_seven);
		
	    String  data_eight = "552321";
		long String_data_eights = Long.parseLong(data_eight);
		System.out.println(data_eight);
		
	    String  Byte_data = "121";
	    byte Byte_datas = Byte.parseByte(Byte_data);
	    System.out.println(Byte_data);



	}

}
