package com.asmin.MANY_TO_MANY_SETTER_MATHOD;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setSid("S-111");
		student1.setSname("AAA");
		student1.setSaddr("HYD");
		
		Student student2 = new Student();
		student2.setSid("S-222");
		student2.setSname("BBB");
		student2.setSaddr("BNGL");
		
		Student student3 = new Student();
		student3.setSid("S-333");
		student3.setSname("CCC");
		student3.setSaddr("CHENNAI");
		
		Student[] students1 = {student1,student2,student3};
		Student[] students2 = {student1,student2};
		Student[] students3 = {student2,student3};
		
		Course course1 = new Course();
		course1.setCid("C-111");
		course1.setCname("JAVA");
		course1.setCcost(5000);
		course1.setStudents(students1);
		
		Course course2 = new Course();
		course2.setCid("C-222");
		course2.setCname("PYTHON");
		course2.setCcost(3000);
		course2.setStudents(students2);
		
		Course course3 = new Course();
		course3.setCid("C-333");
		course3.setCname("DEVOPS");
		course3.setCcost(4000);
		course3.setStudents(students3);
		
		course1.getCourseDetails();
		course2.getCourseDetails();
		course3.getCourseDetails();

	}

}
