package br.com.ifpb.gerenciador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExclusaoProdutoServlet
 */
@WebServlet("/ExclusaoProdutoServlet")
public class ExclusaoProdutoServlet extends HttpServlet {
	
	private ProdutoDAO produtoDAO = new ProdutoDAO(); 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    int id = Integer.parseInt(request.getParameter("id"));
	    produtoDAO.excluirProduto(id);

	    response.sendRedirect("ListagemServlet"); 
	}


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        produtoDAO.excluirProduto(id);

        response.sendRedirect("ListagemServlet");
    }
}
