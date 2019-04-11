/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 20162bsi0236
 */
public class PersistenciaArquivo {
    
    public void salvar(String dados, String urlArquivo){
        FileWriter arq;
            try {
                arq = new FileWriter(urlArquivo, true);        
                PrintWriter gravarArq = new PrintWriter(arq);
                gravarArq.append( dados + "\n");        
                arq.close();   
            } catch (IOException ex) {
                Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void LerArquivo(String pathFile){
        // Le o arquivo
        try{
            FileReader ler = new FileReader(pathFile);
            BufferedReader reader = new BufferedReader(ler);  
            String linha;
            while( (linha = reader.readLine()) != null ){
                System.out.println(linha);
            }
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
