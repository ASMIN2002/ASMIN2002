package com.asmin.dao;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.asmin.beans.Employee;
import com.asmin.factory.ConnectionFactory;

public class EmployeeDaoimpl implements EmployeeDao {

	Connection connection = ConnectionFactory.getConnection();
	public String add(Employee employee) {
		String status = "";
		
		try {
			Statement statement = connection.createStatement();
			int rowCount = statement.executeUpdate("insert into emp1 values("+employee.getEno()+",'"+employee.getEname()+"',"+employee.getEsal()+",'"+employee.getEaddr()+"')");
			if (rowCount == 1) {
				status = "SUCCESS";
			}
			
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return status;
	}

	
	public Employee search(int eno) {
		Employee employee = null;
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from emp1 where eno = "+eno);
			boolean b = resultSet.next();
			
			if (b == true) {
				employee = new Employee();
				employee.setEno(resultSet.getInt("eno"));
				employee.setEname(resultSet.getString("ename"));
				employee.setEsal(resultSet.getFloat("esal"));
				employee.setEaddr(resultSet.getString("eaddr"));
				
			}else {
				employee = null;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return employee;
	}
	public List<Employee> getAllEmployees(){
		List<Employee> employeeList = null;
		try {
			employeeList = new ArrayList<>();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from emp1");
			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setEno(resultSet.getInt("eno"));
				employee.setEname(resultSet.getString("ename"));
				employee.setEsal(resultSet.getFloat("esal"));
				employee.setEaddr(resultSet.getString("eaddr"));
				employeeList.add(employee);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return employeeList;
	}
	
	public String update(Employee employee) {
		String status = "";

		try {
			Statement statement = connection.createStatement();
			int rowCount = statement.executeUpdate("update emp1 set ename = '"+employee.getEname()+"', esal = "+employee.getEsal()+", eaddr = '"+employee.getEaddr()+"' where eno ="+employee.getEno());
			if (rowCount == 1) {
				System.out.println("SUCCESS");
			}else {
				System.out.println("FAILURE");
			}
		} catch (Exception exception) {
			status = "FAILURE";
			exception.printStackTrace();
		}
		return status;
	}

	
	public String delete(int eno) {
		String status = "";
			try {
				Statement statement = connection.createStatement();
				int rowCount=statement.executeUpdate("delete from emp1 where eno = "+eno);
				if (rowCount == 1) {
					status = "SUCCESS";
				}else {
					status = "FAILURE";
				}
			} catch (Exception exception) {
				status = "FAILURE";
				exception.printStackTrace();
			}
		return status;
	}
	

}
