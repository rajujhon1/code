package Inheritance;

public class EmployeeMain {

	public static void main(String[] args) {
		
		FulltimeEmployee fulltimeEmployeeData = new FulltimeEmployee(5,"raju",25000.00,1,25,2000.00);
		fulltimeEmployeeData.displayDetails();
		
		 HRmanager  HRmanagerData= new  HRmanager(1,"ram",30000.00,1,122,25000.00,2);
		 HRmanagerData.displayDetails();
		 
		 
		 SeniorManager SeniorManagerData=new SeniorManager(2, "Raju", 50000.00, 234, 12345, 5000.00, 5);
		 SeniorManagerData.displayDetails();
	}

}

