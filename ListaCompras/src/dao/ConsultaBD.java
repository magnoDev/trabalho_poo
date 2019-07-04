/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import dominio.*;
import dominio.produto.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public List<ListaCompras> retornaListasByCliente(Cliente cliente){
        Connection con = null;        
        con = ConectarBD.abrirConexao();
        List<ListaCompras> listasCompras = new ArrayList<>();
        
        String sql = "SELECT DISTINCT nome, datacompra, supermercado "
                + " FROM itemlista "
                + " WHERE clienteid = ? ";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, this.retornaIdUsuario(cliente));
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                ListaCompras lista = new ListaCompras();
                try {
                    lista.setCliente(cliente);
                    lista.setNomeLista(rs.getString(1));
                    lista.setData(rs.getTimestamp(2));
                    lista.setSupermercado(rs.getString(3));
                    listasCompras.add(lista);
                } catch (Exception ex) {
                    Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            rs.close();
            ConectarBD.fecharConexao(con);
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
        return listasCompras;
        
    }
    
    public List<ItemLista> retornaItensLista(ListaCompras lista){
        Connection con = null;        
        con = ConectarBD.abrirConexao();
        List<ItemLista> itensLista = new ArrayList<>();
        
        String sql = "SELECT * FROM itemlista " +
                    "JOIN produto ON itemlista.produtoid = produto.id " +
                    "WHERE clienteid = ? AND datacompra::date = date(?) " +
                    "AND supermercado = ? AND itemlista.nome = ?";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, this.retornaIdUsuario(lista.getCliente()));
            ps.setString(2, lista.getData().toString());
            ps.setString(3, lista.getSupermercado());
            ps.setString(4, lista.getNomeLista());

            ResultSet rs = ps.executeQuery();
            System.out.println("TESTEE");
                    
            while(rs.next()){
                try {
                    Produto produto = new Produto();
                    produto.setNome(rs.getString(11));
                    produto.setValor(rs.getDouble(12));
                    ItemLista item = new ItemLista(produto, rs.getInt(2), rs.getDouble(12));
                
                    itensLista.add(item);
                    
                } catch (Exception ex) {
                    Logger.getLogger(ConsultaBD.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            rs.close();
            ConectarBD.fecharConexao(con);
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
        return itensLista;
    }
}
