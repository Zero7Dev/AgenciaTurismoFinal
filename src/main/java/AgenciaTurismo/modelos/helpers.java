//autor: Coloma Vera Julio 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgenciaTurismo.modelos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class helpers {
    public void CerrarWriters(FileWriter fw,BufferedWriter bw){
        
        try{
            if(fw!=null){
            fw.close();
        }
            if(bw!=null){
                bw.close();
            }
            
        }catch(IOException E){
            E.getMessage();
        }
        
    }
    public void CerrarReaders(FileReader fr,BufferedReader br){
        
        try{
            if(fr!=null){
            fr.close();
        }
            if(br!=null){
                br.close();
            }
            
        }catch(IOException E){
            E.getMessage();
        }
         
    }
}