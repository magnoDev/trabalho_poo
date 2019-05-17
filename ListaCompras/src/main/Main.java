/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dominio.Cliente;
import dominio.Localizacao;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author 20162BSI0236
 */
public class Main {
    
    public static void main(String[] args) throws IOException, Exception {
        String nome = JOptionPane.showInputDialog("Insira o nome do usuário");
        String email = JOptionPane.showInputDialog("Insira o email do usuário");
        String dataNascimento = JOptionPane.showInputDialog("Insira a data de nascimento do usuário");
        String estado = JOptionPane.showInputDialog("Insira o estado em que o usuário reside");
        String cidade = JOptionPane.showInputDialog("Insira a cidade em que o usuário reside");
        String senha = JOptionPane.showInputDialog("Insira a senha que o usuário deseja");

        Localizacao localizadao = new Localizacao(estado, cidade);
        Cliente cliente = new Cliente(nome, email, dataNascimento, localizadao, senha);
        
        
        cliente.salvar(cliente);
        
        
    }
    
}
