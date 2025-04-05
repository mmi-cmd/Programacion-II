import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        File folder = new File("C:\\Users\\USUARIO\\Documents\\Prueba"); // Instanciar carpeta - Nombre
        try {
            folder.mkdirs();

            // Crear archivo
            File file = new File("C:\\Users\\USUARIO\\Documents\\temporal.txt"); // Instanciando archivo

            System.out.println(
                file.createNewFile() // Creando archivo
            );

            System.out.println("El archivo ya existe: " + file.exists());
            System.out.println("Es archivo: " + file.isFile());
            System.out.println("Es ejecutable: " + file.canExecute());
            System.out.println("Es leible: " + file.canRead());
            System.out.println("Se puede escribir: " + file.canWrite());

            FileWriter fileWriter = new FileWriter("C:\\Users\\USUARIO\\Documents\\temporal.txt");
            fileWriter.write("Esto es un mensaje de prueba \n ñeñeñeñeñeñeñeñeñeñeñ \n"); // Escribir dentro del archivo 
            fileWriter.write("Esto es otro mensaje \n");
            fileWriter.close();


        } catch (IOException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
