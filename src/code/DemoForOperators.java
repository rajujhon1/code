package code;
	
import java.util.ArrayList;
import java.util.List;

public class DemoForOperators {
	
	   public static void main(String[] args) {
				
	   Person persons=new Person(1, "Jhon", 25);
	   Person person_data=new Person(2, "Raju", 21);
	   Person person_sec=new Person(3, "Ram", 23);
		        
	 
			        
       List<Person>list = new ArrayList<Person>();
			        
       list.add(persons);
       list.add(person_data);
       list.add(person_sec);
       
       for(Person data:list) {
    	   System.out.println(data.PersonId);
    	   System.out.println(data.Name);
    	   System.out.println(data.Age);
    	   
    	   
       }
   }

 }

