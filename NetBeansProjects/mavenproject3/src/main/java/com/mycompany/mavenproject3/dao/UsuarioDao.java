/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3.dao;

import com.mycompany.mavenproject3.modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author aluno.den
 */
public class UsuarioDao {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    //Construtor adicionar usuário "pré-cadastrados"
    public UsuarioDao() {
        usuarios.add(new Usuario("admin", "admin123"));
        usuarios.add(new Usuario("usuario", "123"));
    }

    // Verifica se o login e senha informada existe na lista.
    public boolean autenticar (String login, String senha){
        for (Usuario u: usuarios){
                if (u.getLogin().equals(login) && u.getSenha().equals(senha)){
                    return true; // Usuário encontrado
                }
        }
        return false; // Não encontrado
    }  
}
