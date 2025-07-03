package MultiLevelInheritance;

public class SellerSupport extends Meesho{
	
	public int sellersManaged;

	public SellerSupport(int staffId, String staffName, double salary, int i, int employeeCode ,int sellersManaged) {
		super(staffId, staffName, salary, i, employeeCode);
		this. sellersManaged=sellersManaged;
	}
	
	
	@Override
	public void displayDetails() {
		System.out.println("Sellers Managed: " + sellersManaged);
			
	}
	

}
