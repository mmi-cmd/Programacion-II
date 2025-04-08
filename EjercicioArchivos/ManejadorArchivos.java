import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class ManejadorArchivos{
    public static void main(String[] args) {
        


        try {
            File folder = new File("192354");
            folder.mkdir();

            File file1 = new File("192354//loremIpsum.txt");

            System.out.println(
                file1.createNewFile() 
            );

            BufferedWriter bw = new BufferedWriter(new FileWriter("192354//loremIpsum.txt", true));

            bw.write("Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto " );
            bw.newLine();
            bw.write("Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. ");
            bw.newLine();
            bw.write("No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original." );
            bw.newLine();
            bw.write("No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original." );
            bw.newLine();
            bw.write("Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum. ");
            bw.newLine();

            bw.close();


            BufferedReader br = new BufferedReader(new FileReader("192354//loremIpsum.txt"));
            String line;
            int contadorLineas = 0;
            while ((line=br.readLine()) != null) {
                System.out.println(line);
                contadorLineas++;
            }

            long fechaLong = file1.lastModified();
            Date fecha = new Date(fechaLong);


            File file2 = new File("192354//log.txt");
            file2.createNewFile();

            FileWriter fw = new FileWriter("192354//log.txt",true);
            fw.append("\n " + fecha + "\n Cantidad de lineas: " + contadorLineas);
            fw.close();
        
        
        } catch (Exception e) {
            e.printStackTrace();
        }


        



    }
}