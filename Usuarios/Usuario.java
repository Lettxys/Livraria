package Livraria.Usuarios;

public class Usuario {
    private static int Contadorid = 0 ;
    private static int ContadorPessoas = 0 ;
    protected int id;
    private String nome;
    private String email;
    private String senha;

    public Usuario( String nome, String email, String senha) {
        ContadorPessoas++;
        this.id = Contadorid++;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

     public Usuario(int id, String nome, String email, String senha) {
        this.id = id;
        ContadorPessoas++;
        this.nome = nome;
        this.email = email;
        this.senha = senha;

        if (id >= Contadorid) {
            Contadorid = id + 1;
        }
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public int getId() { return id; }

}

class Adimin extends Usuario {
    public Adimin(String nome, String email, String senha) {
        super(nome, email, senha);
    }
}
class Cliente extends Usuario {
    public Cliente(String nome, String email, String senha) {
        super(nome, email, senha);
    }
}