package br.com.ifpb.gerenciador;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	public static List<Contato> listaContatos = new ArrayList<Contato>();;

	static {
		Contato Fulano = new Contato("Fulano", "fulano@gmail.com", "(83) 99999-9999");
		Contato Ciclano = new Contato("Ciclano", "ciclano@gmail.com", "(83) 98888-8888");
		listaContatos.add(Fulano);
		listaContatos.add(Ciclano);
	}

	public void adiciona(Contato Contato) {
		listaContatos.add(Contato);

	}

	public List<Contato> getContatos() {
		return Banco.listaContatos;
	}

}
