import java.util.ArrayList;
import java.util.Scanner;

public class ArrayAgenda {

    public static void LimparTerminal() {
        String os = System.getProperty("os.name");

        try {
            if (os.contains("Windows")) {
                // Comando para limpar o terminal no Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Comando para limpar o terminal no Linux/macOS
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws Exception{
       Scanner  scanner = new Scanner(System.in);
       
       ArrayList <String> nomes  = new ArrayList<>();
       ArrayList <String> numeros  = new ArrayList<>(); 

       int opcao;

       while (true) {
        System.out.println("   MENU AGENDA \n");
        System.out.println("  1º - Cadastro "); 
        System.out.println("  2º - Listar");
        System.out.println("  3º - Excluir");
        System.out.println("  4º - sair\n");
        System.out.println("Escolha uma opção: ");
        opcao = scanner.nextInt();
        LimparTerminal();


        switch (opcao) {
            case 1:
                // Adicionando nome a lista.
                System.out.println(" você escolheu: Cadastro\n");
                System.out.println("Digite o nome: ");
                scanner.nextLine();               
                String nome = scanner.nextLine();

                 System.out.println("Digite o número de telefone: ");
                String numero = scanner.nextLine();

                // Garantir que o nome não seja vazio.
                while (nome.trim().isEmpty()) {
                    System.out.println("Digite o nome: ");
                    nome = scanner.nextLine();

                    if (nome.trim().isEmpty()){
                        System.out.println("Nome não pode ser vazio. Tente novamente.");
                    }
                }
                // Garantir que o número não seja vazio.
                while (numero.trim().isEmpty()) {
                    System.out.println("Digite o número: ");
                    numero = scanner.nextLine();

                    if (nome.trim().isEmpty()){
                        System.out.println("Número não pode ser vazio. Tente novamente.");
                    }

                }

                // Adicionando número a lista.
                nomes.add(nome);
                numeros.add(numero);
                System.out.println("\nNome e Número de telefone adicionados com êxito!\n");
                Thread.sleep(4000);
            LimparTerminal();
            break;


            case 2: 
                System.out.println(" você escolheu: Listar todos os Nomes e Números.\n");
                if (nomes.isEmpty()){
                    System.out.println("Não há dados para exibir.");

                } else {

                    System.out.println("Nomes e Números armazenados\n");
                    for (int i = 0; i < nomes.size(); i++){
                        System.out.println("Nome: " + nomes.get(i) + ", Número: " + numeros.get(i)+ "\n");
                    }

                }
            Thread.sleep(5000);    
            break;
            
            

            case 3: 
                System.out.println(" você escolheu: Excluir Nome e Número.\n");
                if (nomes.isEmpty()){
                    System.out.println("Não há dados para excluir.");
                } 
                    else { 
                        System.out.println("Escolha o critério para exclução:");
                        System.out.println("1º - Excluir por nome");
                        System.out.println("2º - Excluir por número\n");
                        System.out.println(" Escolha uma opção: ");
                        int criterio = scanner.nextInt();

                            if (criterio == 1){
                                // Excluir por nome.
                                System.out.println("Digite o nome para excluir: ");
                                scanner.nextLine();
                                String nomeExcluir = scanner.nextLine();

                                int index = nomes.indexOf(nomeExcluir);

                                if (index != -1){
                                    nomes.remove(index);
                                    numeros.remove(index);
                                    System.out.println("Nome e número excluídos com êxito!");
                                } else {
                                    System.out.println("Nome não encontrado no banco de dados!");
                                }
                            } else if (criterio == 2){
                                    // Excluir por número.
                                    System.out.println("Digite o número para excluir: ");
                                    scanner.nextLine();
                                    String numeroExcluir = scanner.nextLine();

                                    int index = numeros.indexOf(numeroExcluir);

                                    if (index != -1){

                                        nomes.remove(index);
                                        numeros.remove(index);
                                        System.out.println("Nome e número excluidos com êxito!");
                                    } else {
                                        System.out.println("Número não encontrado no banco de dados!");
                                       }
                                }
                            
                    }   
            break;
        
             
            case 4: 
                System.out.println("Você escolheu: Sair");
                System.out.println("Saindo.");
                Thread.sleep(1000);
                LimparTerminal();

                System.out.println("Saindo..");
                Thread.sleep(1000);
                LimparTerminal();

                System.out.println("Saindo...");
                Thread.sleep(1000);
                LimparTerminal();

                System.out.println("Saindo....");
                Thread.sleep(1000);
                LimparTerminal();

                System.out.println("Saindo.....");
                Thread.sleep(1000);
                LimparTerminal();

                System.out.println("Saindo......");
                Thread.sleep(1000);
                LimparTerminal();
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;
                
        }

       }

    }

}
