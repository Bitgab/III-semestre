/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3.controle;

import com.mycompany.mavenproject3.dao.UsuarioDao;

/**
 *
 * @author aluno.den
 */
public class ControleLogin {
       private UsuarioDao usuarioDAO;
    // Construtor: criar o DAO
    public ControleLogin() {
        usuarioDAO = new UsuarioDao();
    }
    // Metodo que será chamado pela interface (view)
    public boolean autenticar(String login, String senha){
        return usuarioDAO.autenticar(login, senha);
    } 
}
