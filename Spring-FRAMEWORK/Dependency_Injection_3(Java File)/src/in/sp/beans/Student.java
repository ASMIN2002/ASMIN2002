package in.sp.beans;

public class Student 
{
	private int rollno;
	private String name;
	private Address address;
	
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Roll no   : "+rollno);
		System.out.println("Name      : "+name);
		System.out.println("Address   : "+address);
	}

}
