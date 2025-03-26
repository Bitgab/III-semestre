public class Produto {

    private String Nome;
    private double preco;
    private int quantidade;
    

    public Produto (String Nome, double Preco, int Quantidade){
        this.Nome = Nome;
        this.preco = Preco;
        this.quantidade = Quantidade;
    }

  
    public String setNome() {
        return Nome;
    }

    public String getNome() {
        return Nome;
    }

    public Double setPreco() {
        return preco;
    }
    
    public Double getPreco() {
        return preco;
    }

    public int setQuantidade() {
        return quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public  double CalcularValorTotal() {
        return  quantidade * preco;
        
    } 
    

    public void exibiInfo(){
  
         System.out.println("Produto: "+ Nome);
         System.out.println("Preço: R$ " + preco + " reais");
         System.out.println("Quantidade: " + quantidade);
         System.out.println("Valor total em estoque: R$ " + CalcularValorTotal() + " reais");
        
    
    }
    
}
