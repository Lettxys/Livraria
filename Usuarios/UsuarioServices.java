package Livraria.Usuarios;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsuarioServices {

    public void CriarUsuario(Usuario usuario) {
        String RepositorioUsuario = "Usuarios.txt";
      try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(RepositorioUsuario, true));
        writer.write(usuario.getNome() + ";" + usuario.getEmail() + ";" + usuario.getSenha() + "\n");
        writer.newLine();
      } catch (IOException e) {
        System.out.println("Erro ao salvar usuário: " + e.getMessage());;
      }
    }

    public static void main() {
        UsuarioServices usuarioServices = new UsuarioServices();
        Usuario usuario = new Usuario("lucas", "jmkoygg@gmail.com", "123456");
        usuarioServices.CriarUsuario(usuario);
    
}
}
