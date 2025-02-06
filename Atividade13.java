import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args){ 
     Scanner scanner = new Scanner(System.in);

        // Solicitando informações ao usuário.
        System.out.println("Usuário: ");
        String usuario = scanner.next();

        System.out.println("Password: ");
        String  senha= scanner.next(); 

        String senhacorreta = "ALFA";

        if (senha.equals(senhacorreta)){
            System.out.println("hello, " +usuario+ " \n " + "Porta aberta");
        }else{
            System.out.println("Porta fechada");
        }

       scanner.close(); 
    }
}

  /*System.out.println("Usuário: ");
String usuario = scanner.next();

System.out.println("Password: ");
String  senha= scanner.next().intern(); 


if (senha == "ALFA"){
    System.out.println("hello, " +usuario+ " \n " + "Porta aberta");
}else{
    System.out.println("Porta fechada");
}

scanner.close(); */