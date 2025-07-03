package InterFace;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Student_Data=new Student();
		
		System.out.println(Student_Data.Get_AdmissionNo(195211));
		System.out.println(Student_Data.Get_InterCollege("Narayana jr college"));
		System.out.println(Student_Data.Get_Group("Mpc"));
		System.out.println(Student_Data.Get_StudentName("Raju"));
		System.out.println(Student_Data.Get_RollNo(52));

	}

}