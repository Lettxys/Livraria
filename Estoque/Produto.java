import java.util.ArrayList;
import java.util.List;

class Produto {
    protected int id;
    protected String nome;
    protected String descricao;
    protected int quantidade;
    protected double preco;
    protected int nivelMinimo;

    public Produto(int id, String nome, String descricao, int quantidade, double preco, int nivelMinimo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        this.nivelMinimo = nivelMinimo;
    }

    public void atualizarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public boolean verificarEstoqueMinimo() {
        return this.quantidade < this.nivelMinimo;
    }

    public void exibirDetalhes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Nível Mínimo: " + nivelMinimo);
    }
}

