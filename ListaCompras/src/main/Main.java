/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.sql.*;
import dao.ConectarBD;
import gui.Login;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author 20162BSI0236
 */
public class Main {
    
public static void main(String[] args) {
        // TODO code application logic here
        Connection con = null;
        
        con = ConectarBD.abrirConexao();
        
        if(con != null){
            
            //JOptionPane.showMessageDialog(null, "Sucesso ao conectar ao Banco.",
            //                                            "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            new Login().setVisible(true);         
            
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao Banco.",
                                                        "Erro!", ERROR_MESSAGE);
        }
        
        ConectarBD.fecharConexao(con);              
    }
    
}
