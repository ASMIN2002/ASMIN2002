package com.asmin.service;

import java.util.List;

import com.asmin.beans.Employee;
import com.asmin.dao.EmployeeDao;
import com.asmin.factory.EmployeeDaoFactory;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();
	
	@Override
	public String addEmployee(Employee employee) {
		String status = employeeDao.add(employee);
		return status;
	}

	@Override
	public Employee searchEmployee(int eno) {
		Employee employee = employeeDao.search(eno);
		return employee;
	}
	
	public List<Employee> getAllEmployees(){
		List<Employee> employeeList = employeeDao.getAllEmployees();
		return employeeList;
	}

	@Override
	public String updateEmployee(Employee employee) {
		String status = employeeDao.update(employee);
		return status;
	}

	@Override
	public String deleteEmployee(int eno) {
		String status = employeeDao.delete(eno);
		return status;
	}

} 	
	
