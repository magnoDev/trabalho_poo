/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import dominio.*;
import dominio.produto.Produto;
import java.sql.*;

/**
 *
 * @author magno
 */
public class ConsultaBD {
    
    private Connection con;
    
    public ConsultaBD(Connection con){
        setCon(con);
    }
    
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    /**Metodo para validar usuario e senha para acessar o sistema.
    **/
    public boolean verificaUsuarioSenha(Cliente usuario){
        boolean boo = false;
        
        int idUsuario = 0;
        
        String sql = "SELECT id FROM cliente "
                + "WHERE email = ? AND senha = ?";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, usuario.getEmail());
            ps.setInt(2, usuario.getSenha());
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                idUsuario = (int) rs.getObject(1);
            }
            rs.close();
            
            if(idUsuario > 0){
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
    
    public String retornaNomeUsuario(Cliente usuario){
        String nome = "";
        
        String sql = "SELECT nome FROM cliente "
                + "WHERE email = ? AND senha = ?";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, usuario.getEmail());
            ps.setInt(2, usuario.getSenha());
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                nome = (String) rs.getObject(1);
            }
            rs.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
        return nome;
        
    }
    
    public int retornaIdUsuario(Cliente usuario){
        int id = 0;
        
        String sql = "SELECT id FROM cliente "
                + "WHERE email = ?";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, usuario.getEmail());
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                id = (Integer) rs.getObject(1);
            }
            rs.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
        return id;
        
    }

    public int retornaIdProduto(Produto produto){
        int id = 0;
        
        String sql = "SELECT id FROM produto "
                + "WHERE nome = ?";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, produto.getNome());
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                id = (Integer) rs.getObject(1);
            }
            rs.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
        return id;
        
    }
    
    /**Metodo para verificar se usuario já existe.
    **/
    public boolean verificaUsuario(Cliente usuario){
        boolean boo = false;
        
        int idUsuario = 0;
        
        String sql = "SELECT id FROM cliente "
                + "WHERE email = ?";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, usuario.getEmail());
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                idUsuario = (int) rs.getObject(1);
            }
            rs.close();
            
            if(idUsuario > 0){
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
