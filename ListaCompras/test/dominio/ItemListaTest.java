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
        double expResult = 5.0;
        try {
            instance.setValor(expResult);
            double result = instance.getValor();
            assertEquals(expResult, result, 0.0);
        } catch (Exception ex) {
            Logger.getLogger(ItemListaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            instance.setValor(preco);
            assertEquals(preco, instance.getValor(), 0.0);
            // deve disparar excessão na linha abaixo
            instance.setValor(0.0);
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
        Produto produto = new Produto();
        try {
            instance.setProduto(produto);
            assertEquals(produto, instance.getProduto());
            
            // passando um parametro invalido
            instance.setProduto(null);
            fail("Produto deve aceitar somente objetos do tipo Produto");
        } catch (Exception ex) {
            Logger.getLogger(ItemListaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Test of setProduto method, of class ItemLista.
     */
    @Test
    public void testSetProduto() {
        System.out.println("setProduto");
        Produto produto = new Produto();
        ItemLista instance = new ItemLista();
        try {
            instance.setProduto(produto);
        } catch (Exception ex) {
            Logger.getLogger(ItemListaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of getQuantidade method, of class ItemLista.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        ItemLista instance = new ItemLista();
        int expResult = 2;
        try {
            instance.setQuantidade(expResult);
            int result = instance.getQuantidade();
            assertEquals(expResult, result);
        } catch (Exception ex) {
            Logger.getLogger(ItemListaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setQuantidade method, of class ItemLista.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        int quantidade = 1;
        ItemLista instance = new ItemLista();
        try {
            instance.setQuantidade(quantidade);
            
            instance.setQuantidade(0);
            fail("Quantidade não pode ser zero");
        } catch (Exception ex) {
            Logger.getLogger(ItemListaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
