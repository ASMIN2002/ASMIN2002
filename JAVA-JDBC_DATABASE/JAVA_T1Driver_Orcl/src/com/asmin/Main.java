package com.asmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		Connection connection = null;
		Statement st = null;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			connection = DriverManager.getConnection("jdbc:odbc:asmin", "scott", "asmin");
			st = connection.createStatement();
			ResultSet rs = st.executeQuery("update emp1 set esal = esal+500 where esal<10000");
		} catch (Exception e) {

			e.printStackTrace();

			try {
				int rowCount = st.getUpdateCount();
				System.out.println("RowCount     :  " + rowCount);
			} catch (Exception e1){
				e1.printStackTrace(); 
			}
		} finally {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
