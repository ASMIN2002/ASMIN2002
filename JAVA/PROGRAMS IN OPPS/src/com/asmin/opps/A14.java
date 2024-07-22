package com.asmin.opps;

// use of setter method and getter method

class B2{
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	
	public void seteno(int eno) {
		this.eno= eno;
	}
	public int geteno() {
		return eno;
	}
	public void setename(String ename) {
		this.ename=ename;
		
	}
	public String getename() {
		return ename;
	}
	public void setesal(float esal) {
		this.esal=esal;
	}
	public float getesal() {
		return esal;
	}
	public void seteaddr(String eaddr) {
		this.eaddr=eaddr;
	}
	public String geteaddr() {
		return eaddr;
	}
	
}

public class A14 {
	public static void main(String[] args) {
		B2 b = new B2();
		b.seteno(111);
		b.setename("ASMIN");
		b.setesal(3000.0f);
		b.seteaddr("HYD");
		
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("__________________");
		System.out.println("Employee Number     : "+b.geteno());
		System.out.println("Employee Name       : "+b.getename());
		System.out.println("Employee Salary     : "+b.getesal());
		System.out.println("Employee Address    : "+b.geteaddr());
 
	}

}
