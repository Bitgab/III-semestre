import java.util.Scanner;

public class ArrayMaiorNumMenorNum {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    int [] numeros = new int [3];
    int MaiorNum = Integer.MIN_VALUE;
    int MenorNum = Integer.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " +(i + 1)+ "º número: ");
            numeros [i] = scanner.nextInt();

            if (numeros [i] >  MaiorNum){
                MaiorNum = numeros [i];
            }

            if (numeros [i] < MenorNum){
                MenorNum = numeros [i];
            }
        }

        System.out.println("Os números escolhidos: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println("O " +(i + 1)+ "º número: "+ numeros[i]);

        }

        System.out.println("O maior número: " +MaiorNum);
        System.out.println("O menor número: " +MenorNum);
        

   scanner.close();     
 }

}
