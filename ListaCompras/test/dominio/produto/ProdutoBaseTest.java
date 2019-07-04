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
    Double peso = 1.2;
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
            System.out.println("testSetCategoria");
            
            // testando uma categoria valida
            String categoria = "testCategoria";
            ProdutoBase instance = this.deafultBaseProduct();
            // não deve disparar exceção
            instance.setCategoria(categoria);
            String expResult = categoria;
            String result = instance.getCategoria();
            // comparando se a categoria setada foi realmente salva
            assertEquals(expResult, result);
            
            // testando uma categoria invalida
            categoria = "";
            // deve disparar exceção
            instance.setCategoria(categoria);
            // se não disparar eu falho o teste
            fail("Método não deve permitir que a categoria seja vazia");
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
        try {            
            // testando um tipo valido
            String tipo = "tipo";
            ProdutoBase instance = this.deafultBaseProduct();
            // não deve disparar exceção
            instance.setTipo(tipo);
            String expResult = tipo;
            String result = instance.getTipo();
            // comparando se o tipo foi realmente salvo
            assertEquals(expResult, result);
            
            // testando um tipo invalido
            tipo = "";
            // deve disparar exceção
            instance.setTipo(tipo);
            // se não disparar eu falho o teste
            fail("Método não deve permitir que o tipo seja vazio");
        } catch (Exception ex) {
            Logger.getLogger(ProdutoBaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of getPeso method, of class ProdutoBase.
     */
    @Test
    public void testGetPeso() {
        System.out.println("getPeso");
        ProdutoBase instance = this.deafultBaseProduct();
        double expResult = this.peso;
        double result = instance.getPeso();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPeso method, of class ProdutoBase.
     */
    @Test
    public void testSetPeso() throws Exception {
        System.out.println("setPeso");
        try {            
            // testando um peso valido
            Double peso = 1.0;
            ProdutoBase instance = this.deafultBaseProduct();
            // não deve disparar exceção
            instance.setPeso(peso);
            Double expResult = peso;
            Double result = instance.getPeso();
            // comparando se o peso foi realmente salvo
            assertEquals(expResult, result);
            
            // testando um peso invalido
            peso = 0.0;
            // deve disparar exceção
            instance.setPeso(peso);
            // se não disparar eu falho o teste
            fail("Método não deve permitir que o peso seja igual a zero");
        } catch (Exception ex) {
            Logger.getLogger(ProdutoBaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of getMarca method, of class ProdutoBase.
     */
    @Test
    public void testGetMarca() {
        System.out.println("############### getMarca ###################3");
        ProdutoBase instance = this.deafultBaseProduct();
        String expResult = this.marca;
        String result = instance.getMarca();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMarca method, of class ProdutoBase.
     */
    @Test
    public void testSetMarca() throws Exception {
        System.out.println("setMarca");
        try {            
            // testando uma marca valida
            String marca = "marca";
            ProdutoBase instance = this.deafultBaseProduct();
            // não deve disparar exceção
            instance.setMarca(marca);
            String expResult = marca;
            String result = instance.getMarca();
            // comparando se a marca foi realmente salva
            assertEquals(expResult, result);
            
            // testando uma marca invalida
            marca = "";
            // deve disparar exceção
            instance.setMarca(marca);
            // se não disparar eu falho o teste
            fail("Método não deve permitir que a marca seja vazia");
        } catch (Exception ex) {
            Logger.getLogger(ProdutoBaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
