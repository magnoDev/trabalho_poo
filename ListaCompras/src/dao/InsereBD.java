/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.*;
import dominio.produto.Produto;
import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

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
    
    public void inserirProduto(Produto produto){
        String sql = "INSERT INTO produto(nome, valor) "
                + "VALUES (?, ?)";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setDouble(2, produto.getValor());
            ps.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public boolean inserirLista(ListaCompras lista,  Cliente user){
        boolean boo = false;
        
        Connection con = null;        
        con = ConectarBD.abrirConexao();
        ConsultaBD idProduto = new ConsultaBD(con);
        ConsultaBD idCliente = new ConsultaBD(con); 
                        
        String sql = "INSERT INTO itemlista\n" +
                     "(quantidade, preco, supermercado, comprado, datacompra, clienteid, produtoid, nome)\n" +
                     "VALUES(?, ?, ?, false, ?, ?, ?, ?);";
        try{
            for(int i = 0; i < lista.getItens().size(); i++){
                PreparedStatement ps = getCon().prepareStatement(sql);
                ps.setInt(1, lista.getItens().get(i).getQuantidade());
                ps.setDouble(2, lista.getItens().get(i).getValor());
                ps.setString(3, lista.getSupermercado());
                ps.setTimestamp(4, lista.getData());
                ps.setInt(5, idCliente.retornaIdUsuario(user));
                ps.setInt(6, idProduto.retornaIdProduto(lista.getItens().get(i).getProduto()));
                ps.setString(7, lista.getNomeLista());
                if(ps.executeUpdate() > 0){
                    boo = true;
                }
            }
            ConectarBD.fecharConexao(con);
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
