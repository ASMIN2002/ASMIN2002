package in.sp.bean;

import org.springframework.stereotype.Component;

@Component
public class Student
{
	private String name;
	private int rollno;
	private float marks;
	
	
	public String getName() {
		return name;
	}
	public int getRollno() {
		return rollno;
	}
	public float getMarks() {
		return marks;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void display() {
		
		System.out.println("Name      : "+name);
		System.out.println("Roll No   : "+rollno);
		System.out.println("Marks     : "+marks);
		
	}

}
