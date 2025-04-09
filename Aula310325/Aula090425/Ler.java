package Aula090425;

import java.io.BufferedReader;  // Importa a classe BufferedReader, usada para ler o conteúdo de um arquivo de forma eficiente linha por linha.
import java.io.FileReader;      // Importa a classe FileReader, que é usada para abrir e ler arquivos.
import java.io.IOException;     // Importa a classe IOException, que é usada para capturar erros de entrada/saída durante a leitura de arquivos.
import java.nio.file.FileAlreadyExistsException;  // Importa a classe FileAlreadyExistsException, mas não é necessária nesse caso.

    public class Ler {  // Declaração da classe principal "Ler", onde o código será executado.
        public static void main(String[] args) {  // Método principal, onde o código começa a execução.

        String nomeArquivo = "mensagem.txt";  // Declara uma variável "nomeArquivo" que contém o nome do arquivo a ser lido. O arquivo é "mensagem.txt".

        // Início do bloco try-with-resources, que garante que o BufferedReader seja fechado automaticamente quando terminar a execução.
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {  

            String linha;  // Declara uma variável para armazenar cada linha lida do arquivo.

            System.out.println("Conteúdo do arquivo");  // Imprime uma mensagem informando que o conteúdo do arquivo será mostrado na tela.

            // Início do laço while, que continuará enquanto houver linhas no arquivo.
            while ((linha = reader.readLine()) != null) {  // A cada iteração, o método readLine() lê uma linha do arquivo.
                System.out.println(linha);  // Imprime a linha lida do arquivo no console.
            }

            // reader.close();  // Essa linha é redundante aqui devido ao try-with-resources, mas se fosse necessária, fecharia o BufferedReader.
        } catch (FileAlreadyExistsException e) {  // Captura um erro do tipo FileAlreadyExistsException (não é aplicável aqui, deveria ser FileNotFoundException).
            System.out.println("Erro: arquivo " + nomeArquivo + " não foi encontrado");  // Imprime uma mensagem de erro caso o arquivo não exista.
        } catch (IOException e) {  // Captura erros do tipo IOException, que ocorre em casos gerais de problemas de leitura de arquivos.
            System.out.println("Erro ao ler o arquivo");  // Imprime uma mensagem de erro genérica caso ocorra algum problema ao ler o arquivo.
        }
    }
}

