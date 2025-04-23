/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3.view;

import com.mycompany.mavenproject3.controle.ControleLogin;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author aluno.den
 */ 

public class LoginView extends JFrame {
    private JTextField campoLogin;
    private JPasswordField campoSenha;
    private JButton botaoEntrar;
    private ControleLogin controle;
    
    public LoginView() {
        super("Tela de Login");
        controle = new ControleLogin(); // cria o controlador
        
        // Layout de 3 linhas e 2 colunas
        setLayout(new GridLayout(3, 2, 10, 10));

        campoLogin = new JTextField();
        campoSenha = new JPasswordField();
        botaoEntrar = new JButton("Entrar");

        add(new JLabel("Login:"));
        add(campoLogin);
        add(new JLabel("Senha:"));
        add(campoSenha);
        add(new JLabel(""));
        add(botaoEntrar);

         // Ação do botão "Entrar"
        botaoEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String login = campoLogin.getText();
                String senha = new String(campoSenha.getPassword());

                // Chama o controller para autenticar
                if (controle.autenticar(login, senha)) {
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                } else {
                    JOptionPane.showMessageDialog(null, "Login inválido.");
                }
            }
        });

        setSize(300, 150);
        setLocationRelativeTo(null); // centraliza a janela
    }
}
