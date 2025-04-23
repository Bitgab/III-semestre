/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author aluno.den
 */
public class PessoaDAO {
    private  static ArrayList<Pessoa> lista = new ArrayList<>();
    
    public  void adicionar(Pessoa pessoa){
        lista.add(pessoa);
    }
    
    public  ArrayList<Pessoa> listar(){
        return lista
    }
    
}
