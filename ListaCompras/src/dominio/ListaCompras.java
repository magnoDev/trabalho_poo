/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author magno
 */
public class ListaCompras implements Serializable {
    
    private String nomeLista;
    private Cliente cliente;
    private final List<ItemLista> itens = new ArrayList<>();
    private double valorTotal = 0.0;
    
    public ListaCompras(){
    
    }
    
    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) throws Exception {
        
        if (nomeLista.equals("")){
            throw new Exception("Nome da lista não pode ser vazio");
        }else{
            this.nomeLista = nomeLista;
        }
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) throws Exception {
        
        if (!(cliente instanceof Cliente)){
            throw new Exception("Cliente inválido");
        }else{
            this.cliente = cliente;
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) throws Exception {
        
        if (valorTotal==0.0){
            throw new Exception("Valor total não pode ser zero");
        }else{
            this.valorTotal = valorTotal;
        }
    }
        
    public void adicionaItem(ItemLista item) throws Exception{
        
        try{
            this.itens.add(item);
            setValorTotal((getValorTotal()+(item.getQuantidade() * item.getProduto().getValor())));
        }
        catch(Exception ex){
            throw ex;
        }
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
    
    public void removeItem(ItemLista item) throws Exception{
        
        try{
            this.itens.remove(getIndexItemLista(item));
            setValorTotal((getValorTotal()-(item.getQuantidade() * item.getProduto().getValor())));

        }
        catch(Exception ex){
            throw ex;
        }
    }
        
    
    public void imprimeLista(){
    
        Iterator lista = this.itens.iterator();
        
        while(lista.hasNext()){
            System.out.println(lista.next());
        }
        
        System.out.println(this.valorTotal);
        
    }
    
}
