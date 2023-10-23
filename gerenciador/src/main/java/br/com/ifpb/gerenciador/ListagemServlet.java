package br.com.ifpb.gerenciador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListagemServlet
 */
@WebServlet("/ListagemServlet")
public class ListagemServlet extends HttpServlet {
	
	private ProdutoDAO produtoDAO = new ProdutoDAO(); // Crie uma instância de ProdutoDAO
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Aqui você deve recuperar a lista de produtos do banco de dados ou de onde quer que esteja armazenada
        List<Produto> listaDeProdutos = produtoDAO.listarProdutos(); // Suponha que você tenha uma classe de acesso a dados chamada produtoDAO

        request.setAttribute("listaDeProdutos", listaDeProdutos);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }
}
