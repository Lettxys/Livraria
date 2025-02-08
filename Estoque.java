class Estoque {
    private List<Livro> inventario;

    // Construtor com os livros
    public Estoque() {
        inventario = new ArrayList<>();
        // inventário com quantidades em estoque etc
        inventario.add(new Livro("George", "Orwell", "Principis", "Ficção Científica", 11, "1984", 10));
        inventario.add(new Livro("Robert", "Sapolsky", "Scribner", "Biografia", 14, "A Primates Memoir", 5));
        inventario.add(new Livro("George", "Orwell", "Martin Claret", "Ficção Política", 15, "A Revolução dos Bichos", 8));
        inventario.add(new Livro("Roald", "Dahl", "Rocco", "Infantil", 8, "Boy", 15));
        inventario.add(new Livro("Suzanne", "Collins", "Todavia", "Ficção Científica", 12, "Em Chamas", 7));
        inventario.add(new Livro("Roald", "Dahl", "Rocco", "Infantil", 9, "A Fantástica Fábrica de Chocolate", 20));
        inventario.add(new Livro("EB", "White", "Rocco", "Infantil", 6, "A Menina e o Porquinho", 12));
        inventario.add(new Livro("Ray", "Bradbury", "Darkside", "Ficção Científica", 6, "Fahrenheit 451", 9));
        inventario.add(new Livro("Shell", "Silverstein", "HarperCollins", "Infantil", 17, "Falling Up", 4));
        inventario.add(new Livro("RK", "Rowling", "Rocco", "Fantasia", 28, "Animais Fantásticos e Onde Habitam", 6));
        inventario.add(new Livro("Rich", "Roll", "Companhia das Letras", "Biografia", 15, "Finding Ultra", 3));
        inventario.add(new Livro("Isaac", "Asimov", "HarperCollins", "Ficção Científica", 10, "Fundação", 11));
        inventario.add(new Livro("Roald", "Dahl", "Intríseca", "Infantil", 5, "Going Solo", 10));
        inventario.add(new Livro("Dr", "Seuss", "Random House", "Infantil", 2, "Ovos Verdes e Presunto", 25));
        inventario.add(new Livro("JK", "Rowling", "Rocco", "Fantasia", 28, "Harry Potter e as Relíquias da Morte", 14));
        inventario.add(new Livro("JK", "Rowling", "Rocco", "Fantasia", 27, "Harry Potter e o Cálice de Fogo", 13));
        inventario.add(new Livro("JK", "Rowling", "Rocco", "Fantasia", 22, "Harry Potter e o Enigma do Príncipe", 10));
        inventario.add(new Livro("JK", "Rowling", "Rocco", "Fantasia", 12, "Harry Potter e a Ordem da Fênix", 9));
        inventario.add(new Livro("JK", "Rowling", "Rocco", "Fantasia", 23, "Harry Potter e o Prisioneiro de Azkaban", 8));
        inventario.add(new Livro("JK", "Rowling", "HarperCollins", "Fantasia", 18, "Harry Potter e a Pedra Filosofal", 7));
        inventario.add(new Livro("Isaac", "Asimov", "HarperCollins", "Ficção Científica", 11, "Eu, Robô", 6));
        inventario.add(new Livro("Stephen", "King", "Companhia das Letras", "Terror", 8, "It - A Coisa", 5));
    }

    // exibir todos os livros do inventário
    public void exibirTodosLivros() {
        System.out.println("Todos os livros no inventário:");
        System.out.println("AUTOR_PRIMEIRO AUTOR_ULTIMO EDITORA GÊNERO PREÇO TÍTULO ESTOQUE");
        for (Livro livro : inventario) {
            System.out.println(livro);
        }
    }

    // Método pra pesquisar no inventário
    public void pesquisarInventario(String consulta) {
        System.out.println("Resultados da pesquisa para \"" + consulta + "\":");
        System.out.println("AUTOR_PRIMEIRO AUTOR_ULTIMO EDITORA GÊNERO PREÇO TÍTULO ESTOQUE");
        for (Livro livro : inventario) {
            if (livro.getTitulo().toLowerCase().contains(consulta.toLowerCase()) ||
                livro.getAutorNome().toLowerCase().contains(consulta.toLowerCase()) ||
                livro.getAutorSobrenome().toLowerCase().contains(consulta.toLowerCase())) {
                System.out.println(livro);
            }
        }
    }

    // Método para verificar quais livros precisam de reposição(em construção...)
    public void verificarReposicao() {
        System.out.println("Verificando livros que precisam de reposição...");
        for (Livro livro : inventario) {
            if (livro.getQuantidadeEmEstoque() <= 2) {
                System.out.println("Reposição necessária: \"" + livro.getTitulo() + "\". Estoque atual: " + livro.getQuantidadeEmEstoque());
            }
        }
    }
}

