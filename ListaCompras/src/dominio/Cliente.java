/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.IOException;
import java.io.Serializable;


/**
 *
 * @author 20162bsi0236
 */
public class Cliente implements Serializable {
    String nome;
    String email;
    String login;
    int senha;

    public Cliente(String nome, String email, int senha) throws Exception {
        this.setNome(nome);
        this.setEmail(email);
        this.setSenha(senha);
    } 


    public Cliente() {}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.equals("")){
            throw new Exception("Nome não pode ser vazio");
        }else{
            this.nome = nome;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if (email.equals("")){
            throw new Exception("Email não pode ser vazi0");
        }else{        
            this.email = email;
            this.login = email;
        }
    }

    public String getLogin() {
        return login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) throws Exception {
        if (senha == 0){
            throw new Exception("Senha não pode ser vazia");
        }else{
            this.senha = senha;
        }
    }  
       
}

