package com.asmin.test.Hospital;

public class Hospital {
	HospitalController hospitalController = new HospitalController();
			
	public Hospital() {
		System.out.println();
		System.out.println("+================================================================================+");
		System.out.println("|                           HOSPITAL MANAGEMENT SYSTEM                           |");
		System.out.println("+================================================================================+\n");
		hospitalController.hospital();
	}
}
