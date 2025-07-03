package code;

import java.util.ArrayList;
import java.util.List;

public class Bike1 {

	public static void main(String[] args) {
		
		Bike Bike_0=new Bike("Yamaha R15", "KA01 AB1234", 180000.00);
        Bike bike_1 =new Bike("Royal Enfield Classic 350", "MH02 XY5678", 220000.00);
        Bike bike_2 =new Bike("KTM Duke 390", "DL03 LM9012", 300000.00);
        
        System.out.println("Bike_0");
        
List<Bike>list =new ArrayList<Bike>();

      list.add(Bike_0);
      list.add(bike_1);
      list.add(bike_2);
      
      for (Bike data:list) {
    	  
    	  System.out.println(data.BikeNumber);
    	  System.out.println(data.BikeNumber);
    	  System.out.println(data.BikeCost);
      }
        

	}

}
