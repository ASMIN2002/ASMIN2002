package com.asmin.MANY_TO_ONE_SETTER_METHOD_DEPENDENCY;

public class Main {

	public static void main(String[] args) {
		Branch branch = new Branch();
		branch.setBranchId("B-111");
		branch.setBranchName("JAVA");
			
		Student student1 = new Student();
		student1.setSid("s-111");
		student1.setSname("ASMIN");
		student1.setSaddr("HYD");
		student1.setBranch(branch);
		
		Student student2 = new Student();
		student2.setSid("s-222");
		student2.setSname("CHINMAY");
		student2.setSaddr("BNGL");
		student2.setBranch(branch);
		
		Student student3 = new Student();
		student3.setSid("s-333");
		student3.setSname("PRITAM");
		student3.setSaddr("CHENNAI");
		student3.setBranch(branch);
		
		student1.getStudentdetails();
		student2.getStudentdetails();
		student3.getStudentdetails();
		
		
	}

}
