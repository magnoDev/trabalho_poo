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
import javax.swing.JOptionPane;

/**
 *
 * @author 20162bsi0236
 */
public class PersistenciaArquivo {
    
    public void salvar(Object objeto) throws FileNotFoundException, IOException{
        
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
        
        ObjectOutputStream objectOut = null;
        try{
            objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("dados.txt")));
            objectOut.writeObject(objeto);
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Erro na localização do arquivo"  + "/nErro gerado:"+ e.getMessage(), "Erro - Não encontrado", JOptionPane.ERROR_MESSAGE);
            objectOut = new ObjectOutputStream(null);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e, "Erro ao acessar o arquivo" + "/nErro gerado:"+ e.getMessage(), JOptionPane.ERROR_MESSAGE);
        } 
        finally{
            objectOut.close();
        }

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
