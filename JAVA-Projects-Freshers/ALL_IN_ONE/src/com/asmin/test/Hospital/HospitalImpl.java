package com.asmin.test.Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class HospitalImpl {
	Scanner s = new Scanner(System.in);
	public void addPat() {
		System.out.print(" ENTER PATIENT ID        : ");
		String pid = s.next();
		System.out.print(" ENTER PATIENT NAME      : ");
		String pname = s.next();
		System.out.print(" ENTER PATIENT AGE       : ");
		int age = s.nextInt();
		System.out.print(" ENTER PATIENT ADDRESS   : ");
		String paddr = s.next();
		System.out.print(" ENTER PATIENT PROBLEM   : ");
		String epro = s.next();
		System.out.println();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/TEST", "root",
					"Asmin@2002");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into pat values(?,?,?,?,?)");

			preparedStatement.setString(1, pid);
			preparedStatement.setString(2, pname);
			preparedStatement.setInt(3, age);
			preparedStatement.setString(4, paddr);
			preparedStatement.setString(5, epro);

			int add = preparedStatement.executeUpdate();
			if (add > 0) {
				System.out.println();
				System.out.println(" +-----------------------------------------------------------------+");
				System.out.println(" |                   PATIENT ADDED SUCCESSFULLY                    |");
				System.out.println(" +-----------------------------------------------------------------+\n");
			} else {
				System.out.println("Note* SOME ERROR FOUND, DATA NOT INSERTED SUCCESSFULLY");
			}
		} catch (Exception e) {

		}
		System.out.println("=================================================================================");

	}
	public void searchPat() {
		System.out.print(" PATIENT ID        : ");
		String pid = s.next();
		System.out.println();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/TEST", "root",
					"Asmin@2002");
			PreparedStatement preparedStatement = connection.prepareStatement("select * from pat where pid = ?");
			preparedStatement.setString(1, pid);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println("  PATIENT ID      : " + resultSet.getString(1));
				System.out.println("  PATIENT NAME    : " + resultSet.getString(2));
				System.out.println("  PATIENT AGE     : " + resultSet.getInt(3));
				System.out.println("  PATIENT ADDRESS : " + resultSet.getString(4));
				System.out.println("  PATIENT PROBLEM : " + resultSet.getString(5));
			}
		} catch (Exception e) {

		}
		System.out.println("=================================================================================");
	
	}
	public void updatePat() {
		
		PreparedStatement preparedStatement;
		PreparedStatement preparedStatement1;
		System.out.println("  NOTE* YOU CANNOT CHANGE YOUR ID ");
		System.out.println();
		System.out.print("  ENTER PATIENT ID       : ");
		String pid = s.next();
		System.out.println();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/TEST", "root",
					"Asmin@2002");
			preparedStatement = connection.prepareStatement("select * from pat where pid = ?");
			preparedStatement.setString(1, pid);
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println("  THIS IS YOUR OLD DATA");
			System.out.println("  =====================");

			while (resultSet.next()) {
				System.out.println("  PATIENT ID       : " + resultSet.getString(1));
				System.out.println("  PATIENT NAME     : " + resultSet.getString(2));
				System.out.println("  PATIENT AGE      : " + resultSet.getInt(3));
				System.out.println("  PATIENT ADDRESS  : " + resultSet.getString(4));
				System.out.println("  PATIENT PROBLEM  : " + resultSet.getString(5));
				System.out.println();

				System.out.print("  WANT TO UPDATE [YES / NO]  : ");
				String uchoice = s.next();
				if (uchoice.equalsIgnoreCase("YES")) {
					System.out.println();
					System.out.println("NOTE* IF DONT UPDATE ANYTHING PLEASE ENTER YOUR OLD DATA");
					System.out.println();
					System.out.print(" =>  YOUR CURRENT NAME IS : " + resultSet.getString(2) + ", ENTER UPDATED NAME  : ");
					String upname = s.next();
					System.out.println();
					System.out.print(" =>  YOUR CURRENT AGE IS : " + resultSet.getInt(3) + ", ENTER UPDATED AGE  : ");
					int upage = s.nextInt();
					System.out.println();
					System.out.print(" =>  YOUR CURRENT ADDRESS IS : " + resultSet.getString(4) + ", ENTER UPDATED ADDRESS  : ");
					String upaddr = s.next();
					System.out.println();
					System.out.print(" =>  YOUR CURRENT PROBLEM IS : " + resultSet.getString(5) + ", ENTER UPDATED ADDRESS  : ");
					String upro = s.next();
					System.out.println();

					preparedStatement1 = connection
							.prepareStatement("update pat set pname = ?,age= ?,paddr= ?,problem = ? where pid = ?");
					preparedStatement1.setString(1, upname);
					preparedStatement1.setInt(2, upage);
					preparedStatement1.setString(3, upaddr);
					preparedStatement1.setString(4, upro);
					preparedStatement1.setString(5, pid);
					int update = preparedStatement1.executeUpdate();
					if (update > 0) {
						System.out.println("  *YOUR DATA UPDATION SUCCESSFULLY");
					} else {
						System.out.println(" Oops*YOUR DATA UPDATION FAILED");
					}
				} else {
					System.out.println("  ID MISMATCH");
				}
			}
		} catch (Exception e) {

		}
		System.out.println("=================================================================================");
	
	}
	public void deletePat() {
		System.out.print("  ENTER PATIENT ID       : ");
		String pid = s.next();
		System.out.println();
		System.out.print("  ARE YOU SURE  [YES/NO]  : ");
		String cho = s.next();
	  if(cho.equalsIgnoreCase("yes")) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/TEST", "root",
					"Asmin@2002");

			PreparedStatement preparedStatement = connection.prepareStatement("delete from pat where pid = ?");
			preparedStatement.setString(1, pid);
			int del = preparedStatement.executeUpdate();
			if (del > 0) {
				System.out.println("YOUR DATA HAS BEEN DELETED SUCCESSFULLY");
			} else {
				System.out.println("DELETION FAILED");
			}
		} catch (Exception e) {

		}
	  }
		System.out.println("=================================================================================");
	
	}
	}

