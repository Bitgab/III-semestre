import java.util.Scanner; 

public class Atividade6 {
    
public static void main(String[] args){ 
    Scanner scanner = new Scanner(System.in);
       // Solicitando informações ao usuário.
       System.out.println("Qual é a sua nome: ");
       String  nome = scanner.next(); 

       System.out.println("Qual é a sua peso: ");
       double  peso = scanner.nextDouble();

       System.out.println("Qual é a sua altura: ");
       double  altura = scanner.nextDouble();

       // Calculando o IMC.
       double IMC = peso * (altura / altura);

       System.out.printf(nome+ " seu IMC é %.2f",IMC );
       scanner.close();
 }

}   