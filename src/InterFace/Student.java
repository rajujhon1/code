package InterFace;

public class Student implements StudentInfo_one , StudentInfo_Two {

	@Override
	public String Get_StudentName(String getStudentName) {
		// TODO Auto-generated method stub
		return getStudentName;
	}

	@Override
	public int Get_RollNo(int RollNo) {
		// TODO Auto-generated method stub
		return RollNo;
	}

	@Override
	public int Get_AdmissionNo(int GetAdmissionNo) {
		// TODO Auto-generated method stub
		return  GetAdmissionNo;
	}

	@Override
	public String Get_InterCollege(String GetInterCollege) {
		// TODO Auto-generated method stub
		return GetInterCollege;
	}

	@Override
	public String Get_Group(String Group) {
		// TODO Auto-generated method stub
		return Group;
	}

}
