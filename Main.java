import Usuarios.Usuario;
import Usuarios.UsuarioServices;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Admin", "Admin", "Admin");
        UsuarioServices.CriarUsuario(usuario1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo, faça o Login!");
        System.out.println("\nDigite seu email: ");
        String email = scanner.nextLine();
        System.out.println("\nDigite sua senha: ");
        String senha = scanner.nextLine();
        UsuarioServices.AutenticarUsuario(email, senha);

    }
}