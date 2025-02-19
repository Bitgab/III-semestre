import java.util.Scanner;

public class Arraysoma {
    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma=0;

        for (int i=0 ; i < numeros.length; i++){
            System.out.println("Digite o número: " +(i+1)+":");
            numeros [i] = scanner.nextInt();
            soma += numeros[i];
        }

        System.out.println("A soma dos elementos do array é: "+soma);
        scanner.close();
        

    }    
}
