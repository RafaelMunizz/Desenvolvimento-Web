package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/temperatura")
public class temperatura extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Float temperaturaEmC;
	Float temperaturaEmF;
       
    public temperatura() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		out.println("<html> "
						+ "<body>"
							+ "<h2>" + temperaturaEmC + "°C corresponde a " + temperaturaEmF + "°F</h2>"
						+ "</body>"
					+ "</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		temperaturaEmC = Float.parseFloat(request.getParameter("temperatura"));
		temperaturaEmF = (temperaturaEmC * 9/5) + 32;
		
		doGet(request, response);
	}

}
