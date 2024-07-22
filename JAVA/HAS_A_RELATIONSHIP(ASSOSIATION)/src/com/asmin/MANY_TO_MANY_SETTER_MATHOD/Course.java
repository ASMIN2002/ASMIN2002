package com.asmin.MANY_TO_MANY_SETTER_MATHOD;

public class Course {
	private String cid;
	private String cname;
	private int ccost;
	
	private Student[] students;

	public String getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	public int getCcost() {
		return ccost;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setCcost(int ccost) {
		this.ccost = ccost;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
		
	public void getCourseDetails() {
		System.out.println("Course Details");
		System.out.println("---------------------");
		System.out.println("Course Id        : "+cid);
		System.out.println("Course Name      : "+cname);
		System.out.println("Course Cost      : "+ccost);
		System.out.println("SID\tSNAME\tSADDR");
		System.out.println("---------------------------");
		for(Student student:students) {
			System.out.print(student.getSid()+"\t");
			System.out.print(student.getSname()+"\t");
			System.out.print(student.getSaddr()+"\n");
		}
		System.out.println();
	}
}







