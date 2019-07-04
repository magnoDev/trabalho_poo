/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.produto;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Main;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class ProdutoBaseTest {
    
    String nome = "nome";
    String categoria = "categoria";
    String tipo = "tipo";
    String peso = "1.2";
    String marca = "marca";
    
    public ProdutoBaseTest() {
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
    
    private ProdutoBase deafultBaseProduct(){
        try{
            ProdutoBase produtoBase = new ProdutoBase(
                this.nome, 
                this.categoria, 
                this.tipo, 
                this.peso, 
                this.marca
            );
            return produtoBase;
        }catch(Exception ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }

    /**
     * Test of toString method, of class ProdutoBase.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ProdutoBase instance = this.deafultBaseProduct();
        String expResult = this.nome + ", " 
                + this.categoria + ", " 
                + this.tipo + ", " 
                + this.peso + ", " 
                + this.marca;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNome method, of class ProdutoBase.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        ProdutoBase instance = this.deafultBaseProduct();
        String expResult = this.nome;
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class ProdutoBase.
     */
    @Test
    public void testSetNome(){
        try {
            System.out.println("setNome");
            String nome = "testSetNome";
            ProdutoBase instance = this.deafultBaseProduct();
            instance.setNome(nome);
            String expResult = nome;
            String result = instance.getNome();
            assertEquals(expResult, result);
            
            nome = "";
            instance.setNome(nome);
            fail("Método não deve permitir que o nome seja vazio");
        } catch (Exception ex) {
            Logger.getLogger(ProdutoBaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Test of getCategoria method, of class ProdutoBase.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        ProdutoBase instance = this.deafultBaseProduct();
        String expResult = this.categoria;
        String result = instance.getCategoria();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCategoria method, of class ProdutoBase.
     */
    @Test
    public void testSetCategoria(){
        try {
            System.out.println("setNome");
            String categoria = "testCategoria";
            ProdutoBase instance = this.deafultBaseProduct();
            instance.setCategoria(categoria);
            String expResult = categoria;
            String result = instance.getNome();
            assertEquals(expResult, result);
            
            nome = "";
            instance.setNome(nome);
            fail("Método não deve permitir que o nome seja vazio");
        } catch (Exception ex) {
            Logger.getLogger(ProdutoBaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of getTipo method, of class ProdutoBase.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        ProdutoBase instance = this.deafultBaseProduct();
        String expResult = this.tipo;
        String result = instance.getTipo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipo method, of class ProdutoBase.
     */
    @Test
    public void testSetTipo() throws Exception {
        System.out.println("setTipo");
        String tipo = "";
        ProdutoBase instance = null;
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeso method, of class ProdutoBase.
     */
    @Test
    public void testGetPeso() {
        System.out.println("getPeso");
        ProdutoBase instance = null;
        double expResult = 0.0;
        double result = instance.getPeso();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPeso method, of class ProdutoBase.
     */
    @Test
    public void testSetPeso() throws Exception {
        System.out.println("setPeso");
        double peso = 0.0;
        ProdutoBase instance = null;
        instance.setPeso(peso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarca method, of class ProdutoBase.
     */
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        ProdutoBase instance = null;
        String expResult = "";
        String result = instance.getMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarca method, of class ProdutoBase.
     */
    @Test
    public void testSetMarca() throws Exception {
        System.out.println("setMarca");
        String marca = "";
        ProdutoBase instance = null;
        instance.setMarca(marca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
