/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pet.dao;

import com.mycompany.pet.conexaoMySQL.ConexaoMySQL;
import com.mycompany.pet.modelo.Animal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author aluno.den
 */
public class AnimalDAO {
    public void cadastar(Animal animal) throws SQLException{
        String sql =  "INSERT INTO animal(nome, especie, idade)VALUES (?, ?, ?,)";
        try (Connection conn = ConexaoMySQL.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getEspecie());
            stmt.setInt   (3, animal.getIdade());
        }catch (SQLException e) {
            e.printStackTrace();
        }     
    }
    
    public ArrayList<Animal> listar() throws SQLException {
        ArrayList<Animal> lista = new ArrayList<>();
        String sql = "SELECT * FROM animal";
        try (Connection conn = ConexaoMySQL.conectar();
            Statement stmt = conn.createStatement();
            ResultSet an = stmt.executeQuery(sql)){
            while (an.next()){
                Animal a = new Animal(
                an.getInt("id"),
                an.getString("nome"),
                an.getString("especie"),
                an.getInt("idade")
                );
                lista.add(a);
            }
        }catch (SQLException e ){
            e.printStackTrace();
        }
        return lista;
    }

    public void atualizar(Animal animal) {
        String sql = "UPDATE pessoa SET id =?, nome = ?, especie = ?, idade = ?";
        try(Connection conn = ConexaoMySQL.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getEspecie());
            stmt.setInt(3, animal.getIdade());
            stmt.setInt(4, animal.getId());
            
        }catch (SQLException e){
            e.printStackTrace();
        }    
    }

   public void remover(int id) {
        String sql = "DELETE FROM pessoa WHERE id = ?";
        try (Connection conn = ConexaoMySQL.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cadastrar(Animal a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ArrayList<Animal> buscarPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
