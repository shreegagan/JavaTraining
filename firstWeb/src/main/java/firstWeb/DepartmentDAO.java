package firstWeb;

import java.sql.SQLException;
import java.util.List;

public interface DepartmentDAO {
//	
	int firstId()throws SQLException;
	int lastId()throws SQLException;
	int previousId(int id)throws SQLException;
	int nextId(int id)throws SQLException;
	
	int getEmpByDeptId(int id) throws SQLException;
//
	void createDepartment(Department dept) throws SQLException;

	List<Department> getDepartments() throws SQLException;

	void updateDepartment(Department dept) throws SQLException;

	void deleteDepartment(int id) throws SQLException;

	Department getDepartment(int id) throws SQLException;
}
