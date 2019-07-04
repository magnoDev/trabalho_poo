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
public class ProdutoTest {
    
    String nome = "nome";
    String categoria = "categoria";
    String tipo = "tipo";
    String peso = "1.2";
    String marca = "marca";
    String valor = "1.5";
    String validade = "validade";
    String lote = "lote";
    
    public ProdutoTest() {
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
    
    private Produto deafultProduct(){
        try{
            Produto produto = new Produto(
                    this.nome, 
                    this.categoria, 
                    this.tipo, 
                    this.peso, 
                    this.marca, 
                    this.valor, 
                    this.validade, 
                    this.lote
            );
            return produto;
        }catch(Exception ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }

    /**
     * Test of toString method, of class Produto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
        Produto produto = this.deafultProduct();
        String expResult = this.nome + ", " 
                + this.categoria + ", " 
                + this.tipo + ", " 
                + this.peso + ", " 
                + this.marca + ", " 
                + this.valor + ", " 
                + this.validade + ", " 
                + this.lote;
        String result = produto.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValor method, of class Produto.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Produto instance = this.deafultProduct();
        double expResult = Double.parseDouble(this.valor);
        double result = instance.getValor();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getDataValidade method, of class Produto.
     */
    @Test
    public void testGetDataValidade() {
        System.out.println("getDataValidade");
        Produto instance = this.deafultProduct();
        String expResult = this.validade;
        String result = instance.getDataValidade();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLote method, of class Produto.
     */
    @Test
    public void testGetLote() {
        System.out.println("getLote");
        Produto instance = this.deafultProduct();
        String expResult = this.lote;
        String result = instance.getLote();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setValor method, of class Produto.
     */
    @Test
    public void testSetValor() {
            System.out.println("setValor");
            double valor = 1.0;
            Produto instance = this.deafultProduct();
        try{
            instance.setValor(valor);
            assertEquals(valor, instance.getValor(), 0.0);
            // deve disparar excessão na linha abaixo
            instance.setValor(0.0);
            instance.setValor(-1.0);
            // caso não dispare, falha o teste
            fail("Valores menores ou iguais a zero não devem ser aceitos");
        }catch(Exception ex){
            System.out.println("Disparei excessao");
            Logger.getLogger(ProdutoBaseTest.class.getName()).log(Level.SEVERE, null, ex);       
        }
    }

    /**
     * Test of setDataValidade method, of class Produto.
     */
    @Test
    public void testSetDataValidade() throws Exception {
        System.out.println("setDataValidade");
        String dataValidade = "02/03/2019";
        Produto instance = this.deafultProduct();
        instance.setDataValidade(dataValidade);
        assertEquals(instance.getDataValidade(), dataValidade);
    }

    /**
     * Test of setLote method, of class Produto.
     */
    @Test
    public void testSetLote() throws Exception {
        System.out.println("setLote");
        String lote = "1234";
        Produto instance = this.deafultProduct();
        instance.setLote(lote);
        assertEquals(instance.getLote(), lote);
    }
    
}
