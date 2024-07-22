package com.asmin.opps;

class AB1{
	private int sno;
	private String ename ;
	private String eaddr;
	
	public void setsno(int sno) {
		this.sno=sno;
	}
	public int getsno() {
		return sno;
	}
	public void setename (String ename) {
		this.ename=ename;
	}
	public String getename() {
		return ename;
	}
	public void seteaddr(String eaddr) {
		this.eaddr=eaddr;
	}
	public String getEaddr() {
		return eaddr;
	}
}
public class A15 {
	public static void main(String[] args) {
		AB1 ab = new AB1();
		ab.setsno(111);
		ab.setename("ASMIN");
		ab.seteaddr("BLS");
		
		System.out.println("EMployee Details ");
		System.out.println("_____________________");
		System.out.println("Employee Number    : "+ab.getsno());
		System.out.println("Employee Name      : "+ab.getename());
		System.out.println("Employee Address   : "+ab.getEaddr());
		

	}

}
