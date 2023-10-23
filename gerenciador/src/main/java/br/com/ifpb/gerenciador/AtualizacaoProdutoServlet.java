package br.com.ifpb.gerenciador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AtualizacaoProdutoServlet
 */
@WebServlet("/AtualizacaoProdutoServlet")
public class AtualizacaoProdutoServlet extends HttpServlet {
	
	private ProdutoDAO produtoDAO = new ProdutoDAO(); // Crie uma instância de ProdutoDAO
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    int id = Integer.parseInt(request.getParameter("id"));
	    Produto produto = produtoDAO.obterProdutoPorId(id);

	    if (produto != null) {
	        request.setAttribute("produto", produto);
	        request.getRequestDispatcher("update.jsp").forward(request, response);
	    } else {
	        // Lida com o cenário em que o produto não foi encontrado
	        // Por exemplo, redirecione ou mostre uma mensagem de erro
	        response.sendRedirect("listagem"); // Redireciona para a página de listagem
	    }
	}


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String novoNome = request.getParameter("nome");
        double novoPreco = Double.parseDouble(request.getParameter("preco"));

        Produto produto = produtoDAO.obterProdutoPorId(id);
        produto.setNome(novoNome);
        produto.setPreco(novoPreco);

        produtoDAO.atualizarProduto(produto);

        response.sendRedirect("ListagemServlet");
    }
}
