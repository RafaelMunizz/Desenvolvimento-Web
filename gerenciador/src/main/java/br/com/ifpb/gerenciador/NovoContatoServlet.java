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


@WebServlet("/NovoContato")
public class NovoContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public NovoContatoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeContato = (String) req.getParameter("nome");
		String emailContato = (String) req.getParameter("email");
		String telefoneContato = (String) req.getParameter("telefone");
		
		Contato contato = new Contato();
		contato.setNome(nomeContato);
		contato.setEmail(emailContato);
		contato.setTelefone(telefoneContato);
		
		Banco banco = new Banco();
		banco.adiciona(contato);

		List<Contato> lista = banco.getContatos();
		
		RequestDispatcher rd = req.getRequestDispatcher("/ListaContatos.jsp");
		req.setAttribute("listaContatos", lista);
		
		rd.forward(req, resp);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher rd = req.getRequestDispatcher("/formNovoContato.jsp");
		rd.forward(req, resp);
	}

}
