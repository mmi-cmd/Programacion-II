package concesionario;

import java.util.ArrayList;
import java.util.Scanner;

import vehiculos.Camion;
import vehiculos.Coche;
import vehiculos.Moto;
import vehiculos.Vehiculo;

public class Concesionario{

    static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            System.out.println("Bienvenido al concesionario");
        System.out.println("Selecciona una opción: ");
        System.out.println("1. Agregar vehículo");  
        System.out.println("2. Listar vehículos");
        System.out.println("3. Salir");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                agregarVehiculo();
                break;
            case 2:
                listarVehiculos();
                break;
            case 3:
                System.out.println("Hasta luego");
                return;
            default:
                System.out.println("Opción no válida");
                break;
        }

            System.out.println("Deaseas realizar otra acción? (1. si /2. No)");
            int continuar = scanner.nextInt();
            scanner.nextLine();
            if (continuar == 2) {
                System.out.println("Gracias por visitarnos");
                break;
            }
        }
    }

    public static void agregarVehiculo(){
        System.out.println("Ingresa la marca del vehículo");
        String marca = scanner.nextLine();
        
            System.out.println("Ingresa el modelo del vehiculo");
            String modelo = scanner.nextLine();
        
            System.out.println("Ingresa el año del vehiculo");
            int año = scanner.nextInt();
            scanner.nextLine();  
        
            System.out.println("Ingresa el tipo de vehiculo (1. Coche / 2. Moto / 3. Camion)");
            int tipo = scanner.nextInt();
            scanner.nextLine();  

        switch (tipo) {
            case 1:
                System.out.println("Ingresa el número de puertas: ");
                int numPuertas = scanner.nextInt();
                vehiculos.add(new Coche(marca, modelo, año, numPuertas));
                break;
            case 2:
                System.out.println("Ingresa el cilindraje: ");
                int cilindraje = scanner.nextInt();
                vehiculos.add(new Moto(marca, modelo, año, cilindraje));
                break;
            case 3:
                System.out.println("Ingresa la capacidad de carga: ");
                int capacidadCarga = scanner.nextInt();
                vehiculos.add(new Camion(marca, modelo, año, capacidadCarga));
                break;
            default:
                System.out.println("Tipo de vehiculo no válido");
                break;
        }
        System.out.println("Vehiculo agregado correctamente");
    }


    public static void listarVehiculos(){
        System.out.println("Listado de vehículos:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("------------------------------");
            vehiculo.mostrarInfo();
        }
    }
}