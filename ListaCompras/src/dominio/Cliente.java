/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.IOException;
import java.io.Serializable;
import persistencia.PersistenciaArquivo;


/**
 *
 * @author 20162bsi0236
 */
public class Cliente implements Serializable {
    String nome;
    String email;
    String login;
    String dataNascimento;
    Localizacao localizacao;
    String senha;

    public Cliente(String nome, String email, String dataNascimento, Localizacao localizacao, String senha) throws Exception {
        this.nome = nome;
        this.email = email;
        this.login = email;
        this.dataNascimento = dataNascimento;
        this.localizacao = localizacao;
        this.setSenha(senha);
    } 

    Cliente() {}
    
    public void salvar(Cliente cliente) throws IOException{
        PersistenciaArquivo persistencia = new PersistenciaArquivo();
        persistencia.salvar(cliente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        this.login = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
        this.email = login;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        if (senha.equals("")){
            throw new Exception("Senha não pode ser vazia");
        }else{
            this.senha = senha;
        }
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    
    
    
    
    
}

