/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.produto;

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

    /**
     * Test of toString method, of class ProdutoBase.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ProdutoBase produto = null;
        ProdutoBase instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class ProdutoBase.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        ProdutoBase instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class ProdutoBase.
     */
    @Test
    public void testSetNome() throws Exception {
        System.out.println("setNome");
        String nome = "";
        ProdutoBase instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoria method, of class ProdutoBase.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        ProdutoBase instance = null;
        String expResult = "";
        String result = instance.getCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoria method, of class ProdutoBase.
     */
    @Test
    public void testSetCategoria() throws Exception {
        System.out.println("setCategoria");
        String categoria = "";
        ProdutoBase instance = null;
        instance.setCategoria(categoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class ProdutoBase.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        ProdutoBase instance = null;
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
