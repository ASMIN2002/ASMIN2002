package com.asmin.factory;

import com.asmin.dao.EmployeeDao;
import com.asmin.dao.EmployeeDaoimpl;

public class EmployeeDaoFactory {
	private static EmployeeDao employeeDao;
	static {
		employeeDao = new EmployeeDaoimpl();
		}
	public static EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
}
