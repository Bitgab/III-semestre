package Controle;
import dao.UsuarioDao;

public class controleLogin {
    private UsuarioDao usuarioDAO;
    // Construtor: criar o DAO
    public controleLogin() {
        usuarioDAO = new UsuarioDao();
    }
    // Metodo que será chamado pela interface (view)
    public boolean autenticar(String login, String senha){
        return usuarioDAO.autenticar(login, senha);
    }
}
