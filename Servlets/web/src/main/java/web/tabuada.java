package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tabuada")
public class tabuada extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Integer numero;
       
    public tabuada() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		out.println("<html> "
						+ "<body>"
							+ "<h1>Tabuada do número: " + numero + "</h1>"
							+ numero + " X 0 = " + numero * 0 + "<br/> "
							+ numero + " X 1 = " + numero * 1 + "<br/> "
							+ numero + " X 2 = " + numero * 2 + "<br/> "
							+ numero + " X 3 = " + numero * 3 + "<br/> "
							+ numero + " X 4 = " + numero * 4 + "<br/> "
							+ numero + " X 5 = " + numero * 5 + "<br/> "
							+ numero + " X 6 = " + numero * 6 + "<br/> "
							+ numero + " X 7 = " + numero * 7 + "<br/> "
							+ numero + " X 8 = " + numero * 8 + "<br/> "
							+ numero + " X 9 = " + numero * 9 + "<br/> "
							+ numero + " X 10 = " + numero * 10 + "<br/> "
						+ "</body>"
					+ "</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		numero = Integer.parseInt(request.getParameter("numero"));
		
		doGet(request, response);
	}

}
