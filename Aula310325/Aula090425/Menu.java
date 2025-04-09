package Aula090425;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        
    
     Scanner scanner =  new Scanner(System.in);

        int op = 0;

        while (op != 3) {
           
        
            System.out.println("\n 1º - CADASTRAR");
            System.out.println("\n 2º - LISTAR");
            System.out.println("\n 3º - SAIR");
            System.out.println("\n ESCOLHA UMA OPÇÃO: ");
            op=scanner.nextInt();

            switch (op){
                case 1: 
                    System.out.println("\nOpção escolhida; CASTRAR");
                   
                    break;
 
                case 2:
                    System.out.println("\nOpção escolhida; LISTAR");
                    break; 
                    
                case 3:  
                    System.out.println("SAINDO DO PROGRAMA.");
                    break;   
                 
                default:
                System.out.println("Você escolheu uma opção que não existe.");

                    
            }  
        }
            scanner.close();
    }        
}
