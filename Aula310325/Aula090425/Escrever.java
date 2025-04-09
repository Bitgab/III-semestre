package Aula090425;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Escrever {
    public static void main(String[] args) {
        // Passo 1: Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Passo 2: Solicita ao usuário para digitar uma frase
        System.out.println("Digite uma frase");

        // Passo 3: Lê a frase digitada pelo usuário
        String frase = scanner.nextLine();

        // Passo 4: Define o nome do arquivo onde a mensagem será salva
        String nomeArquivo = "mensagem.txt";

        try (BufferedWriter escrito = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
            // Passo 5: Escreve a frase no arquivo
            escrito.write(frase);

            // Passo 6: Adiciona uma nova linha após a frase
            escrito.newLine();

            // Passo 7: Fecha o BufferedWriter
            escrito.close();

            // Passo 8: Informa ao usuário que o arquivo foi criado com sucesso
            System.out.println("O arquivo " + nomeArquivo + " criado com sucesso!");

        } catch (Exception e) {
            // Passo 9: Caso ocorra algum erro durante o processo de gravação, o erro é capturado
            System.out.println("Erro ao criar o arquivo" + e.getMessage());
        } finally {
            // Passo 10: Este bloco será executado independentemente de haver erro ou não
            System.out.println("Saindo...");
        }

        // Passo 11: Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
