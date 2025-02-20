public class LimparTerminal {

    public static void clear() {
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

    public static void main(String[] args) {
        // Exemplo de uso
        System.out.println("Este é um exemplo de saída.");

        // Limpar o terminal
        clear();

        // Mais mensagens após a limpeza
        System.out.println("O terminal foi limpo.");

        

    }
}
