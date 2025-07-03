package code;

import java.util.ArrayList;
import java.util.List;

public class CarMain {

	public static void main(String[] args) {
		
		Car Car_0=new Car("Honda City", "KA01 AB1234", 950000.00);
		Car Car_1 =new Car("Toyota Fortuner", "MH02 XY5678", 4200000.00);
		Car Car_2 =new Car("Hyundai Creta", "DL03 LM9012", 1800000.00);

        System.out.println("Bike_0");
        
List<Car> list =new ArrayList<Car>();

      list.add(Car_0);
      list.add(Car_1);
      list.add(Car_2);
      
      for (Car data:list) {
    	  
    	  System.out.println(data.CarModel);
    	  System.out.println(data.CarNumber);
    	  System.out.println(data.CarPrice);
      }
        

	}

}