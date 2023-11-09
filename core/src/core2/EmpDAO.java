package core2;

import java.sql.SQLException;
import java.util.List;

public interface EmpDAO {
	
	public long count() ;
	//
	public void getListOfEmployeeinEachDepartment() ;
	//
	List<Employee> getEmployeeByDeptName(String name) ;
	
	List<Employee> getEmployeesSalaryGT(double amount ) ;
	
	List<Employee> getEmployeesSalaryLT(double amount) ;

	
	List<Employee> getEmployeeSeniority(int seniority) ;

	List<Employee> getEmployeeAgeBetween() ;
	
	List<Employee> getEmployeeLocation(String location) ;
	

	
	void createEmployee(Employee emp) throws SQLException;

	void updateEmployee(Employee emp) throws SQLException;

	void deleteEmployee(int id) throws SQLException;

	List<Employee> getAllEmployees() throws SQLException;

	Employee getEmployee(int id) throws SQLException;


	
}