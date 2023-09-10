package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcula")
public class calcula extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Float distancia;
	Integer tempo;
	Float consumo;
	
	Float vm; // Velocidade média
	Float rm; // Rendimendo médio
	
    public calcula() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>Velocidade média: " + vm + " km/h <br/> Rendimento médio: " + rm + " km/l</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		distancia = Float.parseFloat(request.getParameter("distancia"));
		tempo = Integer.parseInt(request.getParameter("tempo"));
		consumo = Float.parseFloat(request.getParameter("consumo"));
		
		// Velocidade média = Distância / Tempo
		vm = distancia / tempo;
		
		// Rendimento médio = Distância / Consumo
		rm = distancia / consumo;
		
		doGet(request, response);
	}
}
