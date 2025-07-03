package code;

import java.util.ArrayList;
import java.util.List;

public class FruitsMain {

	public static void main(String[] args) {
		
		Fruits Fruits_0=new Fruits("Apple", "Red", 150.00);
        Fruits Fruits_2=new Fruits("Banana", "Yellow", 50.00);
        Fruits Fruits_3=new Fruits("Orange", "Orange", 80.00);
        
        System.out.println(Fruits_0);
        
 List<Fruits>list =new ArrayList<Fruits>();  
      
       list.add(Fruits_0);
       list.add(Fruits_2);
       list.add(Fruits_3);
       
       for(Fruits data:list) {
    	   
    	   System.out.println(data.FruitsName);
    	   System.out.println(data.FruitsColor);
    	   System.out.println(data.FruitsPricePerkg);
       }
        
	}

}
