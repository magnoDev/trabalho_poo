/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author magno
 */
public class ListaCompras implements Serializable {
    
    private String nomeLista;
    private Cliente cliente;
    private String supermercado;
    private final List<ItemLista> itens = new ArrayList<>();
    private Timestamp data;
    private double valorTotal = 0.0;
    
    public ListaCompras(){
     this.valorTotal = 0.0;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public List<ItemLista> getItens() {
        return itens;
    }

    public String getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(String supermercado) {
        this.supermercado = supermercado;
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

    private void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal;
    }
        
    public void adicionaItem(ItemLista item) throws Exception{
        
        try{
            this.itens.add(item);
            this.setValorTotal((this.valorTotal + ( item.getValor() )));
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
    public int getIndexItemLista(ItemLista item) throws Exception{
        
        String nomeItem = item.getProduto().getNome();
        String nomeItemNaLista;
        
        for(int indexItemLista = 0; indexItemLista < this.itens.size(); indexItemLista++){
            nomeItemNaLista = this.itens.get(indexItemLista).getProduto().getNome();
            if(nomeItem.equals(nomeItemNaLista)){
                return indexItemLista;
            }
        }
        
        throw new Exception("Item não encontrado");
        
    }
    
    public void removeItem(ItemLista item) throws Exception{
        
        try{
            this.itens.remove(getIndexItemLista(item));
            setValorTotal((getValorTotal()-( item.getValor() )));

        }
        catch(Exception ex){
            throw ex;
        }
    }    
}
