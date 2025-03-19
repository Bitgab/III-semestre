import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = -1;

        while (true) {
            try {
                System.out.println("Digite sua idade: ");
                String input = scanner.nextLine();  // Captura a entrada como String
                idade = Integer.parseInt(input);  // Tenta converter a String para int

                if (idade > 0) {
                    System.out.println("Idade cadastrada com sucesso: " + idade + " anos");
                    break;  // Sai do loop se a idade for válida
                } else {
                    System.out.println("A idade não pode ser negativa ou zero! Digite uma idade válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! \nDigite apenas números inteiros positivos.");
                
            } finally {
                // Esta mensagem é exibida sempre, independentemente de ocorrer uma exceção ou não.
                System.out.println("Programa finalizado.");
            } 
        }

        scanner.close();  // Fecha o scanner após sair do loop
       
    }
}