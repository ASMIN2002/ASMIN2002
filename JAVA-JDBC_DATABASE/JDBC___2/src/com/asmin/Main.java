package com.asmin;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		try (FileOutputStream fileOutputStream = new FileOutputStream("E:/abc/xyz/emp.html");

				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root",
						"Asmin@2002");
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from emp1");

		) {

			String data = "<html><body><table border='1' style='margin-left:auto;margin-right: auto'>";
			data = data + "<tr><th>ENO</th><th>ENAME</th><th>ESAL</th><th>EADDR</th></tr>";

			while (resultSet.next()) {
				data = data + "<tr>";

				data = data + "<td>" + resultSet.getInt("eno");
				data = data + "<td>" + resultSet.getString("ename");
				data = data + "<td>" + resultSet.getFloat("esal");
				data = data + "<td>" + resultSet.getString("eaddr");

				data = data + "</tr>";
			}
			
			fileOutputStream.write(data.getBytes());
			System.out.println("Success");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
