import java.util.Scanner;

public class Atividade8 {
    
    public static void main(String[] args){ 
     Scanner scanner = new Scanner(System.in);

        // Solicitando informações ao usuário.
        System.out.println("Informe um número: ");
        int  numero = scanner.nextInt(); 

            // Condicional If e Else.
        if (numero == 0){
            System.out.println(numero+ " é nulo");
        } else{
            if (numero > 0) {
                System.out.println(numero+ " positivo");
            } else{
                System.out.println(numero+ " negativo");
            }
        }
        scanner.close();
}
}