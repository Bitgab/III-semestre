public class Pessoa {
    public static void main(String[] args) {
        
    }

    // Acessador
    String Nome;
    String Telefone;
    
    // Construtor 
    public Pessoa (String Nome, String Telefone){
        this.Nome= Nome;
        this.Telefone=Telefone;
    }

    // Acessador
    public String getNome(){
        return  Nome;
    }
    // Modificador
   public String setNome(){
       return Nome;
   }
    // Acessador
    public String getTelefone(){
        return  Telefone;
    }
    // Modificador
    public String setTelefone(){
        return Telefone;
    }
}