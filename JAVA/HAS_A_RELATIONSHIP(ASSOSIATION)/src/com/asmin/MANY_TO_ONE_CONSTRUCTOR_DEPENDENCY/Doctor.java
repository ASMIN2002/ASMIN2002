package com.asmin.MANY_TO_ONE_CONSTRUCTOR_DEPENDENCY;

public class Doctor {
		private String doctorid;
		private String doctorName;
		private String Qualification;
		private String Specialization;
		
		
		public Doctor(String doctorid, String doctorName, String qualification, String specialization) {
			
			this.doctorid = doctorid;
			this.doctorName = doctorName;
			Qualification = qualification;
			Specialization = specialization;
		}
		public void getdoctordetails() {
			System.out.println("Doctor Details");
			System.out.println("---------------------------");
			System.out.println("Doctor Id              :  "+doctorid);
			System.out.println("Doctor Name            :  "+doctorName);
			System.out.println("Doctor Qualification   :  "+Qualification);
			System.out.println("Doctor Specialization  :  "+Specialization);
			
		}
		
		
		
}
