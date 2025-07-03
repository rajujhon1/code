package Constructor;

public class Constructor {                                 //class create.
	String brand;                                         //properties.
	public Constructor() {                               //Constructor.
		brand = "Tata";                                 //properties ki name.
		System.out.println("defaultconstructor");      
	}
      
	  public void displayinfo() {                    //Acess Modifier, Data Type, Method Name.
		  System.out.println("brand:"+brand);
	  }
}
