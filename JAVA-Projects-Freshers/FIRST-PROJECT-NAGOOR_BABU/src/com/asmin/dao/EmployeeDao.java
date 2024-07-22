package com.asmin.dao;

import java.util.List;

import com.asmin.beans.Employee;

public interface EmployeeDao {
	public String add(Employee employee);
	public Employee search(int eno);
	public List<Employee> getAllEmployees();
	public String update(Employee employee);
	public String delete (int eno	);
	
}
