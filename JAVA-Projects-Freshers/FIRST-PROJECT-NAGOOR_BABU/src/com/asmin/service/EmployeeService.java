package com.asmin.service;   
import java.util.List;

import com.asmin.beans.Employee;

public interface EmployeeService {
	public String addEmployee(Employee employee); 
	public Employee searchEmployee(int eno);
	public List<Employee> getAllEmployees();
	public String updateEmployee(Employee employee);
	public String deleteEmployee(int eno);	
}
 