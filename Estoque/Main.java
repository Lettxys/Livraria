import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        // Adicionando alguns produtos ao estoque
        estoque.adicionarProduto(new Livro(1, "O Hobbit", "Fantasia clássica", 10, 59.90, 2, "J.R.R. Tolkien", "HarperCollins", 310));
        estoque.adicionarProduto(new Livro(2, "As Meninas", "Contemporâneo", 13, 79.90, 8, "Lygia Fagundes Teles", "Nova Fronteira", 510));
        estoque.adicionarProduto(new Livro(3, "Drácula", "Clássico", 18, 49.90, 6, "Bram Stoker", "Darkside", 210));

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Listar produtos");
            System.out.println("2. Gerenciar estoque");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    listarProdutos(estoque);
                    break;
                case 2:
                    gerenciarEstoque(estoque, scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    // Função para listar produtos
    private static void listarProdutos(Estoque estoque) {
        System.out.println("\n--- LISTA DE PRODUTOS ---");
        estoque.gerarRelatorioMovimentacao();
    }

    // Função para gerenciar estoque
    private static void gerenciarEstoque(Estoque estoque, Scanner scanner) {
        System.out.println("\n--- GERENCIAR ESTOQUE ---");
        System.out.print("Digite o nome do gerente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        // Verificação simples de autenticação
        if (nome.equals("admin") && senha.equals("1234")) {
            int opcao;
            do {
                System.out.println("\n--- MENU DE GERENCIAMENTO ---");
                System.out.println("1. Registrar entrada de produto");
                System.out.println("2. Registrar saída de produto");
                System.out.println("0. Voltar ao menu principal");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha

                switch (opcao) {
                    case 1:
                        registrarEntrada(estoque, scanner);
                        break;
                    case 2:
                        registrarSaida(estoque, scanner);
                        break;
                    case 0:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 0);
        } else {
            System.out.println("Autenticação falhou. Nome ou senha incorretos.");
        }
    }

    // Função para registrar entrada de produto
    private static void registrarEntrada(Estoque estoque, Scanner scanner) {
        System.out.print("Digite o ID do produto: ");
        int id = scanner.nextInt();
        System.out.print("Digite a quantidade a adicionar: ");
        int quantidade = scanner.nextInt();
        estoque.registrarEntrada(id, quantidade);
    }

    // Função para registrar saída de produto
    private static void registrarSaida(Estoque estoque, Scanner scanner) {
        System.out.print("Digite o ID do produto: ");
        int id = scanner.nextInt();
        System.out.print("Digite a quantidade a remover: ");
        int quantidade = scanner.nextInt();
        estoque.registrarSaida(id, quantidade);
    }
}
