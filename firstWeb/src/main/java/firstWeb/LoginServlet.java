package firstWeb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	System.out.println("Hello");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print("User name="+request.getParameter("name")+"pass ward ="+request.getParameter("pass"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
//		if("scott".equals(name) &&"tiger".equals(pass)) {
//			request.setAttribute("message","hi scott..how are you");
//			
//		}
//		else if(name.length()<=4) {
//			request.setAttribute("message","login Unsuccusful");
//			
//		}
//		else if(pass.length()>4 || pass.length()<=4) {
//			request.setAttribute("message","login succusful");
//		}
//		else {
//			request.setAttribute("message","only scott is a valid user");
//		}
		 if (name.length() < 4 || pass.length() < 8) {
	            request.setAttribute("message", "Name atleast 4 char length, and the password atleast 8 char length.");
	            request.getRequestDispatcher("login.jsp").forward(request, response);
	        } else if ("valtech".equals(name) && "valtech".equals(pass)) {
	            request.setAttribute("message", "Hi Valtech, how are you doing . . . !");
	            request.getRequestDispatcher("login.jsp").forward(request, response);
	        } else {
	            request.setAttribute("message", "Only is a valid user . . . !");
	            request.getRequestDispatcher("login.jsp").forward(request, response);
	        }
//		request.getRequestDispatcher("loginResults.jsp").forward(request, response);
		
	}

}


