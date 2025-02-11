package Livraria;

import Livraria.Estoque.Estoque;

public class Main {
    public static void main(String[] args) {
        Estoque livraria = new Estoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Ver todos os livros");
            System.out.println("2 - Pesquisar no inventário");
            System.out.println("3 - Verificar livros que precisam de reposição");
            System.out.println("4 - Sair do programa");
            System.out.print("Seleção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (escolha) {
                case 1:
                    livraria.exibirTodosLivros();
                    break;
                case 2:
                    System.out.print("Digite sua pesquisa: ");
                    String consulta = scanner.nextLine();
                    livraria.pesquisarInventario(consulta);
                    break;
                case 3:
                    livraria.verificarReposicao();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Seleção inválida. Por favor, tente novamente.");
            }
        }
    }
}
