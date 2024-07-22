package com.asmin.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

import com.asmin.beans.Employee;
import com.asmin.factory.EmployeeServiceFactory;
import com.asmin.service.EmployeeService;

public class EmployeeController {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	EmployeeService employeeService = EmployeeServiceFactory.getEmployeeService();
	
	public void addEmployee() {
		try {
			System.out.print("Employee Number    :");
			int eno = Integer.parseInt(bufferedReader.readLine());
			
			Employee emp = employeeService.searchEmployee(eno);
			
			if (emp == null) {
			System.out.print("Employee Name      :");
			String ename = bufferedReader.readLine();
			System.out.print("Employee Salary    :"); 
			float esal = Float.parseFloat(bufferedReader.readLine());
			System.out.print("Employee Address   :");
			String eaddr = bufferedReader.readLine();
			
			Employee employee = new Employee();
			employee.setEno(eno);
			employee.setEname(ename);
			employee.setEsal(esal);
			employee.setEaddr(eaddr);
			String status = employeeService.addEmployee(employee);
			System.out.println("Status    : "+status);
		    }else {
		    	System.out.println("Status  : EXISTED");
		    }
					
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	public void searchEmployee() {
		
		try {
			System.out.print("Employee Number   : ");
			int eno = Integer.parseInt(bufferedReader.readLine());
			Employee employee = employeeService.searchEmployee(eno);
			if (employee == null) {
				System.out.print("Status    : Employee Does Not Exist");
				
			}else {
				System.out.println("Employee Details");
				System.out.println("====================");
				System.out.println("Employee Number        : "+employee.getEno());
				System.out.println("Employee Name          : "+employee.getEname());
				System.out.println("Employee Salary        : "+employee.getEsal());
				System.out.println("Employee Address       : "+employee.getEaddr());
				
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	public void getAllEmployees() {
		List<Employee> employeeList = employeeService.getAllEmployees();
		Iterator<Employee> iterator = employeeList.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());		
		}
	}
	public void updateEmployee() {
		try {
			System.out.print("Employee Number     : ");
			int eno = Integer.parseInt(bufferedReader.readLine());
			Employee employee = employeeService.searchEmployee(eno);
			if (employee == null) {
				System.out.println("Status  : EMPLOYEE not Existed ");
			}else {
				System.out.print("Employee Name  : OLD : "+employee.getEname()+" : NEW : ");
				String ename_New = bufferedReader.readLine();
				if (ename_New==null || ename_New.equals("")) {
					ename_New=employee.getEname();
				}
			
				System.out.print("Employee Salary : OLD : "+employee.getEsal()+" : NEW : ");
				String sal = bufferedReader.readLine();
				float esal_New=0.0f;
				if (sal == null || sal.equals("")) {
					esal_New=employee.getEsal();
				}else {
					esal_New=Float.parseFloat(sal);
				}
				
				//float esal_New = Float.parseFloat(bufferedReader.readLine());
				
				
				System.out.print("Employee ADDRESS : OLD : "+employee.getEaddr()+" : NEW :");
				String eaddr_New= bufferedReader.readLine();
				if (eaddr_New==null || eaddr_New.equals("")) {
					eaddr_New = employee.getEaddr();
				}
				//String eaddr_New = bufferedReader.readLine();
				
				Employee employeeUpdateDetails = new Employee();
				employeeUpdateDetails.setEno(eno);
				employeeUpdateDetails.setEname(ename_New);
				employeeUpdateDetails.setEsal(esal_New);
			 	employeeUpdateDetails.setEaddr(eaddr_New);
				
				
				String status = employeeService.updateEmployee(employeeUpdateDetails);
				System.out.print("STATUS   : "+status);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		
	}
	public void deleteEmployee() {
		try {
			System.out.print("Employee Number  : ");
			int eno = Integer.parseInt(bufferedReader.readLine());
			Employee employee = employeeService.searchEmployee(eno);
					
			if (employee == null) {
				System.out.println("Status    : Employee not existed");
			}else {
				String status = employeeService.deleteEmployee(eno);
				System.out.println("Status   : "+status);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
