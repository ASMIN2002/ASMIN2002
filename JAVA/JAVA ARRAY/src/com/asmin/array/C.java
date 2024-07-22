package com.asmin.array;

public class C {
	public static void main(String[] args) {
		 int eno = 111;
		 String ename = "ASMIN";
		 String eaddr = "HYD";
		 float esal = 5000.0f;
		 String[] equal = {"10th","+2","BCA"};
		 String[] eskill = {"JAVA","ORACLE","UI"};
		 
		 System.out.println("EMPLOYEE DETAILS");
		 System.out.println("===================");
		 System.out.println("Employee Number  : "+eno);
		 System.out.println("Employee Name    : "+ename);
		 System.out.println("Employee Salary  : "+esal);
		 System.out.println("Employee Address : "+eaddr);
		 System.out.print("Employee Qualification  : ");
		 for(int index = 0;index < equal.length; index++) {
			 System.out.print(equal[index]+" ");
		 }
		 System.out.println();
		 System.out.print("Employee Skill   : ");
		 for(int index = 0; index < eskill.length;index++) {
			 System.out.print(eskill[index]+" ");
		 }
		 

	}

}
