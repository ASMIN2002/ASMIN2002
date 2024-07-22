package com.asmin.MANY_TO_MANY_CONSTRUCTOR;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course("C-111", "JAVA", 3000);
		Course course2 = new Course("C-222", "PYTHON", 6000);
		Course course3 = new Course("C-333", "DEVOPS", 3000);
		
		Course[] course = {course1,course2,course3};
		
		Student student1 = new Student("S-111", "AAA", "HYD", course);
		Student student2 = new Student("S-222", "BBB", "BNGL", course);
		Student student3 = new Student("S-333", "CCC", "ODISHA", course);
		
		student1.getStudentDetails();
		student2.getStudentDetails();
		student3.getStudentDetails();
		
	}

}
