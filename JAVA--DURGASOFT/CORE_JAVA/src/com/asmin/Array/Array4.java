package com.asmin.Array;

public class Array4 {
	public static void main(String[] args) {
		int eno = 111;
		String ename = "ASMIN";
		float esal = 1000.0f;
		String eaddr = "HYD";
		String[] qual = {"BTech", "MCA", "BCA"};
		String[] skills = {"JAVA","PYTHON","AWS"};
		
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("==================");
		System.out.println("EMPLOYEE NUMBER      : "+eno);
		System.out.println("EMPLOYEE NAME        : "+ename);
		System.out.println("EMPLOYEE SALARY      : "+esal);
		System.out.println("EMPLOYEE ADDRESS     : "+eaddr);
		System.out.print("EMPLOYEE QUAL        : ");
		for(int index=0;index<qual.length;index++) {
			System.out.print(qual[index]+" ");
		}
		System.out.println();
		System.out.print("EMPLOYEE SKILLS      : ");
		for(int index=0;index<qual.length;index++) {
			System.out.print(skills[index]+" ");
		}
	}
}
