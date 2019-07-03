/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.*;

/**
 *
 * @author magno
 */
public class ConectarBD {
    
        public static Connection abrirConexao(){
        Connection con = null;
        
        try{
            Class.forName("org.postgresql.Driver").newInstance();
            String url = "jdbc:postgresql://motty.db.elephantsql.com:5432/dbrpmtde";
            String user = "dbrpmtde";
            String pwd = "19QDp-EScuYpb-leGYNwUXwjDGkQ6RI4";
            
            con = DriverManager.getConnection(url, user, pwd);
            System.out.println("Conexão feita com sucesso!");
            
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
                        
        return con;
    }
    
    public static void fecharConexao(Connection con){
        try{
            con.close();
            System.out.println("Operação realizada com sucesso!");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }       
      
    }
    
}
