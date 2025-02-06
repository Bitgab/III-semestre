import java.util.Scanner;

public class Atividae11 {
    public static void main(String[] args){ 
    Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (i > 0  ){
            System.out.println("Digite o "+i+ "º número:");
             i = scanner.nextInt();
            i++;
        }
        scanner.close();
    }
}