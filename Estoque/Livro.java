package Livraria.Estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Livro {
    private String autorNome;
    private String autorSobrenome;
    private String editora;
    private String genero;
    private double preco;
    private String titulo;
    private int quantidadeEmEstoque;

    // Construtor 
    public Livro(String autorNome, String autorSobrenome, String editora, String genero, double preco, String titulo, int quantidadeEmEstoque) {
        this.autorNome = autorNome;
        this.autorSobrenome = autorSobrenome;
        this.editora = editora;
        this.genero = genero;
        this.preco = preco;
        this.titulo = titulo;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

     Métodos getters para acessar os atributos
    public String getAutorNome() {
        return autorNome;
    }

    public String getAutorSobrenome() {
        return autorSobrenome;
    }

    public String getEditora() {
        return editora;
    }

    public String getGenero() {
        return genero;
    }

    public double getPreco() {
        return preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // pra formatar a exibição do livro
    @Override
    public String toString() {
        return String.format("| %-10s | %-10s | %-15s | %-10s | %-5.2f | %-30s | %-5d |",
                autorNome, autorSobrenome, editora, genero, preco, titulo, quantidadeEmEstoque);
    }
}
