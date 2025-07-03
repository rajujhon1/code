package HierarchicalInheritance;

public class Adim extends User{
	
	String Reports;
	
	public Adim(String userName, String password,String reports) {
		super(userName, password);
		// TODO Auto-generated constructor stub
		
		this.Reports=reports;
	}

	void Adim () {
		
		System.out.println("Reports:"+Reports);
	}
	
	
}
