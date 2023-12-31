package firstWeb;

import java.sql.SQLException;
import java.util.List;

public interface EmpDAO {
	
	public void count() throws SQLException;
	//
	int firstId()throws SQLException;
	int lastId()throws SQLException;
	int previousId(int id)throws SQLException;
	int nextId(int id)throws SQLException;
	
	List<Employee> getEmployeeByDeptId(int deptId) throws SQLException;
	
	//
	public void getListOfEmployeeinEachDepartment() throws SQLException;
	//
	List<Employee> getEmployeeByDeptName(String name) throws SQLException;
	
	List<Employee> getEmployeesSalaryGT(double amount ) throws SQLException;
	
	List<Employee> getEmployeesSalaryLT(double amount) throws SQLException;

	
	List<Employee> getEmployeeSeniority(int seniority) throws SQLException;

	List<Employee> getEmployeeAgeBetween() throws SQLException;
	
	List<Employee> getEmployeeLocation(String location) throws SQLException;
	

	
	void createEmployee(Employee emp) throws SQLException;

	void updateEmployee(Employee emp) throws SQLException;

	void deleteEmployee(int id) throws SQLException;

	List<Employee> getAllEmployees() throws SQLException;

	Employee getEmployee(int id) throws SQLException;


	
}