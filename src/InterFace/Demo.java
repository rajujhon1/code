package InterFace;

public class Demo implements Demo_One , Demo_Two{

	@Override
	public String Data_One(String Name) {
		// TODO Auto-generated method stub
		return Name;
	}

	@Override
	public int Data_Two(int PhoneNo) {
		// TODO Auto-generated method stub
		return 93477365;
	}

	@Override
	public int Data_Three(int EmployeeId) {
		// TODO Auto-generated method stub
		return 101;
	}

	@Override
	public String Data_four(String Department) {
		// TODO Auto-generated method stub
		return "Police";
	}

	@Override
	public int Data_five(int Salary) {
		// TODO Auto-generated method stub
		return 50000;
	}

}
