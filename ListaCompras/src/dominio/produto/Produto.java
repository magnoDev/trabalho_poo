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

    public Produto(String nome, String categoria, String tipo, double peso, 
            String marca, double valor, String dataValidade, String lote) throws Exception {
        super(nome, categoria, tipo, peso, marca);
        this.setValor(valor);
        this.setDataValidade(dataValidade);
        this.setLote(lote);
    }
    
    public Produto(String nome, String categoria, String tipo, String peso, 
            String marca, String valor, String dataValidade, String lote) throws Exception {
        super(nome, categoria, tipo, peso, marca);
        this.setValor(Double.parseDouble(valor));
        this.setDataValidade(dataValidade);
        this.setLote(lote);
    }
    
    public String toString(){
        String strProduto = super.toString();
        strProduto +=  ", " 
                + this.valor + ", "
                + this.dataValidade + ", "
                + this.lote;
        return strProduto;
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

    public void setValor(double valor) throws Exception {
        if(valor <= 0){
            throw new Exception("Valor não pode ser zero!");
        }
        this.valor = valor;
    }

    public void setDataValidade(String dataValidade) throws Exception {
        if(dataValidade.equals("")){
            throw new Exception("Data de validade não pode ser vazio!");
        }
        this.dataValidade = dataValidade;
    }

    public void setLote(String lote) throws Exception {
        if(lote.equals("")){
            throw new Exception("Lote não pode ser vazio!");
        }
        this.lote = lote;
    }
    
    
}
