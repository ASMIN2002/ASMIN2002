package com.asmin.exception;

// Use Of Throw keyword to generate an exception in our Java Application

class Student{
	int sid ;
	String sname;
	String saddr;
	int smark;
	
	Student(int sid,String sname,String saddr,int smark){
		this.sid=sid;
		this.sname=sname;
		this.saddr=saddr;
		this.smark=smark;	
	}
	public void getStudentdetails(){
		String status = "";
		System.out.println("Student details");
		System.out.println("_------------------");
		System.out.println("Student id    : "+sid);
		System.out.println("Student Name  : "+sname);
		System.out.println("Student address  : "+saddr);
		System.out.println("Student Mark    : "+smark);
		System.out.print("Student Status  : ");
		if(smark>=0 && smark <= 100){
			if(smark < 30) {
				status = "Fail";
			}else if(smark < 50) {
				status = "Pass";
			}else if(smark < 70) {
				status = "Very good";
			}else {
				status = "Excelient";
			}
		}else {
			throw new RuntimeException("Exception By chinu");
		}
		System.out.println(status);
	}
	
}


public class G {
	public static void main(String[] args) {
		Student s1 = new Student(1, "ASMIN", "HYD", 70);
		s1.getStudentdetails();
		System.out.println();
		
		Student s2 = new Student(1, "ASMIN", "HYD", 135);
		s2.getStudentdetails();
		
	}

}
