package Aula090425;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
    
    // Passo 1: Criação de um objeto Scanner para ler a entrada do usuário.
    Scanner scanner = new Scanner(System.in);
    // Passo 2:  Solicitar ao usuário para digitar seu nome.
    System.out.println("Digite seu nome");
    // Passo 3: Lê o nome digitado pelo usuário.
    String nome = scanner.nextLine();
    // Passo 4: Solicitando ao usuário para digitar sua idade.
    System.out.println("Informe sua idade: ");
    // Passo 5: Lê a idade digitado pelo usuário.
    int idade = scanner.nextInt();

    // Passo 6: Difine o nome do Arquivo onde a mensagem séra salva.
    String nomeArquivo = "mensagem.txt";

        try(BufferedWriter cadastro = new BufferedWriter(new FileWriter(nomeArquivo,true))){
        // Passo 6: Salvar o nome no arquivo.
            cadastro.write("Nome: "+nome);
            // Passo 7: Salvar idade no arquivo.
            cadastro.write("Idade: "+ idade+ " anos");
            // Passo 8: Adicionar uma nova linha.
            cadastro.newLine();
            // Passo 9: Fecha o BufferedWriter
            cadastro.close();

            // Passo 10: Informa ao usuário que o cadastro foi criado com sucesso.
            System.out.println("Cadastro " + nomeArquivo+ " criado com sucesso!");
        } catch(Exception e) {

            // Passo 11:  Caso ocorra algum erro durante o processo de gravação, o erro é capturado.
            System.out.println("Erro ao cadastra o arquivo" + e.getMessage());
        }finally{
            // Passo 12: Este bloco será executado independentemente de haver erro ou não
                System.out.println("Saindo...");
            }
        // Passo 13: Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
