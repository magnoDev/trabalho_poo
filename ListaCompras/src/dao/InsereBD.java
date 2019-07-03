/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author magno
 */
public class InsereBD {
    
    private Connection con;
    
    public InsereBD(Connection con){
        setCon(con);
    }
    
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
        public boolean inserirUsuario(Cliente usuario){
        boolean boo = false;
                        
        String sql = "INSERT INTO cliente(nome, email, senha) "
                + "VALUES (?, ?, ?)";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setInt(3, usuario.getSenha());
            
            if(ps.executeUpdate() > 0){
                boo = true;
            }
            
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
                
        return boo;
    }
    
}
