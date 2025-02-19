import java.util.Scanner;

public class ArraySolicitaNomeaoUsuario {
    public static void main(String[] args) { 
   
    Scanner scanner = new Scanner(System.in);
    
     System.out.println("Quantidade de nomes desedjado: ");
     int x = scanner.nextInt();
     scanner.nextLine();

     String []  nomes = new String[x];   

     for(int i=0; i < nomes.length; i++){
        System.out.println("Digite o "+(i+1)+"º nome: ");
        nomes [i] = scanner.nextLine();
      }   
    
    System.out.println("Nomes digitados ");
    for(int i = 0; i < nomes.length; i++){
        System.out.println("Nomes na ordem: " +(i+1)+ "º :"+nomes[i] );
    }  

  }   

}    

