package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class PersistenciaArquivo {

    private void salvar(String dados, String pathFile) {

        
        File file = new File(pathFile);
        try{
            // Se o arquivo nao existir, ele gera
            if (!file.exists()) {
                System.out.println("Criando arquivo");
                file.createNewFile();
            }
        FileWriter arq;
            arq = new FileWriter(file.getAbsoluteFile(), true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append( dados );        
            arq.close();  
            System.out.println("Arquivo gravado com sucesso!");
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