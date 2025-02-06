import java.util.Scanner;

public class Atividade9 {
     public static void main(String[] args){ 
     Scanner scanner = new Scanner(System.in);

        // Solicitando informações ao usuário.
        System.out.println("Informe o primeiro número: ");
        int  num1 = scanner.nextInt(); 

        System.out.println("Informe o segundo número: ");
        int  num2 = scanner.nextInt(); 

        if (num1 > num2){
            System.out.println(" O número " +num1+ " é maior");
            System.out.println(" O número " +num2+ " é menor");

        } else{
            if (num2 > num1){
                System.out.println("O número " +num2+ " é maior");
                System.out.println(" O número " +num1+ " é menor");
            } else{
                System.out.println(" Os números são iguais.");
            }

        }
        
        scanner.close();
    }
}