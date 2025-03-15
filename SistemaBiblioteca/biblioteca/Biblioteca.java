package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

import libro.Libro;

public class Biblioteca{

    static Scanner scanner = new Scanner(System.in);
    static ArrayList <Libro> libros = new ArrayList<>();
            public static void main(String[] args) {
                
                libros.add(agregarLibro());

                buscarLibro();

                mostrarLibros();
            
        }
    
        public static Libro agregarLibro(){
    
            System.out.println("Ingresa el nombre del libro");
            
            String nombre = scanner.nextLine();

            System.out.println("Ingresa el autor del libro");

            String autor = scanner.nextLine();

            System.out.println("Ingresa el año del libro");
            int año = scanner.nextInt();

            Libro libro = new Libro(nombre, autor, año);

        return libro;
    }

    public static void buscarLibro(){

        System.out.println("Ingresa el titulo del libro");
        scanner.next();
        String nombrelibro = scanner.nextLine();

        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equalsIgnoreCase(nombrelibro)) {
                System.out.println("Libro encontrado");
            } else{
                System.out.println("Libro no encontrado");
            } 
            }
        }

        /* for (Libro li : libros) {
            if (li.getTitulo().equalsIgnoreCase(nombrelibro)) {
                System.out.println("Libro encontrado");
            } else{
                System.out.println("Libro no encontrado");
            }
        } */
    

    public static void mostrarLibros(){
        System.out.println("--------------------------");
        System.out.println("Libros de la biblioteca: ");
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }
        System.out.println("--------------------------");
    }
}