package com.ac.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import java.util.Scanner;

import javax.swing.BoundedRangeModel;

public class CustomerController {

	Scanner scanner = new Scanner(System.in);
	Connection connection = null;

	public void addCustomer() throws Exception {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgasoft", "root", "Asmin@2002");

		System.out.print("*  ENTER NEW ID        :  ");
		int id = scanner.nextInt();
		System.out.print("*  ENTER YOUR NAME     :  ");
		String name = scanner.next();
		System.out.print("*  ENTER YOUR AGE      :  ");
		String age = scanner.next();
		System.out.print("*  ENTER YOUR ADDRESS  :  ");
		String addr = scanner.next();
		System.out.print("*  ENTER YOUR AMMOUNT  :  ");
		long amount = scanner.nextLong();

		PreparedStatement preparedStatement = connection.prepareStatement("insert into bank values(?,?,?,?,?)");

		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, age);
		preparedStatement.setString(4, addr);
		preparedStatement.setLong(5, amount);

		int count = preparedStatement.executeUpdate();
		if (count > 0) {
			System.out.println();
			System.out.println("********** YOUR ACCOUNT HAS CREATED SUCCESSFULLY *********");
			System.out.println();
			System.out.println("+--------------------------------------+");
			System.out.println("| NOTE* Please Remember Your Id Number |");
			System.out.println("+--------------------------------------+");
			System.out.println();
		} else {
			System.out.println("FAILED");
		}

	}

	public void viewDetails() throws Exception {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgasoft", "root", "Asmin@2002");
		System.out.println();
		System.out.print("*  ENTER YOUR ID        :  ");
		String id = scanner.next();

		PreparedStatement preparedStatement = connection.prepareStatement("select * from bank where id = " + id);
		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			System.out.println();
			System.out.println("[====== HERE IS YOUR DETAILS =====]");
			System.out.println("|=================================]");
			System.out.println("| ID       :  " + resultSet.getString(1));
			System.out.println("| NAME     :  " + resultSet.getString(2));
			System.out.println("| AGE      :  " + resultSet.getString(3));
			System.out.println("| ADDRESS  :  " + resultSet.getString(4));
			System.out.println("| AMOUNT   :  " + resultSet.getLong(5));
			System.out.println("|=================================]");
		}
	}

	public void depositeAmount() throws Exception {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgasoft", "root", "Asmin@2002");

		System.out.print("*  ENTER YOUR ID        :  ");
		String id = scanner.next();
		System.out.println();
		System.out.print("*  ENTER AMOUNT WHICH YOU WANT TO DEPOSITE  : ");
		Long ammount = scanner.nextLong();
		PreparedStatement preparedStatement = connection
				.prepareStatement("update bank set ammount=ammount+" + ammount + " where id = " + id);
		int done = preparedStatement.executeUpdate();
		System.out.println();
		if (done > 0) {
			System.out.println(" ****** AMOUNT HAS DEPOSITED SUCCESSFULLY ******");
		} else {
			System.out.println(" ** SORRY, SOMETHING WENT WRONG ** ");
		}

	}

	public void withdrawAmount() throws Exception {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgasoft", "root", "Asmin@2002");

		System.out.print("*  ENTER YOUR ID        :  ");
		String id = scanner.next();
		System.out.println();
		System.out.print("*  ENTER AMOUNT WHICH YOU WANT TO WITHDRAW  : ");
		Long ammount = scanner.nextLong();
		PreparedStatement preparedStatement = connection
				.prepareStatement("update bank set ammount=ammount-" + ammount + " where id = " + id);
		int done = preparedStatement.executeUpdate();
		System.out.println();
		if (done > 0) {
			System.out.println(" ****** AMOUNT HAS WITHDRAW SUCCESSFULLY ******");
		} else {
			System.out.println(" ** SORRY, SOMETHING WENT WRONG ** ");
		}

	}

	public void delete() throws Exception {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgasoft", "root", "Asmin@2002");

		System.out.print("*  ENTER YOUR ID        :  ");
		String id = scanner.next();
		PreparedStatement preparedStatement = connection.prepareStatement("delete from bank where id = " + id);
		int del = preparedStatement.executeUpdate();
		System.out.println();
		if (del > 0) {
			System.out.println(" ****** YOUR ACCOUNT HAS DELETED SUCCESSFULLY ******");
		} else {
			System.out.println(" ** SORRY, SOMETHING WENT WRONG ** ");
		}

	}

	public void createDataForAtm() throws Exception {

		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgasoft", "root", "Asmin@2002");
		System.out.print("\t\tEnter Your Id   : ");
		String id = scanner.next();
		PreparedStatement preparedStatement = connection.prepareStatement("select * from bank where id = " + id);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			if (id == resultSet.getString(1)) {
				System.out.println("GOOD");
			} else {
				System.out.println();
				System.out.println("\t\tThank You . You are Connected Now");
				System.out.println();
				new CustomerController().atmCard();
			}
		} else {
			System.out.println("Please Create Your Account First");

		}

	}

	public void atmCard() throws Exception {
		Random random = new Random();

		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgasoft", "root", "Asmin@2002");
		System.out.print("Enter Your Name    : ");
		String name = scanner.next();
		System.out.print("Enter Your Email   : ");
		String email = scanner.next();
		System.out.print("Enter Your Address : ");

		String addr = scanner.next();
		System.out.print("Enter Your id   : ");
		String id = scanner.next();

		int ran = 0;
		for (int ind = 1; ind < 10; ind++) {
			ran = random.nextInt();
		}
		PreparedStatement preparedStatement = connection.prepareStatement("insert into atm values(?,?,?,?,?)");

		preparedStatement.setString(1, name);
		preparedStatement.setString(2, email);
		preparedStatement.setString(3, addr);
		preparedStatement.setString(4, id);
		preparedStatement.setInt(5, ran);

		int count = preparedStatement.executeUpdate();
		if (count > 0) {
			PreparedStatement preparedStatement2 = connection.prepareStatement("select * from atm");
			ResultSet resultSet = preparedStatement2.executeQuery();
			if (resultSet.next()) {
				System.out.println();
				System.out.print("\t|***************************** WELCOME *****************************|\n");
				System.out.println();
				System.out.print("\t\tNAME       :  " + resultSet.getString(1) + "\n");
				System.out.print("\t\tEMAIL      :  " + resultSet.getString(2) + "\n");
				System.out.print("\t\tADDRESS    :  " + resultSet.getString(3) + "\n");
				System.out.print("\t\tID          :  " + resultSet.getString(4) + "\n");
				System.out.println();
				System.out.print("\t\tACCNO    :  " + resultSet.getString(5) + "\n");
				System.out.println();
				System.out.print("\t\t\t ----------- Thank You -----------------\n");
				System.out.println();
				System.out.println("\t*********************************************************************");
				System.out.println();
				System.out.println();
				System.out.println("\t\t\t========== Your Atm Has Been Created Successfully =========");
				System.out.println("\t\t\t========== Thank You For Choosing Our Bank. =========");
			}
		}

	}
}
