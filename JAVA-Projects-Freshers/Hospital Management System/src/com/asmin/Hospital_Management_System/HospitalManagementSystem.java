package com.asmin.Hospital_Management_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class HospitalManagementSystem {
		private static final String url = "jdbc:mysql://localhost:3306/hospital";
		private static final String userName = "root";
		private static final String password = "Asmin@2002";
		
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			Scanner scanner = new Scanner(System.in);
			try {
				Connection connection = DriverManager.getConnection(url,userName,password);
				Patient patient = new Patient(connection, scanner);
				Doctor doctor = new Doctor(connection);
				while(true) {
					System.out.println("Hospital Management System");
					System.out.println("-------------------------------");
					System.out.println("1. Add Pateint");
					System.out.println("2. View Patients");
					System.out.println("3. view Doctors");
					System.out.println("4. Book Appointment");
					System.out.println("5. Exit");
					System.out.print("Enter your Choice   : ");
					
					int choice = scanner.nextInt();
					System.out.println();
					switch(choice) {
					case 1:
						// Add patient
						patient.addPatient();
						System.out.println();
						break;
					case 2:
						// View patient
						patient.viewPatient();
						System.out.println();
						break;
					case 3:
						// View Doctors
						doctor.viewDoctor();
						System.out.println();
						break;
					case 4:
						// Book Appointment
						bookAppointment(patient, doctor, connection, scanner);
						System.out.println();
						break;
					case 5:
						System.out.println("Thank You For Using Our System");
						return;
						
					default:
						System.out.println("Enter Valid Number");
						break;
					
					}
					
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void bookAppointment(Patient patient,Doctor doctor,Connection connection,Scanner scanner){
			System.out.print("Enter Patient Id  : ");
			int patientId = scanner.nextInt();
			System.out.print("Enter Doctor Id  : ");
			int doctorId = scanner.nextInt();
			System.out.print("Enter Appointment Date (YYYY-MM-DD)  : ");
			String appointMentdate = scanner.next();
				if(patient.getPatientdetails(patientId) && doctor.getDoctordetails(doctorId)) {
					if(checkDoctorAvailability(doctorId,appointMentdate,connection)) {
						String appointmentQuery = "insert into appoint(pat_id,doct_id,appoint_date)values(?,?,?)";
						try {
							PreparedStatement preparedStatement = connection.prepareStatement(appointmentQuery);
							preparedStatement.setInt(1, patientId);
							preparedStatement.setInt(2, doctorId);
							preparedStatement.setString(3, appointMentdate);
							int rowAffected = preparedStatement.executeUpdate();
							if(rowAffected>0) {
								System.out.println("Added Succeccfully");
							}else {
								System.out.println("Added Failed");
							}
						}catch(Exception e) {
							
						}
					}else {
						System.out.println("Doctor is Not Available");
					}
				}else {
					System.out.println("Check,Doctor and Patient are not Exist");
				}
		}
		
		private static boolean checkDoctorAvailability(int doctorId, String appointMentdate) {
			// TODO Auto-generated method stub
			return false;
		}

		public static boolean checkDoctorAvailability(int doctorId,String appointMentdate,Connection connection) {
			String query = "SELECT COUNT(*) FROM appoint WHERE doct_id = ? and appoint_date = ?";
			
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, doctorId);
				preparedStatement.setString(2, appointMentdate);
				ResultSet resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					int count = resultSet.getInt(1);
					if(count == 0) {
						return true;
					}else {
						return false;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
}
