/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;


/**
 *
 * @author 20162bsi0236
 */
public class Cliente {
    String nome;
    String email;
    String login;
    String dataNascimento;
    Localizacao localizacao;
    String senha;

    public Cliente(String nome, String email, String dataNascimento, Localizacao localizacao, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = email;
        this.dataNascimento = dataNascimento;
        this.localizacao = localizacao;
        this.senha = senha;
    } 
    
    public void salvar(){
        System.out.println(this.nome);
    }
    
}

