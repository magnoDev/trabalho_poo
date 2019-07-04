/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import dominio.produto.Produto;
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
public class ListaComprasTest {
    
    public ListaComprasTest() {
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
     * Test of getNomeLista method, of class ListaCompras.
     */
    @Test
    public void testGetNomeLista() {
        System.out.println("getNomeLista");
        ListaCompras instance = new ListaCompras();
        String expResult = "TestLista";
        try {
            instance.setNomeLista(expResult);
            String result = instance.getNomeLista();
            assertEquals(expResult, result);
        } catch (Exception ex) {
            Logger.getLogger(ListaComprasTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setNomeLista method, of class ListaCompras.
     */
    @Test
    public void testSetNomeLista(){
        System.out.println("setNomeLista");
        String nomeLista = "Lista";
        ListaCompras instance = new ListaCompras();
        try {
            instance.setNomeLista(nomeLista);
            
            // testando um valor invalido
            instance.setNomeLista("");
            // Se não disparar excessao falho o teste
            fail("Não deve aceitar nomes vazios");
        } catch (Exception ex) {
            Logger.getLogger(ListaComprasTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of getCliente method, of class ListaCompras.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        ListaCompras instance = new ListaCompras();
        Cliente expResult = new Cliente();
        try {
            instance.setCliente(expResult);
            Cliente result = instance.getCliente();
            assertEquals(expResult, result);
        } catch (Exception ex) {
            Logger.getLogger(ListaComprasTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Test of setCliente method, of class ListaCompras.
     */
    @Test
    public void testSetCliente(){
        System.out.println("setCliente");
        Cliente cliente;
        try {
            cliente = new Cliente("Gabeil", "gabibis@gmail.com", 1233);
            ListaCompras instance = new ListaCompras();
            instance.setCliente(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ListaComprasTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Test of getValorTotal method, of class ListaCompras.
     */
    @Test
    public void testGetValorTotal() {
        System.out.println("getValorTotal");
        try {
            ListaCompras lista = new ListaCompras();
            
            Produto produto1 = new Produto("produto1","categoria","tipo","1.0","marca","2.50","01/01/2019","1235");  
            ItemLista item1 = new ItemLista(produto1,1,Double.parseDouble("1.5"));
            lista.adicionaItem(item1);
            
            Produto produto2 = new Produto("produto2","categoria","tipo","1.0","marca","2.50","01/01/2019","1235");  
            ItemLista item2 = new ItemLista(produto2,1,Double.parseDouble("1.5"));
            lista.adicionaItem(item2);
            
            double result = lista.getValorTotal();
            double expResult = 3.0;
            assertEquals(expResult, result, 0.0);
        } catch (Exception ex) {
            System.out.println("Exeção >>>> " + ex);
            Logger.getLogger(ListaComprasTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Algo de errado não esta certo");
        }
    }

    /**
     * Test of adicionaItem method, of class ListaCompras.
     */
    @Test
    public void testAdicionaItem() {
        System.out.println("adicionaItem");
        
        try {
            Produto produto = new Produto("nomeProduto","categoria","tipo","1.0","marca","2.50","01/01/2019","1235");
            ItemLista item = new ItemLista(produto,10,Double.parseDouble("1.2"));
            ListaCompras instance = new ListaCompras();
            instance.adicionaItem(item);
        } catch (Exception ex) {
            Logger.getLogger(ListaComprasTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Algo de errado não está certo");
        }
    }

    /**
     * Test of getIndexItemLista method, of class ListaCompras.
     */
    @Test
    public void testGetIndexItemLista() {
        System.out.println("getIndexItemLista");
        try {
            ListaCompras lista = new ListaCompras();
            
            Produto produto1 = new Produto("produto1","categoria","tipo","1.0","marca","2.50","01/01/2019","1235");  
            ItemLista item1 = new ItemLista(produto1,10,Double.parseDouble("1.2"));
            lista.adicionaItem(item1);
            
            Produto produto2 = new Produto("produto2","categoria","tipo","1.0","marca","2.50","01/01/2019","1235");  
            ItemLista item2 = new ItemLista(produto2,10,Double.parseDouble("1.2"));
            lista.adicionaItem(item2);
            
            int result = lista.getIndexItemLista(item2);
            int expResult = 1;
            assertEquals(expResult, result);
        } catch (Exception ex) {
            System.out.println("Exeção >>>> " + ex);
            Logger.getLogger(ListaComprasTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Algo de errado não esta certo");
        }
        
    }

    /**
     * Test of removeItem method, of class ListaCompras.
     */
    @Test
    public void testRemoveItem(){
        System.out.println("removeItem");
        ItemLista item = new ItemLista();
        ListaCompras instance = new ListaCompras();
        
        try {
            instance.adicionaItem(item);
            instance.removeItem(item);
        } catch (Exception ex) {
            Logger.getLogger(ListaComprasTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
