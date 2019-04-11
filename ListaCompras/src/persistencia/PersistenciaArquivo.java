/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author 20162bsi0236
 */
public class PersistenciaArquivo {
    
    public void salvar(Object objeto, String nomeArquivo) throws FileNotFoundException, IOException{
        
//        SALVA EM FORMATO DE TEXTO
//        FileWriter arq;
//            try {
//                arq = new FileWriter(urlArquivo, true);        
//                PrintWriter gravarArq = new PrintWriter(arq);
//                gravarArq.append( dados + "\n");        
//                arq.close();   
//            } catch (IOException ex) {
//                Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
//            }
        
        
        
        ObjectOutputStream objectOut;			
        objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(nomeArquivo)));
        objectOut.writeObject(objeto);
        objectOut.close();

    }
    
    public void LerArquivo(String pathFile, Object objeto,String nomeArquivo ) throws FileNotFoundException, IOException{
        /*try{
        FileReader ler = new FileReader(pathFile);
        BufferedReader reader = new BufferedReader(ler);
        String linha;
        while( (linha = reader.readLine()) != null ){
        System.out.println(linha);
        }
        } catch (IOException ex) {
        Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }*/
                
    }
    
}
