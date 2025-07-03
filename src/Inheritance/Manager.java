package Inheritance;

public class Manager extends FulltimeEmployee{
	
	double noOfyearsExperice;

	public Manager(int employeeId, String employeeName, double salary, int departmentId, int employeeCode,
			double bonus,double noOfyearsExperice) {
		super(employeeId, employeeName, salary, departmentId, employeeCode, bonus);
		
		this.noOfyearsExperice=noOfyearsExperice;
		// TODO Auto-generated constructor stub		
	}


  @Override
  public void displayDetails() {
  super.displayDetails();
  System.out.println("No of Years Experice :"+noOfyearsExperice);

}
}