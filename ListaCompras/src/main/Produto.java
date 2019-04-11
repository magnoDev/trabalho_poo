/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author david
 */
public class Produto {
    String nome;
    String categoria;
    String tipo;
    String peso;
    String marca;

    public Produto(String nome, String categoria, String tipo, String peso, String marca) {
        this.nome = nome;
        this.categoria = categoria;
        this.tipo = tipo;
        this.peso = peso;
        this.marca = marca;
    }
    
}
