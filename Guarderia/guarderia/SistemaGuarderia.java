package guarderia;

import java.util.ArrayList;
import java.util.Scanner;

import acudiente.Acudiente;
import estudiantes.Kinder;
import estudiantes.Nino;
import estudiantes.Primario;
import servicios.Servicio;

public class SistemaGuarderia {

    static ArrayList<Acudiente> acudientes = new ArrayList<Acudiente>();
    static ArrayList<Servicio> servicios = new ArrayList<Servicio>();
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        datosBase();

        while (true) {
            System.out.println("Ingrese documento para buscar acudiente o 0 para salir: ");
        int documento = scanner.nextInt();

        if (documento==0) {
            System.out.println("Gracias por usar la guarderia");
            break;
        }
        Acudiente acudienteSeleccionado = buscarAcudiente(documento);

        if (acudienteSeleccionado == null) {
            System.out.println("Acudiente no encontrado");
            continue;
        } else{
            System.out.println("Seleccione hijo a cargo: ");
            for (int i = 0; i < acudienteSeleccionado.getNinos().size(); i++) {
                System.out.println(i + ". " + acudienteSeleccionado.getNinos().get(i).getNombre());
            }
        }
        int numHijo = scanner.nextInt();

        Nino ninoSeleccionado = acudienteSeleccionado.getNinos().get(numHijo); //Entro a acudiente seleccionado, sigo a sus hijos y selcciono solo 1

        if (ninoSeleccionado instanceof Kinder) {
            Kinder nino = (Kinder) ninoSeleccionado;
            if (nino.isEating()) {
                System.out.println("Ya está comiendo, ¿Desea otro servicio? 1.Si / 2. No");
                int otroAlumerzo = scanner.nextInt();
                if (otroAlumerzo == 1) {
                    nino.setEating(false);
                    System.out.println("Puede adquirir otro servicio");
                }
            }
        }

        System.out.println("Seleccione servicio que desea: ");
        for (Servicio servicio : servicios) {
            if (ninoSeleccionado.tieneServicio(servicio.getIdServicio())) { //se le pasa al método el id del servcicio
                System.out.println(servicio.getIdServicio() + ". " + servicio.getNombre() + ". " + servicio.getCosto());
            }
        }
        int idServicio = scanner.nextInt() - 1;

        Servicio servicioSeleccionado = servicios.get(idServicio); 

        double costo = ninoSeleccionado.calcularCostos(servicioSeleccionado);

        System.out.println("--------------Factura--------------");
        System.out.println("Acudiente: " + acudienteSeleccionado.getNombre());
        System.out.println("Estudiante: " + ninoSeleccionado.getNombre());
        System.out.println("Servicio: " + servicioSeleccionado.getNombre());
        System.out.println("Costo: " + costo);
        System.out.println("----------------------------");

        }


    }

    public static void datosBase(){
        servicios.add(new Servicio(1, "Alimentación especial", 15000));
        servicios.add(new Servicio(2, "Taller artístico", 25000));
        servicios.add(new Servicio(3, "Visita médica", 30000));

        Acudiente acud1 = new Acudiente("Laura Gómez", 30, 1111);
            acud1.setNinos(new Kinder("Sofia Gómez", 2, 2222));
            acud1.setNinos(new Primario("Tomas Gómez", 8, 3333));

        Acudiente acud2 = new Acudiente("Andrés Ramirez", 30, 1234);
            acud2.setNinos(new Kinder("Valentina Ramirez", 3, 4321));
            acud2.setNinos(new Primario("Samuel Ramirez", 9, 4567));

        acudientes.add(acud1);
        acudientes.add(acud2);
    }

    public static Acudiente buscarAcudiente(int documento){
        for (Acudiente acudiente : acudientes) {
            if (acudiente.getDocumento() == documento) {
                return acudiente;
            }
        }
        return null;
    }
}
