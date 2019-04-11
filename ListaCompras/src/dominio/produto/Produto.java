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
public class Produto extends ProdutoBase implements Serializable{
    private double valor;
    private String dataValidade;
    private String lote;
}
