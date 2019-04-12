/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.produto;

import java.io.Serializable;

/**
 *
 * @author david
 */
public class Produto extends ProdutoBase implements Serializable{
    private double valor;
    private String dataValidade;
    private String lote;

    public Produto(double valor, String dataValidade, String lote, String nome, 
            String categoria, String tipo, double peso, String marca) {
        super(nome, categoria, tipo, peso, marca);
        this.valor = valor;
        this.dataValidade = dataValidade;
        this.lote = lote;
    }
    
    public Produto(String valor, String dataValidade, String lote, String nome, 
            String categoria, String tipo, String peso, String marca) {
        super(nome, categoria, tipo, peso, marca);
        this.valor = Double.parseDouble(valor);
        this.dataValidade = dataValidade;
        this.lote = lote;
    }
    
    public String toString(Produto produto){
        return produto.toString() + "," 
                + produto.valor + ","
                + produto.dataValidade + ","
                + produto.lote;
    }

    public double getValor() {
        return valor;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public String getLote() {
        return lote;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
    
    
}
