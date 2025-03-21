package app;

import java.util.ArrayList;
import java.util.Scanner;

import animal.Gato;
import animal.Mascota;
import animal.Perro;
import persona.Cliente;
import servicio.Servicio;

public class SistemaVeterinaria {
    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static ArrayList<Servicio> servicios = new ArrayList<Servicio>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        datosBase();
        Cliente clienteSeleccionado; //Se crea una variable para guardar el cliente seleccionado
        int documentoCli; //Se crea una variable para guardar el documento del cliente

        while (true) {
            System.out.println("Ingrese documento del cliente o ingrese 0 para salir: ");
            documentoCli = scanner.nextInt();
    
            if (documentoCli == 0) {
                System.out.println("Gracias por usar nuestros servicios");
                break;
            }
            clienteSeleccionado = buscarCliente(documentoCli); //Se guarda el cliente seleccionado en una variable

            if (clienteSeleccionado == null) {
                System.out.println("Cliente no encontrado");
            } else{
                for (int i = 0; i < clienteSeleccionado.getMascotas().size(); i++) { //for para buscar entre las mascotas que tiene el cliente en propia lista de mascotas
                    System.out.println(i +". " +  clienteSeleccionado.getMascotas().get(i).getNombre() + " - " + clienteSeleccionado.getMascotas().get(i).getEdad()); //Se imprime el nombre y la edad de la mascota, get(i) accede a  cada mascota de manera individual
                }
            }

            System.out.println("Seleccione la mascota: ");
            int idMascota = scanner.nextInt(); //Se guarda el id de la mascota seleccionada
            Mascota mascotaSeleccionada = clienteSeleccionado.getMascotas().get(idMascota); //Se guarda la mascota seleccionada en una variable

            if (mascotaSeleccionada instanceof Perro) { //Se valida si la mascota seleccionada es un perro
                Perro perro = (Perro) mascotaSeleccionada; //Se castea la mascota seleccionada a un perro
                if (perro.isGuarderia()) { //Se valida si el perro está en guardería
                    System.out.println("El perro ya está en la guardería, ¿desea sacarlo? 1. Si / 2. No");
                    int sacarPerro = scanner.nextInt(); //Se guarda la respuesta del usuario
                    if (sacarPerro == 1) {
                        perro.setGuarderia(false); //Se cambia el estado de guardería del perro
                        System.out.println("El perro ha sido sacado de la guardería");
                    }
                }
            }

            for (Servicio ser : servicios) { //Se recorren todos los servicicos de la mascota seleccionada
                if (mascotaSeleccionada.tieneServicio(ser.getIdServicio())) { //Se valida si la mascota puede recibir el servicio usando el metodo tieneServicio segun el id del servicio
                    System.out.println(ser.getIdServicio() + ". " + ser.getNombreServicio() + " - " + ser.getPrecioServicio()); //Se imprime el id, nombre y precio del servicio
                    
                }
            }
            
            System.out.println("Seleccione el servicio: ");
            int idServicio = scanner.nextInt(); //Se guarda el id del servicio seleccionado
            Servicio servicioSeleccionado = servicios.get(idServicio-1); //Va y busca en el array de servicios el servicio seleccionado y lo guarda segun su id - 1 debido a la posicion del arraylist

            double total = mascotaSeleccionada.calcularTotalServicios(servicioSeleccionado); //Se calcula el total de los servicios de la mascota seleccionada

            System.out.println("-----------------------------");
            System.out.println("Factura: ");
            System.out.println("Cliente: " +  clienteSeleccionado.getId() + " - "+ clienteSeleccionado.getNombre());
            System.out.println("Mascota: " + mascotaSeleccionada.getNombre() + " - " + mascotaSeleccionada.getEdad());
            System.out.println("Servicio: " + servicioSeleccionado.getNombreServicio());
            System.out.println("Total: " + total);
            System.out.println("-----------------------------");
        }

    }


    public static void datosBase(){
        servicios.add(new Servicio(1, "Baño", 20000));
        servicios.add(new Servicio(2, "Vacunación", 50000));    
        servicios.add(new Servicio(3, "Guardería", 100000));
        servicios.add(new Servicio(4, "Atención domiciliaria", 40000));

        Cliente cli1 = new Cliente(1234, "Juan", "Carrera 12 #50-12");
            cli1.setMascotas(new Perro("Max", 2));
            cli1.setMascotas(new Gato("Misu", 1));

        Cliente cli2 = new Cliente(4321, "Carlos", "Calle 21 #5 - 21");
            cli2.setMascotas(new Perro("Rocky", 4));
            cli2.setMascotas(new Gato("Félix", 2));  

        clientes.add(cli1);
        clientes.add(cli2);
    }

    public static Cliente buscarCliente(int documento){
        for (Cliente cliente : clientes) {
            if(cliente.getId() == documento){
                return cliente;
            }
        }
        return null;
    } 
}