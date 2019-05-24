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

/**
 *
 * @author magno
 */
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

    /**
     * Test of salvar method, of class Cliente.
     */
    @Test
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        Cliente cliente = null;
        Cliente instance = null;
        instance.salvar(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Cliente.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Cliente instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Cliente.
     */
    @Test
    public void testSetNome() throws Exception {
        System.out.println("setNome");
        String nome = "";
        Cliente instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Cliente.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Cliente instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Cliente.
     */
    @Test
    public void testSetEmail() throws Exception {
        System.out.println("setEmail");
        String email = "";
        Cliente instance = null;
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class Cliente.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Cliente instance = null;
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocalizacao method, of class Cliente.
     */
    @Test
    public void testGetLocalizacao() {
        System.out.println("getLocalizacao");
        Cliente instance = null;
        Localizacao expResult = null;
        Localizacao result = instance.getLocalizacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocalizacao method, of class Cliente.
     */
    @Test
    public void testSetLocalizacao() throws Exception {
        System.out.println("setLocalizacao");
        Localizacao localizacao = null;
        Cliente instance = null;
        instance.setLocalizacao(localizacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class Cliente.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Cliente instance = null;
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class Cliente.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "123";
        Cliente instance = new Cliente();
        try {
            instance.setSenha(senha);
            assertEquals(senha, instance.getSenha());
            instance.setSenha("");
            fail("Senha vazia.. NÃO PODE!!!");
        } catch (Exception ex) {
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of getDataNascimento method, of class Cliente.
     */
    @Test
    public void testGetDataNascimento() {
        System.out.println("getDataNascimento");
        Cliente instance = null;
        String expResult = "";
        String result = instance.getDataNascimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of setDataNascimento method, of class Cliente.
     */
    
    @Test
    public void testSetDataNascimento(){
        System.out.println("setDataNascimento");
        String dataNascimento = "30/08/89";
        Cliente instance = new Cliente();
        try {
            instance.setDataNascimento(dataNascimento);
            assertEquals(dataNascimento, instance.getDataNascimento());
            instance.setDataNascimento("");
            fail("Data de Nascimento vazia... NÃO PODE!!!");
        
        } catch (Exception ex){
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
