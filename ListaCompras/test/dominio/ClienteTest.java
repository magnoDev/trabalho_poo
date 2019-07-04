/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {
    
    public ClienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     * Test of getNome method, of class Cliente.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        String nome = "David";
        Cliente instance = new Cliente();
        try {
            // Setando um nome valido
            instance.setNome(nome);
            assertEquals(nome, instance.getNome());
            // Setando um nome inválido
            instance.setNome("");
            fail("nome vazio.. NÃO PODE!!!");
        } catch (Exception ex) {
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setNome method, of class Cliente.
     */
    @Test
    public void testSetNome() throws Exception {
        System.out.println("setNome");
        try{
            String nome = "David";
            Cliente instance = new Cliente();
            instance.setNome(nome);
            assertEquals(nome, instance.getNome());
            
// Setando um nome inválido
            instance.setNome("");
            fail("nome vazio.. NÃO PODE!!!");
            
        }catch(Exception ex){
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of getEmail method, of class Cliente.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String email = "david@email.com";
        Cliente instance = new Cliente();
        try {
            // Setando um email valido
            instance.setEmail(email);
            assertEquals(email, instance.getEmail());
            // Setando um email inválido
            instance.setEmail("");
            fail("email vazio.. NÃO PODE!!!");
        } catch (Exception ex) {
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setEmail method, of class Cliente.
     */
    @Test
    public void testSetEmail() throws Exception {
        System.out.println("setEmail");
        String email = "david@email.com";
        Cliente instance = new Cliente();
        try {
            // Setando um email valido
            instance.setEmail(email);
            assertEquals(email, instance.getEmail());
            // Setando um email inválido
            instance.setEmail("");
            fail("email vazio.. NÃO PODE!!!");
        } catch (Exception ex) {
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of getLogin method, of class Cliente.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        String login = "david";
        Cliente instance = new Cliente();
        try {
            instance.setLogin(login);
            assertEquals(login, instance.getLogin());
            instance.setLogin("");
            fail("Login vazio... NÃO PODE!!!");
        } catch (Exception ex) {
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of getSenha method, of class Cliente.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        int senha = 123456;
        Cliente instance = new Cliente();
        try {
            // Setando um email valido
            instance.setSenha(senha);
            assertEquals(senha, instance.getSenha());
            // Setando um email inválido
            instance.setSenha(0);
            fail("Senha vazia?!? NÃO PODE!!!");
        } catch (Exception ex) {
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setSenha method, of class Cliente.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        int senha = 123;
        Cliente instance = new Cliente();
        try {
            instance.setSenha(senha);
            assertEquals(senha, instance.getSenha());
            instance.setSenha(0);
            fail("Senha vazia.. NÃO PODE!!!");
        } catch (Exception ex) {
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
