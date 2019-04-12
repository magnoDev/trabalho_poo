/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author magno
 */
public class ListaCompras {
    
    private String nome_lista;
    private Cliente cliente;
    private final List<ItemLista> itens = new ArrayList<>();
    private double valorTotal = 0.0;
    
    public ListaCompras(){
    
    }
    
    public String getNome_lista() {
        return nome_lista;
    }

    public void setNome_lista(String nome_lista) {
        this.nome_lista = nome_lista;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
        
    public void adicionaItem(ItemLista item){
        itens.add(item);
        setValorTotal((getValorTotal()+(item.getQuantidade() * item.getProduto().getValor())));
    }
    
    public int getIndexItemLista(ItemLista item){
        
        int indexItemLista = 0;
        String nomeItem = item.getProduto().getNome();
        String nomeItemNaLista = this.itens.get(indexItemLista).getProduto().getNome();
        
        while(!nomeItem.equals(nomeItemNaLista) || indexItemLista < this.itens.size()){
            indexItemLista++;
            nomeItemNaLista = this.itens.get(indexItemLista).getProduto().getNome();
        }
        
        return indexItemLista;
        
    }
    
    public void removeItem(ItemLista item){
        itens.remove(getIndexItemLista(item));
        setValorTotal((getValorTotal()-(item.getQuantidade() * item.getProduto().getValor())));
    }
    
}
