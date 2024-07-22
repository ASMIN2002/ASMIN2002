package com.asmin.MANY_TO_ONE_CONSTRUCTOR_DEPENDENCY;

public class Hospital {
		private String hospid;
		private String hospName;
		private String hospAddr;
		private Doctor doctor;
		
		public Hospital(String hospid, String hospName, String hospAddr, Doctor doctor) {
			
			this.hospid = hospid;
			this.hospName = hospName;
			this.hospAddr = hospAddr;
			this.doctor = doctor;
		}
		public void hospDetails() {
			System.out.println("Hospital Details");
			System.out.println("---------------------");
			System.out.println("Hospital Id       : "+hospid);
			System.out.println("Hospital Name     : "+hospName);
			System.out.println("Hospital Address  : "+hospAddr);
			System.out.println();
			doctor.getdoctordetails();
			System.out.println();
		}
		
}
