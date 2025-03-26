
import java.util.Scanner; 

 // Função para limpar o terminal


public class Main {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   
    Produto produto = new Produto("Teclado ", 100, 11);
    produto.exibiInfo() ;
   
    

    System.out.println("\nBem Vindo a Loja do Programdor!\n");
        
    System.out.println("Qual produto você quer adquirir?");
    
    System.out.println("Produto: ");
     String Nome = scanner.nextLine();
    
    System.out.println("Informe o valor do produto.");
    System.out.println("Preço: R$ "  );
     Double preco = scanner.nextDouble();
        
    System.out.println("Informe a quantidade que deseja adquirir.");
    System.out.println("Quantidade: ");
     int Quantidade = scanner.nextInt();

    Produto produto2 = new Produto(Nome, preco, Quantidade);
    produto2.exibiInfo();
    

    }  
     
}

