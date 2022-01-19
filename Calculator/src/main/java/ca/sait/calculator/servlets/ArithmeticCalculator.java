package ca.sait.calculator.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author soo
 */
@WebServlet(name = "ArithmeticCalculator", urlPatterns = {"/ArithmeticCalculator"})
public class ArithmeticCalculator extends HttpServlet {
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("first") != null && request.getParameter("second") != null) {
            try {
                String firstString = request.getParameter("first");
                int first = Integer.parseInt(firstString);
                
                String secondString = request.getParameter("second");
                int second = Integer.parseInt(secondString);
                            
                String cal = request.getParameter("cal");
                switch (cal) {
                    case "plus": request.setAttribute("message","Result: " + (first+second) );

                    break;
                    case "minus": request.setAttribute("message","Result: " + (first-second) );
                    break;
                    case "mul": request.setAttribute("message","Result: " + (first*second) );
                    break;
                    case "div": request.setAttribute("message","Result: " + (first/second) );
                    break;
                    default: break;
                }
            } catch (Exception ex) {
                request.setAttribute("message", "Invalid number submitted.");
              }        
        } else {
            request.setAttribute("message", "Number is missing.");
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
