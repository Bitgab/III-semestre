import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class Ler {
    public static void main(String[] args) {
            // Declara uma variável "nomeArquivo" que contém o nome do arquivo a ser lido. O arquivo é "mensagem.txt".
            String nomeArquivo = "mensagem.txt";
            // Início do bloco try-with-resources, que garante que o BufferedReader seja fechado automaticamente quando terminar a execução.
            try(BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))){
                // Declara uma variável para armazenar cada linha lida do arquivo.
                String linha;
                // Imprime uma mensagem informando que o conteúdo do arquivo será mostrado na tela.
                System.out.println("Contéudo do arquivo");
                // Início do laço while, que continuará enquanto houver linhas no arquivo.
                while ( (linha=reader.readLine()) != null) {  // A cada iteração, o método readLine() lê uma linha do arquivo.
                    System.out.println(linha);    // Imprime a linha lida do arquivo no console.
                }
                System.out.println("Erro ao ler o arquivo");
                System.out.println("Erro ao ler o arquivo");
                System.out.println("Erro ao ler o arquivo");
                
                reader.close();
            } catch(FileAlreadyExistsException e){
                System.out.println("Erro: arquivo"+nomeArquivo+"não foi encontrado");
            } catch(IOException e){
                System.out.println("Erro ao ler o arquivo");
        }
    }
}
