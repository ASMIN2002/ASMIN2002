package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student 
{
	private String name;
	private int rollno;
	
	@Autowired
	@Qualifier("createAdd2")
	private Address address;
	
	public String getName() {
		return name;
	}
	public int getRollno() {
		return rollno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void display() {
		System.out.println("Name    : "+name);
		System.out.println("Rollno  : "+rollno);
		System.out.println("Address : "+address);
	}

}
