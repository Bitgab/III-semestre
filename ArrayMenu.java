import java.util.Scanner;

public class ArrayMenu {
    public static void main(String[] args) {
     
    Scanner scanner = new Scanner(System.in);
       
    int  [] numeros = new int [3];
    int contador = 0;
    int opcao;
    int i = 0;

       do{
          
          System.out.println("1º - Remover o último número "); 
          System.out.println("2º - Adicionar um número");
          System.out.println("3º - Exibir todos os números");
          System.out.println("4º - sair");
          System.out.println("Escolha uma opção: ");
          opcao = scanner.nextInt();

          switch(opcao){

            case 1:
                // Remover um número específico
                if (contador == 0) {
                    System.out.println("Não há números para remover.");
                } else {
                    System.out.println("Você escolheu: Remover um número");
                    System.out.println("Os números cadastrados são:");
                    for (int i = 0; i < contador; i++) {
                        System.out.println((i + 1) + "º número: " + numeros[i]);
                    }

                    System.out.print("Digite o índice do número a ser removido (1 a " + contador + "): ");
                    int indice = scanner.nextInt() - 1;  // Ajuste do índice para ser 0 baseado.

                    if (indice < 0 || indice >= contador) {
                        System.out.println("Índice inválido. Tente novamente.");
                    } else {
                        // Remover o número e deslocar os elementos subsequentes
                        for (int i = indice; i < contador - 1; i++) {
                            numeros[i] = numeros[i + 1];  // Desloca os números para a esquerda
                        }
                        contador--;  // Diminui o contador após a remoção
                        System.out.println("Número removido com êxito.");
                    }
                    }
                break;

            case 2: 
                
                System.out.println(" você escolheu: Adicionar um número");
                if (contador < numeros.length){
                    System.out.println("Digite o número a ser adicionado: ");
                    int numero = scanner.nextInt();
                    numeros[contador]  = numero;
                    contador++;
                    System.out.println("Número adicionado com sucesso."); 
                } else {
                    System.out.println("Não há espaço disponível para adicionar mais números.");
                }
                break;
              
            case 3:

                System.out.println("Você escolheu: Ver todos os números");
                if (contador == 0){
                    System.out.println("Não há número cadastrado.");  
                } else{
                    System.out.println("Os números cadastrados são:");
                    for (int i = 0; i < contador; i++){
                        System.out.println((i + 1)+ "º número " +numeros[i]);
                    }
                } 
                break;
                
            case 4: 
                System.out.println("Você escolheu: Sair");
                System.out.println("Saindo...");
                break;
            
            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;

          }


       }while(opcao != 4);

      scanner.close();  
    }
}
