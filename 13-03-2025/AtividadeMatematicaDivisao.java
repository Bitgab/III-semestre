import java.util.Scanner;
import java.util.InputMismatchException;

public class AtividadeMatematicaDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
             System.out.println("Digite o 1º número: ");
             int primeiroNum = scanner.nextInt();

             System.out.println("\nDigite o 2º número: " );
             int segundoNum = scanner.nextInt();
             
             int Divisao = primeiroNum / segundoNum;

             System.out.println("Resultado: " + Divisao);
        }catch(InputMismatchException e){
            System.out.println("Formato inválido!");
            System.out.println("\n Detalhes do erro:" +e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Operação inválida!");
            System.out.println("\nDetalhe do erro: " + e.getMessage());
        } finally{
            System.out.println("Finalizando o programa... ");
        }


    }
}
