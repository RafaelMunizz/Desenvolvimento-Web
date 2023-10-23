package br.com.ifpb.gerenciador;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private static List<Produto> bancoDeDados = new ArrayList<>();

    public List<Produto> listarProdutos() {
        return bancoDeDados;
    }

    public void adicionarProduto(Produto produto) {
        bancoDeDados.add(produto);
    }

    public Produto obterProdutoPorId(int id) {
        for (Produto produto : bancoDeDados) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void atualizarProduto(Produto produto) {
        for (int i = 0; i < bancoDeDados.size(); i++) {
            if (bancoDeDados.get(i).getId() == produto.getId()) {
                bancoDeDados.set(i, produto);
                break;
            }
        }
    }

    public void excluirProduto(int id) {
        bancoDeDados.removeIf(produto -> produto.getId() == id);
    }
}

