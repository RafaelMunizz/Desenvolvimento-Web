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
	
	private ProdutoDAO produtoDAO = new ProdutoDAO(); // Crie uma instância de ProdutoDAO

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("create.jsp").forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Aqui você deve processar os dados do formulário e criar um novo produto no banco de dados
        String nome = request.getParameter("nome");
        double preco = Double.parseDouble(request.getParameter("preco"));

        Produto novoProduto = new Produto(nome, preco); // Suponha que você tenha uma classe Produto
        produtoDAO.adicionarProduto(novoProduto); // Suponha que você tenha uma classe de acesso a dados chamada produtoDAO

        response.sendRedirect("ListagemServlet");
    }
}
