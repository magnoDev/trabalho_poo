/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

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
     * Test of getNome_lista method, of class ListaCompras.
     */
    @Test
    public void testGetNome_lista() {
        System.out.println("getNome_lista");
        ListaCompras instance = new ListaCompras();
        String expResult = "";
        String result = instance.getNomeLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome_lista method, of class ListaCompras.
     */
    @Test
    public void testSetNome_lista() {
        System.out.println("setNome_lista");
        String nome_lista = "";
        ListaCompras instance = new ListaCompras();
        instance.ssetNomeListanome_lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class ListaCompras.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        ListaCompras instance = new ListaCompras();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class ListaCompras.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        ListaCompras instance = new ListaCompras();
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorTotal method, of class ListaCompras.
     */
    @Test
    public void testGetValorTotal() {
        System.out.println("getValorTotal");
        ListaCompras instance = new ListaCompras();
        double expResult = 0.0;
        double result = instance.getValorTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorTotal method, of class ListaCompras.
     */
    @Test
    public void testSetValorTotal() {
        System.out.println("setValorTotal");
        double valorTotal = 0.0;
        ListaCompras instance = new ListaCompras();
        instance.setValorTotal(valorTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionaItem method, of class ListaCompras.
     */
    @Test
    public void testAdicionaItem() {
        System.out.println("adicionaItem");
        ItemLista item = null;
        ListaCompras instance = new ListaCompras();
        instance.adicionaItem(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndexItemLista method, of class ListaCompras.
     */
    @Test
    public void testGetIndexItemLista() {
        System.out.println("getIndexItemLista");
        ItemLista item = null;
        ListaCompras instance = new ListaCompras();
        int expResult = 0;
        int result = instance.getIndexItemLista(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeItem method, of class ListaCompras.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        ItemLista item = null;
        ListaCompras instance = new ListaCompras();
        instance.removeItem(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimeLista method, of class ListaCompras.
     */
    @Test
    public void testImprimeLista() {
        System.out.println("imprimeLista");
        ListaCompras instance = new ListaCompras();
        instance.imprimeLista();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
