/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;

/**
 *
 * @author 20162bsi0236
 */
public class Localizacao implements Serializable{
    String estado;
    String cidade;

    public Localizacao(String estado, String cidade) {
        this.estado = estado;
        this.cidade = cidade;
    }
    
    
}
