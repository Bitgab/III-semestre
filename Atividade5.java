 import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitando informações ao usuário.
      System.out.println("informe qual é a força: ");
      Double  forca = scanner.nextDouble(); 
          
      System.out.println("informe qual é a distância: ");
      Double  distancia = scanner.nextDouble(); 
      
      // Fazendo calculo
       double trabalho = forca * distancia;

       System.out.printf("A força sobre um objeto é: %.2f" ,trabalho, " metros");
       scanner.close();
    }
}
