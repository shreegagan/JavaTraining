package javaWork;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumberConverterServlet")
public class NumberConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numberSystem = request.getParameter("numberSystem");
        String number1Str = request.getParameter("number1");
        String number2Str = request.getParameter("number2");

        try {
            int number1 = Integer.parseInt(number1Str);
            int number2 = Integer.parseInt(number2Str);
            int sum = number1 + number2;

            String result;
            if ("binary".equals(numberSystem)) {
                result = Integer.toBinaryString(sum);
            } else if ("octal".equals(numberSystem)) {
                result = Integer.toOctalString(sum);
            } else if ("hexadecimal".equals(numberSystem)) {
                result = Integer.toHexString(sum);
            } else {
                // Handle additional number systems as needed
                result = "Invalid Number System";
            }

            request.setAttribute("result", result);
            request.getRequestDispatcher("result.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            response.sendRedirect("numberConverter.jsp?error=InvalidInput");
        }
    }
}
