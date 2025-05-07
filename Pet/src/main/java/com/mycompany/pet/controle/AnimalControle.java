/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pet.controle;

import com.mycompany.pet.dao.AnimalDAO;
import com.mycompany.pet.modelo.Animal;
import java.util.ArrayList;

/**
 *
 * @author aluno.den
 */
public class AnimalControle {
    private final  AnimalDAO dao = new AnimalDAO();
    
    public  void cadastar(String nome, String especie, int idade){
        Animal a = new  Animal(nome, especie, idade);
        dao.cadastrar(a);
    }
    
    public ArrayList<Animal> listar(){ 
        return dao.listar();
    }
    
    public void atualizar(int id, String nome, String especie, int idade){
        Animal a = new Animal(id, nome, especie, idade);
        dao.atualizar(a);
    }
    
    public ArrayList<Animal> buscarPorNome(String nome){
        return dao.buscarPorNome(nome);
    }
}
