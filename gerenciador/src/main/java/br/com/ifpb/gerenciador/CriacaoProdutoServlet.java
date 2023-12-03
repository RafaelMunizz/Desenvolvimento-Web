package br.com.ifpb.gerenciador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CriacaoProdutoServlet
 */
@WebServlet("/CriacaoProdutoServlet")
public class CriacaoProdutoServlet extends HttpServlet {
	
	private ProdutoDAO produtoDAO = new ProdutoDAO(); 

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("create.jsp").forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");
        double preco = Double.parseDouble(request.getParameter("preco"));

        Produto novoProduto = new Produto(nome, preco); 
        produtoDAO.adicionarProduto(novoProduto);

        response.sendRedirect("ListagemServlet");
    }
}
