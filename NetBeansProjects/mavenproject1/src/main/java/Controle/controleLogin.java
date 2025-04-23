/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

/**
 *
 * @author aluno.den
 */
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

