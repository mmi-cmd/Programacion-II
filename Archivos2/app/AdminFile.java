package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AdminFile { 

    private static final String ROUTE = "Conversacion/"; //ruta general para todos los archivos

    public static boolean createFolder(String name){ //funcion que crea una SOLA carpeta

        File folder = new File(ROUTE + name); //la crea en la ruta actual
        return folder.mkdir();
    }

    public static boolean createFolders(String name){ //funcion que crea una varias carpeta

        File folder = new File(ROUTE + name); //la crea en la ruta actual
        return folder.mkdirs();
    }


    public static boolean createFile(String name){ //funcion que crea un archivo  --> Envio direccion + nombre
        File file = new File (ROUTE + name);

        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean writeFile(String name, String texto, boolean sobreescritura){ //funcion que escribe en un archivo  --> Envio direccion + nombre
        try (FileWriter writer = new FileWriter(ROUTE + name)) { //Escribe directamente sobre el disco
        
        writer.append(texto + "\n");
        writer.close();
        
        } catch (IOException e) {
            return false;
        }
        return true;
    }


    public static boolean writeFileBuffer(String name, String texto, boolean sobreescritura){

        try {
            BufferedWriter buffer = new BufferedWriter(
                new FileWriter(ROUTE + name, sobreescritura)
            );

            buffer.write(texto);
            buffer.newLine();
            buffer.close(); 

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } 

        return true;
    }

    public static void readFile (String name){ //leer por caracteres
        
        try (FileReader fr = new FileReader(ROUTE + name)) {
            int character;

            while (
                (character = fr.read()) != -1 //asigno un valor a character y lo comparo con -1, usa -1 para saber si ya no hay nada que leer
            ){
                System.out.print((char)character); //imprimo el caracter que estoy leyendo, se hace transformacion de tipo entero a caracter
            }

        } catch (Exception e) { //Hago la exception general que me captura las dos excepciones posibles 
        }
    }
    
    public static void readFileBuffer (String name){
        try (BufferedReader br = new BufferedReader(new FileReader(ROUTE + name))) {

            String line;
            while ((line = br.readLine()) != null) { //lee la linea y la compara con null, si no es null sigue leyendo
                System.out.print(line); //imprimo la linea que estoy leyendo
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void deleteFile(String name){
        File file = new File(ROUTE + name);
        System.out.println(file.delete());
    }


    public static void deleteFolders(String patch){
        File file = new File(ROUTE + patch);

        if (file.exists()) {
            File[] directory = file.listFiles(); //saca una lista de los archivos que hay dentro de las carpetas
            if (directory != null) {
                
                for (File files : directory) {
                    if (file.isDirectory()) {
                        deleteFolders(files.getAbsolutePath()); //recursividad
                    } else{
                        files.delete();
                    }
                }

            } else{
                file.delete();
            }
        } else{
            file.delete();
        }
    }
}
