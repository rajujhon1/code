package Inheritance;

public class FulltimeEmployee extends Employee{
	
	public double bonus=2000.00;

	public FulltimeEmployee(int employeeId, String employeeName, double salary, int departmentId, int employeeCode, double bonus) {
		super(employeeId, employeeName, salary, departmentId, employeeCode);
		this.bonus=bonus;
		
	}
	@Override
	public void displayDetails() {
		
		super.displayDetails();
		System.out.println("bonus:"+bonus);
	}
	
	
	
	

}
