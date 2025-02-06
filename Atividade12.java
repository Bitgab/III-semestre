import java.util.Scanner;

public class Atividade12 {
    
     public static void main(String[] args){ 
     Scanner scanner = new Scanner(System.in);

        // Solicitando informações ao usuário.
        System.out.println("Digite seu nome: ");
        String  nome = scanner.next(); 

        System.out.println("Digite seu nome: ");
        int  idade = scanner.nextInt(); 


        // condicional If e Else

        if (idade <= 12){
            System.out.println(nome+ " é classificada como criança por ter " +idade+ " anos");
        } else{
            if (idade >= 13 && idade <= 17){
                System.out.println(nome+ "é classificado como menor de idade por ter " +idade+ " anos");
            }
        } if (idade >= 18  && idade <= 59) {
            System.out.println(nome+ " é classificado como adulto por ter " +idade+ " anos");
        } else {
            if (idade >= 60){
                System.out.println(nome+ " é classificado como idoso por ter " +idade+ " anos");
            }
            
        }

        scanner.close();
    }
}