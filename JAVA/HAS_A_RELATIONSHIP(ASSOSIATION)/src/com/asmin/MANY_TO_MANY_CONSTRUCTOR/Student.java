package com.asmin.MANY_TO_MANY_CONSTRUCTOR;

public class Student {
		private String sid;
		private String sname;
		private String saddr;
		private Course[] course;
		
		public Student(String sid, String sname, String saddr, Course[] course) {
			
			this.sid = sid;
			this.sname = sname;
			this.saddr = saddr;
			this.course = course;
		}
		
		public void getStudentDetails() {
			System.out.println("Student Details");
			System.out.println("----------------------");
			System.out.println("Student Id          : "+sid);
			System.out.println("Student Name        : "+sname);
			System.out.println("Student Address     : "+saddr);
			System.out.println("CID\tCNAME\tCost");
			System.out.println("--------------------");
			for(Course cources:course) {
				System.out.print(cources.getCourseId()+"\t");
				System.out.print(cources.getCourseName()+"\t");
				System.out.print(cources.getCourseCost()+"\n");
			}
			System.out.println();
			System.out.println();
		}
		
}
