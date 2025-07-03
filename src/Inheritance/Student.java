package Inheritance;

public class Student extends Person {
	
	public String course;

    public Student(String name, int age, String course) {
        super(name, age); // calling Person constructor
        this.course = course;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Course: " + course);
        System.out.println("------------------------");
    }
}


