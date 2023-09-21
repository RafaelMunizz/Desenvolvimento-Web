package br.com.ifpb.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaContatos")
public class ListaContatoServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Contato> lista = banco.getContatos();
		
		RequestDispatcher rd = req.getRequestDispatcher("/ListaContatos.jsp");
		req.setAttribute("listaContatos", lista);
		rd.forward(req, resp);
	}

}
