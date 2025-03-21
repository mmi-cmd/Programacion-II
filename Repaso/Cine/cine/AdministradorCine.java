package cine;

import java.util.Scanner;

import salas.Sala;

public  class AdministradorCine {
    static  Scanner scanner  = new Scanner(System.in);
    static Sala sala1 = new Sala("Sala Verano", "Avengers", "Titanic", "Palomitas", 4, 5);
    static Sala sala2 = new Sala("Sala Invierno", "Matrix", "Inception", "Palomitas", 3, 3);
    public static void main(String[] args) {

        while (true) {
            System.out.println("Seleccione opción: ");
            System.out.println("1. Comprar entrada");
            System.out.println("2. Mostrar informe");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    seleccionarPelicula();
                    break;
                
                case 2:
                    sala1.mostrarInforme();
                    sala2.mostrarInforme();
                    break;

                case 3:
                    System.out.println("Gracias por usar nuestros servicios");
                    
                    return;
            
                default:
                System.out.println("Opción inválida");
                    break;
            }
        }
    }

    static void seleccionarPelicula(){
        System.out.println("Seleccione la sala: 1. Verano / 2. Invierno");
                    int selectSala = scanner.nextInt();

                    Sala salaSeleccionada = (selectSala == 1) ? sala1 : sala2;

                    System.out.println("Seleccione horario de película " + "1. Diurno " + salaSeleccionada.getPeliculaDiurna() + " / 2. Nocturno " + salaSeleccionada.getPeliculaNocturna());
                    int horario = scanner.nextInt()-1;
                    System.out.println((horario == 0) ? "Seleccionó la película: " + salaSeleccionada.getPeliculaDiurna() : "Seleccionó la película: " + salaSeleccionada.getPeliculaNocturna());

                    salaSeleccionada.mostrarAsiestos(horario);

                    System.out.println("Ingrese la fila y columna del asiento que desea:");
                    int fila = scanner.nextInt()-1;
                    int columna = scanner.nextInt()-1;

                    if (salaSeleccionada.reservarAsientos(horario, fila, columna)) {
                        System.out.println("Reserva exitosa. Tienes un beneficio de: " + salaSeleccionada.getBeneficio());
                    } else{
                        System.out.println("Asiento no disponible");
                    }
    }
}