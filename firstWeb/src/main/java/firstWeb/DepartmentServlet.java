package firstWeb;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DepartmentServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private DepartmentDAO dao = new DeptDAOImpl();
	private EmpDAO emp = new EmpDAOImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			HttpSession sess=req.getSession(true);
			sess.setAttribute("current", dao.firstId());
			sess.setAttribute("dept", dao.getDepartment(dao.firstId()));
			
			int current = (int) sess.getAttribute("current");
			List<Employee> emps = emp.getEmployeeByDeptId(current);
			sess.setAttribute("emps", emps);
			
//			req.setAttribute("emp", dao.getEmployee(dao.firstID()));
			req.setAttribute("dept", dao.getDepartment(dao.firstId()));
			req.getRequestDispatcher("department.jsp").forward(req, resp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sess = req.getSession();
		int current =(Integer)sess.getAttribute("current");
		String submit =req.getParameter("submit1");
		try {
		if("First".equals(submit)) {
			current =  dao.firstId();
		}else if("Last".equals(submit)) {
			current = dao.lastId();
		}else if("Next".equals(submit)) {
			current = dao.nextId(current);
		}else if("Previous".equals(submit)) {
			current = dao.previousId(current);
		}
		else if("Query".equals(submit)) {
			current = dao. getEmpByDeptId(current);
		}
		System.out.println("Current" +current);
		
		sess.setAttribute("dept", dao.getDepartment(current));
		List<Employee> emps = emp.getEmployeeByDeptId(current);
		
		sess.setAttribute("current", current);
		req.setAttribute("dept", dao.getDepartment(current));

	req.getRequestDispatcher("department.jsp").forward(req, resp);
//		sess.setAttribute("emp", dao.getDepartment(current));
//		resp.sendRedirect("department.jsp");
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}

}
