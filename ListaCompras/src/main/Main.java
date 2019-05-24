/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dominio.Cliente;
import dominio.ItemLista;
import dominio.ListaCompras;
import dominio.Localizacao;
import dominio.produto.Produto;
import dominio.produto.ProdutoBase;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.PersistenciaArquivo;

/**
 *
 * @author 20162BSI0236
 */
public class Main {
    
    public static void main(String[] args) throws IOException, Exception {
        String nome = JOptionPane.showInputDialog("Insira o nome do usuário");
        String email = JOptionPane.showInputDialog("Insira o email do usuário");
        String dataNascimento = JOptionPane.showInputDialog("Insira a data de nascimento do usuário");
        String estado = JOptionPane.showInputDialog("Insira o estado em que o usuário reside");
        String cidade = JOptionPane.showInputDialog("Insira a cidade em que o usuário reside");
        String senha = JOptionPane.showInputDialog("Insira a senha que o usuário deseja");

        PersistenciaArquivo dados = new PersistenciaArquivo();
        Localizacao localizadao = new Localizacao(estado, cidade);
        Cliente cliente = new Cliente(nome, email, dataNascimento, localizadao, senha);
        cliente.salvar(cliente);
        
        ListaCompras lista = new ListaCompras();
        lista.setCliente(cliente);
        lista.setNome_lista("lista 1");
        

        int continuar;
        do{
            String produtoNome = JOptionPane.showInputDialog("Dgite o nome do produto que deseja inserir na lista: ");
            String preco = JOptionPane.showInputDialog("Insira o preço do " + produtoNome);
            String dataValidade = JOptionPane.showInputDialog("Insira a data de validade do "+ produtoNome);
            String lote = JOptionPane.showInputDialog("Insira o lote do " + produtoNome);
            String categoria = JOptionPane.showInputDialog("Insira a categoira do " + produtoNome);
            String tipo = JOptionPane.showInputDialog("Insira o tipo do " + produtoNome);
            String peso = JOptionPane.showInputDialog("Insira o peso do " + produtoNome);
            String marca = JOptionPane.showInputDialog("Insira a marca do " + produtoNome);

            Produto produto;
            ItemLista item = new ItemLista();

            try {
                produto = new Produto(preco,dataValidade,lote, produtoNome, categoria, tipo, peso, marca);
                item.setProduto(produto);

            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de" + produtoNome));
            item.setQuantidade(quantidade);
            
            lista.adicionaItem(item);
            
            
            continuar = JOptionPane.showConfirmDialog(null, "Deseja adicionar outro item?");
        
        
        }while(continuar ==  JOptionPane.YES_OPTION);
        
        dados.salvar(lista);
        
        lista.imprimeLista();
    }
    
}
