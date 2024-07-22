package com.asmin.factory;

import com.asmin.service.EmployeeService;
import com.asmin.service.EmployeeServiceImpl;

public class EmployeeServiceFactory {
	private static EmployeeService employeeService;
	static {
		employeeService = new EmployeeServiceImpl();
	}
	public static EmployeeService getEmployeeService() {
		return employeeService;
	}
}
