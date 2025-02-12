import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        
        // Entrada
        Scanner scanner =  new Scanner(System.in);

        int op = 0;

        while (op != 4) {
            System.out.println("\n BEM VINDO A EMBALAGENS SENAI");
            
            try {
                // Pausa o programa por 4 segundos (4000 milissegundos)
                System.out.println("");
                Thread.sleep(1000);  // Pausa por 4 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\n 1º - CAIXA DE PAPELÃO");
            System.out.println("\n 2º - SACO PLÁSTICO");
            System.out.println("\n 3º - EMBALAGEM DE VIDRO");
            System.out.println("\n 4º - SAIR");
            System.out.println("\n ESCOLHA UMA OPÇÃO: ");
            op=scanner.nextInt();

            switch (op){
                case 1: 
                    System.out.println("\nCAIXA DE PAPELÃO");
                    break;
 
                case 2:
                    System.out.println("SACO PLÁSTICO");
                    break;

                case 3: 
                    System.out.println("EMBALAGEM DE VIDRO");
                    break;  
                    
                case 4:  
                    System.out.println("SAINDO DO PROGRAMA.");
                    break;   
                 
                default:
                System.out.println("Você escolheu uma opção que não existe.");

                    
            }  
        }
        scanner.close();
    }
}
