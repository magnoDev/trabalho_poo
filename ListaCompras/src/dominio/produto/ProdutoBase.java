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
public class ProdutoBase implements Serializable{
    private String nome;
    private String categoria;
    private String tipo;
    private double peso;
    private String marca;
    
    public ProdutoBase(String nome, String categoria, String tipo, double peso, String marca) throws Exception{
        this.setNome(nome);
        this.setCategoria(categoria);
        this.setTipo(tipo);
        this.setPeso(peso);
        this.setMarca(marca);
    }
    
    public ProdutoBase(String nome, String categoria, String tipo, String peso, String marca) throws Exception{
        
        this.setNome(nome);
        this.setCategoria(categoria);
        this.setTipo(tipo);
        this.setPeso(Double.parseDouble(peso));
        this.setMarca(marca);

    }
    
    public String toString(){
        return this.nome + ", " 
                + this.categoria + ", " 
                + this.tipo + ", " 
                + this.peso + ", "
                + this.marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.equals("")){
            throw new Exception("Nome não pode ser vazio!");
        }
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) throws Exception {
        if(categoria.equals("")){
            throw new Exception("Categoria não pode ser vazio!");
        }
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) throws Exception {
        if(tipo.equals("")){
            throw new Exception("Tipo não pode ser vazio!");
        }
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws Exception {
        if(peso == 0){
            throw new Exception("Peso deve ser maior que zero!");
        }
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) throws Exception {
        if(marca.equals("")){
            throw new Exception("Marca não pode ser vazio!");
        }
        this.marca = marca;
    }
    
}