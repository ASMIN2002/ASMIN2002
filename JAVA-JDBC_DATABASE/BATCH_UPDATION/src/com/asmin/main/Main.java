package com.asmin.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		try (
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Asmin@2002");
				Statement statement = connection.createStatement();
			){
			
			statement.addBatch("insert into emp1 values(1,'ASMIN',5000,'HYD')");
			statement.addBatch("insert into emp1 values(2,'CHINMAY',7000,'BNGL')");
			statement.addBatch("insert into emp1 values(3,'NABIN',6000,'NETH')");
			statement.addBatch("insert into emp1 values(4,'RAJ',9000,'ODISHA')");
			statement.addBatch("update emp1 set esal=esal+500 where esal<10000");
			statement.addBatch("delete from emp1 where eno=4");
			
			int[] rowCounts = statement.executeBatch();
			for(int rowCount: rowCounts) {
				System.out.println("RowCount    : "+rowCount );
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
