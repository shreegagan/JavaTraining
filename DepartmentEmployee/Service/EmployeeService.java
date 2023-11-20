package com.valtech.training.firstspringboot.service;

import java.util.List;

import com.valtech.training.firstspringboot.entity.Department;
import com.valtech.training.firstspringboot.entity.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee emp);

	Employee updateEmployee(Employee emp);
	
	void deleteEmployee(int id);

	List<Employee> getAllEmployees();
	
	Employee getEmployee(int id);

	Department createDepartment(Department dep);

	Department updateDepartment(Department dep);

	List<Department> getAllDepartments();

	Department getDepartment(int id);
	
	int getFirstId();
	
	int getLastId();
	
	int getPreviousId(int id);
	
	int getNextId(int id);

	List<Employee> getAllEmployeesByDepartmentId(int did);

}