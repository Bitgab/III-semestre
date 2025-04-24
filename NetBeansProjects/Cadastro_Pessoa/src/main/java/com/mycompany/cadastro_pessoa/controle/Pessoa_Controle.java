/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro_pessoa.controle;

import com.mycompany.cadastro_pessoa.modelo.Pessoa;

/**
 *
 * @author aluno.den
 */
public class Pessoa_Controle {
    private Pessoa_Controle dao = new PessoaDAO();
    
    public  void  cadastrar(String nome, int idade){
        Pessoa p = new Pessoa(nome, idade);
        dao.inserir(p);
        
    }
    
    public ArraList<Pessoa> listar(){
        return dao.listar();
    }
    
    public void atualizar (int id, String nome, int idade){
        Pessoa p = new Pessoa (id,nome,idade);
    }
    
    public  void remover(int id){
        dao.remover(id);
    }
    
    public ArraList<Pessoa> buscarPorNome(String nString nome){
        return dao.buscarPorNome(nome);
    }
}
