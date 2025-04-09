package Aula090425;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class Listar {
    public static void main(String[] args) { // Método principal, onde o código começa a execução.
        // Passo 1: Declara uma variável "nomeArquivoListar" que contém o nome do arquivo a ser lido. O arquivo é "mensagem.txt".
        String nomeArquivoListar = "mensagem.txt";

        // Passo 2:  Início do bloco try-with-resources, que garante que o BufferedReader seja fechado automaticamente quando terminar a execução.
        try(BufferedReader reader = new BufferedReader(new FileReader(nomeArquivoListar))){
        // Passo 3: Declara uma variável para armazenar cada linha lida do arquivo.
        String linha;
        // Passo 4: Imprime uma mensagem informando que o conteúdo do arquivo será mostrado na tela.
        System.out.println("Conteúdo do arquivo"); 

        while ((linha = reader.readLine()) != null) { // A cada iteração, o método readLine() lê uma linha do arquivo.
            // Passo 5: Imprime a linha lida do arquivo no console.
            System.out.println(linha); 
        }
        // Passo 6: Essa linha é redundante aqui devido ao try-with-resources, mas se fosse necessária, fecharia o BufferedReader.
        reader.close();
        
        } catch(FileAlreadyExistsException e){ // Captura um erro do tipo FileAlreadyExistsException (não é aplicável aqui, deveria ser FileNotFoundException).
            // Passo 7:  Imprime uma mensagem de erro caso o arquivo não exista.
            System.out.println("Erro: " + nomeArquivoListar + "Não foi encontrado ");
        } catch(IOException e){ // Captura erros do tipo IOException, que ocorre em casos gerais de problemas de leitura de arquivos.
            // Passo 8: Imprime uma mensagem de erro genérica caso ocorra algum problema ao ler o arquivo.
            System.out.println("Erro ao ler o arquivo");
        }
    }
}