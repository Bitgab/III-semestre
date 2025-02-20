import java.util.Scanner;

public class ArrayMaiorNum {
   public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    int [] numeros = new int[3];
    int MaiorNum = numeros [0];
    

    for (int i = 0; i < numeros.length; i++){
        System.out.println("Digite o " +(i+1)+ "º número:");
        numeros [i] = scanner.nextInt();
       
        if (numeros[i] > MaiorNum){
           MaiorNum = numeros[i];    
        }
        
    }

    System.out.println("Números selecionado:");
    for (int i = 0; i < numeros.length; i++){
        System.out.println("O " +(i+1)+ "º número: " +numeros[i]);
    }

    System.out.println(" O maior número é: "+MaiorNum);

    scanner.close();
   }
    

}
