package com.asmin.test.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeeImpl {
	Scanner s = new Scanner(System.in);

	public void addEmployee() {
		System.out.print(" ENTER EMPLOYEE ID       : ");
		String eid = s.next();
		System.out.print(" ENTER EMPLOYEE NAME     : ");
		String ename = s.next();
		System.out.print(" ENTER EMPLOYEE AGE      : ");
		int eage = s.nextInt();
		System.out.print(" ENTER EMPLOYEE ADDRESS  : ");
		String eaddr = s.next();
		System.out.println();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/TEST", "root",
					"Asmin@2002");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into emp values(?,?,?,?)");

			preparedStatement.setString(1, eid);
			preparedStatement.setString(2, ename);
			preparedStatement.setInt(3, eage);
			preparedStatement.setString(4, eaddr);

			int add = preparedStatement.executeUpdate();
			if (add > 0) {
				System.out.println();
				System.out.println(" +-----------------------------------------------------------------+");
				System.out.println(" |                   EMPLOYEE ADDED SUCCESSFULLY                   |");
				System.out.println(" +-----------------------------------------------------------------+\n");
			} else {
				System.out.println("Note* SOME ERROR FOUND, DATA NOT INSERTED SUCCESSFULLY");
			}
		} catch (Exception e) {

		}
		System.out.println("=================================================================================");

	}

	public void searchEmployee() {
		System.out.print(" EMPLOYEE ID       : ");
		String eid = s.next();
		System.out.println();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/TEST", "root",
					"Asmin@2002");
			PreparedStatement preparedStatement = connection.prepareStatement("select * from emp where eid = ?");
			preparedStatement.setString(1, eid);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println("  EMPLOYEE ID      : " + resultSet.getString(1));
				System.out.println("  EMPLOYEE NAME    : " + resultSet.getString(2));
				System.out.println("  EMPLOYEE AGE     : " + resultSet.getInt(3));
				System.out.println("  EMPLOYEE ADDRESS : " + resultSet.getString(4));
			}
		} catch (Exception e) {

		}
		System.out.println("=================================================================================");
	}

	public void updateEmployee() {

		PreparedStatement preparedStatement;
		PreparedStatement preparedStatement1;
		System.out.println("  NOTE* YOU CANNOT CHANGE YOUR ID ");
		System.out.println();
		System.out.print("  ENTER EMPLOYEE ID       : ");
		String eid = s.next();
		System.out.println();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/TEST", "root",
					"Asmin@2002");
			preparedStatement = connection.prepareStatement("select * from emp where eid = ?");
			preparedStatement.setString(1, eid);
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println("  THIS IS YOUR OLD DATA");
			System.out.println("  =====================");

			while (resultSet.next()) {
				System.out.println("  EMPLOYEE ID      : " + resultSet.getString(1));
				System.out.println("  EMPLOYEE NAME    : " + resultSet.getString(2));
				System.out.println("  EMPLOYEE AGE     : " + resultSet.getInt(3));
				System.out.println("  EMPLOYEE ADDRESS : " + resultSet.getString(4));
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

					preparedStatement1 = connection
							.prepareStatement("update emp set ename = ?,age= ?,eaddr= ?where eid = ?");
					preparedStatement1.setString(1, upname);
					preparedStatement1.setInt(2, upage);
					preparedStatement1.setString(3, upaddr);
					preparedStatement1.setString(4, eid);
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

	public void deleteEmployee() {
		System.out.print("  ENTER EMPLOYEE ID       : ");
		String eid = s.next();
		System.out.println();
		System.out.print("  ARE YOU SURE  [YES/NO]  : ");
		String cho = s.next();
	  if(cho.equalsIgnoreCase("yes")) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/TEST", "root",
					"Asmin@2002");

			PreparedStatement preparedStatement = connection.prepareStatement("delete from emp where eid = ?");
			preparedStatement.setString(1, eid);
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
