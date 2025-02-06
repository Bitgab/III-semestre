import java.util.Scanner;

public class Atividade7 {
    

    public static void main(String[] args){ 
     Scanner scanner = new Scanner(System.in);
        // Solicitando informações ao usuário.
        System.out.println("Qual é a sua nome: ");
        String  nome = scanner.next(); 
      
        System.out.println("Qual é a sua idade: ");
        int  idade = scanner.nextInt(); 

        if (idade >= 18) {
        System.out.println(nome +" você é maior de idade");
        
        } else {
        System.out.println(nome+ " você é menor de idade");
      }
     scanner.close();
}
}
