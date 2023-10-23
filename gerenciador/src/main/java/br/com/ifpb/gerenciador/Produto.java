package br.com.ifpb.gerenciador;

public class Produto {
    private static int proximoId = 1; // Variável estática para rastrear o próximo ID
    private int id;
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.id = proximoId++;
        this.nome = nome;
        this.preco = preco;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Setters (se necessário)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
