/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import dominio.produto.Produto;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author magno
 */
public class ItemLista implements Serializable {
    private Produto produto;
    private int quantidade;
    private double preco;
    
    public ItemLista(){
    
        
    }

    public ItemLista(Produto produto, int quantidade, double preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws Exception {
        
        if (preco==0.0){
            throw new Exception("Preço não pode ser vazio");
        }else{
            this.preco = preco;
        }
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) throws Exception {
        
        if (!(produto instanceof Produto)){
            throw new Exception("Produto inválido");
        }else{
            this.produto = produto;
        }  
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) throws Exception {
        
        if (quantidade==0){
            throw new Exception("Quantidade não pode ser vazio");
        }else{
            this.quantidade = quantidade;
        }        
    }
}
