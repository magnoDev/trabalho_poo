/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import dominio.produto.Produto;
import java.io.IOException;
import java.io.Serializable;
import persistencia.PersistenciaArquivo;

/**
 *
 * @author magno
 */
public class ItemLista implements Serializable {
    private Produto produto;
    private int quantidade;
    
    private ItemLista(){
    
    }
    
    public void salvar(ItemLista item) throws IOException{
        PersistenciaArquivo persistencia = new PersistenciaArquivo();
        persistencia.salvar(item);
    }  

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
