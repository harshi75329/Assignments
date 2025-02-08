package Servlet2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Servlet implementation class DateTimeServlet
 */
@WebServlet("/DateTimeServlet") // Maps this servlet to /DateTimeServlet
public class DateTimeServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Get current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format date and time
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = now.format(dateFormatter);
        String formattedTime = now.format(timeFormatter);

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Display the current date and time
        out.println("<html><body>");
        out.println("<h2>Current Date and Time</h2>");
        out.println("<p>Date : <b>" + formattedDate + "</b></p>");
        out.println("<p>Time : <b>" + formattedTime + "</b></p>");
        out.println("</body></html>");
    }

    // Redirect POST requests to GET
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        doGet(request, response);
    }
}
