package util;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JsonFile {
    
    private final String FOLDER = "db"; 
    private final String FILE = "/persona.json";
    
    public boolean crearCarpeta(){
        
        File folder = new File(FOLDER);
        
        if (folder.exists()){
            return true;
        } 
        return folder.mkdir();
    }
    
    
    public boolean crearArchivo(){
        File file = new File (FOLDER + FILE);
        if (file.exists()){
            return true;
        }
        
        try {
            return file.createNewFile();
        } catch (IOException ex) {
            System.out.println("Error -> " + ex.getMessage());
            return false;
        }
    }
    
    public void saveData(){
        try{
            RandomAccessFile rf = new RandomAccessFile(FOLDER + FILE, "rw"); //Las comillas le indican cual de los 3 permisos R, W o X
            long leght = rf.length(); //longitud del archivo
            rf.seek(leght - 1); //Se ubica en la posicion indicada 
            
            
            if(leght > 2){
                rf.writeBytes(",");
            }
        } catch(Exception e){
            
        }
    }
}
