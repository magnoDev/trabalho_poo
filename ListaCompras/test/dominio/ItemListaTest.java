/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import dominio.produto.Produto;
import dominio.produto.ProdutoBaseTest;
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
 * @author david
 */
public class ItemListaTest {
    
    public ItemListaTest() {
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
     * Test of getPreco method, of class ItemLista.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        ItemLista instance = new ItemLista();
        double expResult = 0.0;
        double result = instance.getPreco();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPreco method, of class ItemLista.
     */
    @Test
    public void testSetPreco() {
        System.out.println("setPreco");
        double preco = 1.0;
        ItemLista instance = new ItemLista();
        try{
            instance.setPreco(preco);
            assertEquals(preco, instance.getPreco(), 0.0);
            // deve disparar excessão na linha abaixo
            instance.setPreco(0.0);
            // caso não dispare, falha o teste
            fail("Valores menores ou iguais a zero não devem ser aceitos");
        }catch(Exception ex){
            System.out.println("Disparei excessao");
            Logger.getLogger(ProdutoBaseTest.class.getName()).log(Level.SEVERE, null, ex);       
        }
    }

    /**
     * Test of getProduto method, of class ItemLista.
     */
    @Test
    public void testGetProduto() {
        System.out.println("getProduto");
        ItemLista instance = new ItemLista();
        Produto expResult = null;
        Produto result = instance.getProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProduto method, of class ItemLista.
     */
    @Test
    public void testSetProduto() {
        System.out.println("setProduto");
        Produto produto = null;
        ItemLista instance = new ItemLista();
        instance.setProduto(produto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class ItemLista.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        ItemLista instance = new ItemLista();
        int expResult = 0;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidade method, of class ItemLista.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        int quantidade = 0;
        ItemLista instance = new ItemLista();
        instance.setQuantidade(quantidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
