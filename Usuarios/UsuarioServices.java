package Livraria.Usuarios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioServices {
  private static final String RepositorioUsuario = "usuarios.txt";

    public void CriarUsuario(Usuario usuario) {     
      try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(RepositorioUsuario, true));
        writer.write(usuario.getId() + ";" + usuario.getNome() + ";" + usuario.getEmail() + ";" + usuario.getSenha() + "\n");
        writer.close();
        System.out.println("Usuário criado com sucesso!");

      } catch (IOException e) {
        System.out.println("Erro ao salvar usuário: " + e.getMessage());;
      }
    }

    public void RemoverUsuario(int idParaRemover) {
      List<String> linhas = new ArrayList<>();
      try (BufferedReader reader = new BufferedReader(new FileReader(RepositorioUsuario))) {
        String linha;
        while ((linha = reader.readLine()) != null) {
          if (!linha.startsWith(idParaRemover + ";")) { linhas.add(linha); }
        }            
      } catch (IOException e) {
          System.out.println("Erro ao ler o arquivo: " + e.getMessage());
      }

      try (BufferedWriter writer = new BufferedWriter(new FileWriter(RepositorioUsuario))) {
        for (String linha : linhas) {
          writer.write(linha);
          writer.newLine();
        }
        writer.close();
        System.out.println("Usuário removido com sucesso!");
      } catch (IOException e) {
          System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
      }
    }
}

