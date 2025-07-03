package MultiLevelInheritance;

public class GoogleProduct extends Product {
	
	public int Users;
	
	public GoogleProduct(String name,int Users) {
		super(name);
		this.Users=Users;
				
	}
	 
	@Override
	

	 public void displayName() {
		super.displayName();
		System.out.println("Users: " + Users + " million");
	}
	
}
