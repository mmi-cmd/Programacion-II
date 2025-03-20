package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

import libro.Libro;
import libro.LibroTexto;
import libro.Novela;
import libro.Revista;

public class Biblioteca{

    static Scanner scanner = new Scanner(System.in);
    static ArrayList <Libro> libros = new ArrayList<>();
            public static void main(String[] args) {

                while (true) {
                    
                    System.out.println("Seleccione una opción:");
                    System.out.println("1. Agregar libro");
                    System.out.println("2. Buscar libro");
                    System.out.println("3. Mostrar libros");
                    System.out.println("4. Salir");

                    int opcion = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcion) {
                        case 1:
                            agregarLibro();
                            break;
                        case 2:
                            buscarLibro();
                            break;
                        case 3:
                            mostrarLibros();
                            break;
                        case 4:
                            System.out.println("Saliendo del programa...");
                            return;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }

                    System.out.println("Desea realizar otra operación? (1. Si / 2. No)");
                    int continuar = scanner.nextInt();
                    scanner.nextLine();

                    if (continuar == 2) { 
                    System.out.println("Gracias por usar la biblioteca. ¡Hasta luego!");
                    break;
                    }
                }
        }
    

        public static void agregarLibro() {
            System.out.println("Ingresa el nombre del libro");
            String nombre = scanner.nextLine();
        
            System.out.println("Ingresa el autor del libro");
            String autor = scanner.nextLine();
        
            System.out.println("Ingresa el año del libro");
            int año = scanner.nextInt();
            scanner.nextLine();  
        
            System.out.println("Ingresa el tipo de libro (1. LibroTexto / 2. Novela / 3. Revista)");
            int tipo = scanner.nextInt();
            scanner.nextLine();  

        switch (tipo) {
            case 1:
                libros.add(new LibroTexto(nombre, autor, año, "LibroTexto"));
                break;
            case 2:
                libros.add(new Novela(nombre, autor, año, "Novela"));
                break;
            case 3:
                libros.add(new Revista(nombre, autor, año, "Revista"));
                break;
            default:
                System.out.println("Tipo de libro no válido");
                break;
        }
        System.out.println("Libro agregado correctamente");
}



    public static void buscarLibro(){

        boolean encontrado = false;
        System.out.println("Ingresa el titulo del libro para buscarlo:");
        String nombrelibro = scanner.nextLine();

        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equalsIgnoreCase(nombrelibro)) {
                System.out.println("Libro encontrado");
                encontrado = true;
                break;
                } 
            }
            if (!encontrado) {
                System.out.println("Libro no encontrado");
            }
        }

    public static void mostrarLibros(){
        System.out.println("--------------------------");
        System.out.println("Libros de la biblioteca: ");
        for (Libro libro : libros) {
            System.out.println("Libro: " + libro.getTitulo() + " - Autor: " + libro.getAutor() + " - Año: " + libro.getAñoPublicacion());
        }
        System.out.println("--------------------------");
    }
}