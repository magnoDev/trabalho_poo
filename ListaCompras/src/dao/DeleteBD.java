/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.ListaCompras;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class DeleteBD {
    private Connection con;
    
    public DeleteBD(Connection con){
        setCon(con);
    }
    
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public boolean deletaLista(ListaCompras lista){
        boolean boo = false;
                        
        String sql = "DELETE FROM itemlista WHERE nome = ? AND datacompra = ? AND supermercado = ?";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, lista.getNomeLista());
            ps.setTimestamp(2, lista.getData());
            ps.setString(3, lista.getSupermercado());
            
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
