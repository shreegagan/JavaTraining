package firstWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	private int count;
	
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init of the servlet is invoking once ");
		System.out.println("Driver class="+config.getInitParameter("driverClass"));
		System.out.println("Jdbc Url="+config.getInitParameter("jdbc-url"));
		System.out.println("Username="+config.getInitParameter("username"));
		System.out.println("Passward="+config.getInitParameter("passward"));
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy of count="+count);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
//		resp.getWriter().print("hello world!"+count++);
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>");
		out.print("Hello <b>"+name+"</br></br>");
		
		out.print("</title>");
		out.print("<body>");
		out.print("Hi <b>"+name+"</br>");
		out.print("you are  the visitor no " +count++);
		out.print("</body>");
		out.print("<html>");
	}

}



