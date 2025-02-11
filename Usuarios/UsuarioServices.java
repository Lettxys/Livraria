package Livraria.Usuarios;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsuarioServices {

    public void CriarUsuario(Usuario usuario) {
        String RepositorioUsuario = "Usuarios.txt";
      try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(RepositorioUsuario, true));
        writer.write(usuario.getId() + ";" + usuario.getNome() + ";" + usuario.getEmail() + ";" + usuario.getSenha() + "\n");
        writer.newLine();
        writer.close();
      } catch (IOException e) {
        System.out.println("Erro ao salvar usuário: " + e.getMessage());;
      }
    }

    public static void main() {
        UsuarioServices usuarioServices = new UsuarioServices();
        Usuario usuario1 = new Usuario("Let", "jmkoygg@gmail.com", "123456");
        Usuario usuario2 = new Usuario("João", "jmkoygg@gmail.com", "123456");
        Usuario usuario3 = new Usuario("isa", "jmkoygg@gmail.com", "123456");
        Usuario usuario4 = new Usuario("elisa", "jmkoygg@gmail.com", "123456");
        Usuario usuario5 = new Usuario("dani", "jmkoygg@gmail.com", "123456");

        usuarioServices.CriarUsuario(usuario2);

    
}
}
