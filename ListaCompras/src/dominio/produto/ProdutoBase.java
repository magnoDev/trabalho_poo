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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public ProdutoBase(String nome, String categoria, String tipo, double peso, String marca){
        this.nome = nome;
        this.categoria = categoria;
        this.tipo = tipo;
        this.peso = peso;
        this.marca= marca;
    }
    
    public ProdutoBase(String nome, String categoria, String tipo, String peso, String marca){
        this.nome = nome;
        this.categoria = categoria;
        this.tipo = tipo;
        this.peso = Double.parseDouble(peso);
        this.marca= marca;
    }
    
    public String toString(ProdutoBase produto){
        return produto.nome + "," 
                + produto.categoria + "," 
                + produto.tipo + "," 
                + produto.peso + ","
                + produto.marca;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    public String getMarca() {
        return marca;
    }
    
}