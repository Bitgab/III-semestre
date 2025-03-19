public class ExemploTratamento {
public static void main (String[] args){
    
    try{

        int resultado = 10 / 0; //Vai gerar uma exceção (divisão por zero)
    } catch (ArithmeticException e){
        System.out.println("Erro: Divisão por zero não permitinda!");
    } finally {
        System.out.println("Finalizando o programa... ");
    }
}
}