package Inheritance;

public class PersonMain {
	
	public static void main(String[] args) {
		
        Student s1 = new Student("Alice", 20, "Computer Science");
        Student s2 = new Student("Bob", 22, "Electrical Engineering");

        System.out.println("== Student Details ==");
        s1.displayInfo();
        s2.displayInfo();

    }
}
