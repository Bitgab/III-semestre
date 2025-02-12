import java.util.Scanner;

public class Menu2 {
    
    public static void main(String[] args) {
        // Entrada
        Scanner scanner = new Scanner(System.in);

        int op = 0;

        while (op != 4) {
            clearConsole();  // Limpar o terminal antes de mostrar o menu

            System.out.println("\n BEM VINDO A LOJA DO PROGRAMADOR");
            
            try {
                // Pausa o programa por 1 segundo (1000 milissegundos)
                System.out.println("");
                Thread.sleep(1000);  // Pausa por 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\n 1º - CANETA ESFEROGRÁFICA");
            System.out.println("\n 2º - CANETA GEL");
            System.out.println("\n 3º - CANETA TINTEIRO");
            System.out.println("\n 4º - SAIR");
            System.out.println("\n ESCOLHA UMA OPÇÃO: ");
            op = scanner.nextInt();

            switch (op) {
                case 1: 
                    System.out.println("\nCANETA ESFEROGRÁFICA");
                    System.out.println("Econômica e de longa duração.");
                    break;

                case 2:
                    System.out.println("CANETA GEL");
                    System.out.println(" Tinta mais pigmentada e escrita suave.");
                    break;

                case 3: 
                    System.out.println("CANETA TINTEIRO");
                    System.out.println("Clássica e elegante, usando para caligrafia.");
                    break;

                case 4:
                    System.out.println("\nSaindo do programa...");
                    break; 
                
                default:
                    System.out.println("Você escolheu uma opção que não existe.");
                    break;
            }
        }

        // Após sair do laço, o programa será finalizado
        scanner.close();
    }

    // Função para limpar o terminal
    private static void clearConsole() {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                Runtime.getRuntime().exec("cls");  // Limpar no Windows
            } else {
                Runtime.getRuntime().exec("clear");  // Limpar no Linux/Mac
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
