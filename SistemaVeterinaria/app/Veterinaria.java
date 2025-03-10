package app;
import java.util.ArrayList;
import java.util.Scanner;

import cliente.Cliente;
import mascotas.Gato;
import mascotas.Mascota;
import mascotas.Perro;
import servicios.Servicio;

public class Veterinaria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Mascota> mascotas = new ArrayList<>();

        Cliente clienteActual = null;  // Variable que guarda al Cliente seleccionado
        Mascota mascotaSeleccionada = null; // Variable que guarda la mascota seleccionada
        int servicioSeleccionado = 0; // Variable que guarda el servicio seleccionado
        Servicio nuevoServicio = null; // Variable "temporal" que guarda el servicio seleccionado hasta añadirse a la mascota

        while (true) { 
            System.out.println("¡Bienvenido a la veterinaria!");
            System.out.println("Seleccione la opción que desea realizar para obtener nuestros servicios");
            System.out.println("1. Registrar o ingresar documento del cliente");
            System.out.println("2. Registrar o seleccionar mascota");
            System.out.println("3. Servicios disponibles");
            System.out.println("4. Seleccionar servicio");
            System.out.println("5. Generar factura");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el documento del cliente");
                    int documento = scanner.nextInt();

                    Cliente clienteEncontrado = null; // Variable que guarda al Cliente encontrado
                    for (Cliente cliente : clientes) { // Recorremos la lista de clientes
                        if (cliente.getId() == documento) {
                            clienteEncontrado = cliente; // Si encontramos un cliente con el documento ingresado, lo guardamos
                            break;
                        }
                    }

                    if (clienteEncontrado != null) { // Si encontramos un cliente con el documento ingresado
                        ArrayList<Mascota> mascotasCliente = clienteEncontrado.getMascotas();
                        if (mascotasCliente == null || mascotasCliente.isEmpty()) {
                            System.out.println("El cliente encontrado pero no tiene mascotas registradas.");
                        } else {
                            System.out.println("Las mascotas del cliente " + clienteEncontrado.getNombre() + " son:");
                            for (Mascota mascota : mascotasCliente) { // Recorremos la lista de mascotas del cliente y las mostramos
                                System.out.println(mascota.getNombre());
                            }
                        }
                    } else {
                        System.out.println("Ingrese el nombre del cliente"); // Si no encontramos un cliente con el documento ingresado, solicitamos los datos para registrar uno nuevo
                        String nombre = scanner.next();
                        System.out.println("Ingrese la dirección del cliente");
                        String direccion = scanner.next();

                        Cliente nuevoCliente = new Cliente(documento, nombre, direccion);
                        clientes.add(nuevoCliente);
                        clienteActual = nuevoCliente; 
                        System.out.println("Cliente registrado con éxito.");
                    }
                    break;

                case 2:
                    if (clienteActual == null) { // Si no hay un cliente seleccionado, mostramos un mensaje de error
                        System.out.println("Debe registrar o seleccionar un cliente primero.");
                        break;
                    }

                    
                    System.out.println("Ingrese el nombre de la mascota");
                    String nombreMascota = scanner.next();
                    
                    Mascota mascotaEncontrada = null;
                    for (Mascota mascota : mascotas) {
                        if (mascota.getNombre().equalsIgnoreCase(nombreMascota)) { // Buscamos si la mascota ya está registrada
                            mascotaEncontrada = mascota; // Si la encontramos, la guardamos
                            break;
                        }
                    }
                    
                    if (mascotaEncontrada != null) {
                        System.out.println("La mascota ya está registrada.");
                        System.out.println("¿Desea seleccionarla? (1: Sí, 2: No)"); // Si la mascota ya está registrada, preguntamos si se desea seleccionar
                        
                        int seleccion = scanner.nextInt();
                        if (seleccion == 1) {
                            mascotaSeleccionada = mascotaEncontrada; // Si se selecciona, guardamos la mascota seleccionada
                            System.out.println("Mascota seleccionada: " + mascotaSeleccionada.getNombre());
                        } else {
                            System.out.println("No se seleccionó ninguna mascota.");
                        }
                    
                    } else {
                        System.out.println("Ingrese la edad de la mascota");
                        int edadMascota = scanner.nextInt();

                        System.out.println("¿Es un perro o un gato? (1: Perro, 2: Gato)"); // Si la mascota no está registrada, solicitamos los datos para registrarla dependiendo del tipo
                        int tipoMascota = scanner.nextInt();

                        Mascota nuevaMascota;
                        if (tipoMascota == 1) {
                            nuevaMascota = new Perro(nombreMascota, edadMascota, false); // Se crea como Perro
                        } else {
                            nuevaMascota = new Gato(nombreMascota, edadMascota, 0); // Se crea como Gato
                        }

                        mascotas.add(nuevaMascota);
                        clienteActual.setMascotas(nuevaMascota);
                        System.out.println("Mascota registrada con éxito para el cliente " + clienteActual.getNombre());

                        mascotaSeleccionada = nuevaMascota;
                        }
                    break;

                    case 3:
                        if (mascotaSeleccionada == null) {
                            System.out.println("Debe registrar o seleccionar una mascota primero.");
                            break;
                        }
                    
                        System.out.println("Selecciona un servicio disponible para " + mascotaSeleccionada.getNombre() + ":");
                    
                        if (mascotaSeleccionada instanceof Perro) {
                            System.out.println("1. Guardería");
                            System.out.println("2. Baño");
                            System.out.println("3. Vacunación");
                        } else if (mascotaSeleccionada instanceof Gato) {
                            System.out.println("1. Atención domiciliaria"); 
                            System.out.println("2. Baño");
                            System.out.println("3. Vacunación");
                        } else {
                            System.out.println("No hay servicios disponibles para este tipo de mascota.");
                            break;
                        }
                        
                        servicioSeleccionado = scanner.nextInt();
                        break;
                    
                    case 4:
                        if (mascotaSeleccionada == null) {
                            System.out.println("Debe seleccionar una mascota primero.");
                            break;
                        }
                    
                        switch (servicioSeleccionado) {
                            case 1:
                                if (mascotaSeleccionada instanceof Perro) {
                                    Perro perro = (Perro) mascotaSeleccionada;
                                    if (perro.isGuarderia()) { // Verifica si ya está en la guardería
                                        System.out.println("El perro ya está en la guardería y no puede volver a inscribirse.");
                                        break;
                                    }
                                    nuevoServicio = new Servicio(1, "Guardería", 100000);
                                    perro.setGuarderia(true); // Marcar que está en la guardería
                                } else if (mascotaSeleccionada instanceof Gato) {
                                    Gato gato = (Gato) mascotaSeleccionada;
                                    int cantidadServicios = gato.getCantidadServicios() + 1;
                                    gato.setCantidadServicios(cantidadServicios);
                    
                                    if (cantidadServicios % 3 == 0) { // Cada 3er servicio es gratis
                                        nuevoServicio = new Servicio(1, "Atención domiciliaria", 0);
                                        System.out.println("¡Felicidades! Esta atención domiciliaria es gratuita.");
                                    } else {
                                        nuevoServicio = new Servicio(1, "Atención domiciliaria", 40000);
                                    }
                                }
                                break;
                    
                            case 2:
                                nuevoServicio = new Servicio(2, "Baño", 20000);
                                break;
                    
                            case 3:
                                nuevoServicio = new Servicio(3, "Vacunación", 50000);
                                break;
                    
                            default:
                                System.out.println("Opción inválida. Intente de nuevo.");
                                break;
                        }
                    
                        if (nuevoServicio != null) {
                            mascotaSeleccionada.setServiciosRecibidos(nuevoServicio); // Agregar servicio a la mascota
                            System.out.println("El servicio '" + nuevoServicio.getNombreServicio() + "' ha sido agregado a " + mascotaSeleccionada.getNombre());
                        }
                    
                        break;
                    
                case 5:
                    double totalPagar = 0;

                    System.out.println("---------Factura de servicios---------");
                    System.out.println("Cliente: " +  clienteActual.getId() + " - " + clienteActual.getNombre());
                    System.out.println("Mascota: " + mascotaSeleccionada.getNombre() + " - edad: " + mascotaSeleccionada.getEdad());
                    
                    for (Servicio servicio : mascotaSeleccionada.getServiciosRecibidos()) {
                        System.out.println(servicio.getNombreServicio() + ": $" + servicio.getCosto());
                        totalPagar += servicio.getCosto();
                        
                    }
                    System.out.println("Total a pagar: $" + totalPagar);
                    System.out.println("--------------------------------------");

                    break;

                case 6:
                    System.out.println("Saliendo...");
                    scanner.close(); 
                    return;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }


            System.out.println("¿Desea realizar otra operación? (1: Sí, 2: No)");
            scanner.nextLine();
            int continuar = scanner.nextInt();
            if (continuar != 1) {
                System.out.println("Saliendo del sistema...");
                scanner.close();
                return; 
            }
        
        }
    }
}
