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
    
    public ItemLista(){
    
    }
    
    public void salvar(ItemLista item) throws IOException{ }  

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
