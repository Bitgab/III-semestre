import java.util.ArrayList;
import java.util.Scanner;

public class PessoaApp {
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


    public static void main(String[] args) throws InterruptedException {
    ArrayList<Pessoa> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int opcao = 0;

        while (opcao != 4){

            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - REMOVER");
            System.out.println("4 - SAIR");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                    // Adicionando nome a lista.
                        System.out.println(" você escolheu: Cadastro\n");
                        System.out.println("Digite o nome: ");
                        scanner.nextLine();               
                        String nome = scanner.nextLine();

                        System.out.println("Digite o telefone: ");
                        scanner.nextLine();
                        String telefone = scanner.nextLine();
                        list.add(new Pessoa(nome, telefone));

                         // Garantir que o nome não seja vazio.
                        while (nome.trim().isEmpty()) {
                            System.out.println("Digite o nome: ");
                            nome = scanner.nextLine();

                            if (nome.trim().isEmpty()){
                                System.out.println("Nome não pode ser vazio. Tente novamente.");
                                }
                        }
                        
                         
                        // Garantir que o número não seja vazio.
                        while (telefone.trim().isEmpty()) {
                            System.out.println("Digite um número de telefone: ");
                            telefone = scanner.nextLine();

                            if (telefone.trim().isEmpty()){
                                System.out.println("Telefone não pode ser vazio. Tente novamente.");
                            }

                        }
                        // Adicionando número a lista.
                        System.out.println("\nNome e Número de telefone adicionados com êxito!\n");
                        Thread.sleep(4000);
                        LimparTerminal();
                        break;

                    case 2: 
                        System.out.println(" Você escolheu: Listar todos os Nomes e Números.\n");
                            if (list.isEmpty()){
                                System.out.println("Não há dados para exibir.");
    
                            } else {
                                System.out.println("Nomes e Números armazenados\n");
                                for (Pessoa pessoa: list){
                                System.out.println("Nome: " + pessoa.getNome()+ ", Telefone: " +pessoa.getTelefone()+ "\n");
                                }
                               
                            }
                        Thread.sleep(5000);    
                        break;
                        
                    case 3: 
                        System.out.println(" Você escolheu: Excluir Nome e Número.\n");
                            if (list.isEmpty()){
                                System.out.println("Não há dados para excluir.");
                            } 
                            else { 
                                System.out.println("Escolha o critério para exclução:");
                                System.out.println("1º - Excluir por nome");
                                System.out.println("2º - Excluir por número\n");
                                System.out.println(" Escolha uma opção: ");
                                int criterio = scanner.nextInt();
                                scanner.nextLine();

                                if (criterio == 1) {
                                    // Excluir por nome
                                    System.out.println("Digite o nome para excluir: ");
                                    String nomeExcluir = scanner.nextLine();
        
                                    boolean encontrado = false;
                                    for (Pessoa pessoa : list) {
                                        if (pessoa.getNome().equals(nomeExcluir)) {
                                            list.remove(pessoa);
                                            System.out.println("Nome e número excluídos com êxito!");
                                            encontrado = true;
                                            break;
                                        }
                                    }
        
                                    if (!encontrado) {
                                        System.out.println("Nome não encontrado no banco de dados!");
                                    }
        
                                } else if (criterio == 2) {
                                    // Excluir por número
                                    System.out.println("Digite o número para excluir: ");
                                    String numeroExcluir = scanner.nextLine();
        
                                    boolean encontrado = false;
                                    for (Pessoa pessoa : list) {
                                        if (pessoa.getTelefone().equals(numeroExcluir)) {
                                            list.remove(pessoa);
                                            System.out.println("Nome e número excluídos com êxito!");
                                            encontrado = true;
                                            break;
                                        }
                                    }
        
                                    if (!encontrado) {
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
