package MultiLevelInheritance;

public class Meesho {
	
	public int staffId;
    public String staffName;
    public double salary;
    public int department;
    public int employeeCode;
    
    public Meesho(int staffId, String staffName, double salary, int i, int employeeCode) {
    	
    	this.staffId=staffId;
    	this.staffName=staffName;
    	this.salary = salary;
        this.department = i;
        this.employeeCode = employeeCode;
    }
    
    public void displayDetails() {
    	
    	System.out.println("Staff ID: " + staffId + ", Name: " + staffName + ", Department: " + department + ", Salary: $" + salary);
    	 
    }
}
