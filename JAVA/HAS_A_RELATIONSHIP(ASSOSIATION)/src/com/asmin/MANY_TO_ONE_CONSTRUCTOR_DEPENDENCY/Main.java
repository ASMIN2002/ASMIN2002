package com.asmin.MANY_TO_ONE_CONSTRUCTOR_DEPENDENCY;

public class Main {

	public static void main(String[] args) {
		Doctor doctor = new Doctor("D-111", "ASMIN", "MBBS,Bsc,Biology", "Heart");
		Hospital hospital1 = new Hospital("H-111", "SUM", "BBSR", doctor);
		Hospital hospital2 = new Hospital("H-222", "Jyoti", "Balasore", doctor);
		Hospital hospital3 = new Hospital("H-333", "Govt", "Cuttack", doctor);
		
		hospital1.hospDetails();
		hospital2.hospDetails();
		hospital3.hospDetails();
		

	}

}
