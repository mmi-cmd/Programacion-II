package club;

import eventos.Evento;
import personas.Empleado;
import personas.Miembro;

public class App {
    public static void main(String[] args) throws Exception {

        Empleado empleado = new Empleado("Juan", 30);
        Miembro miembro = new Miembro("Maria", 35);
        
       /*  Evento eventoUno = new Evento("20-02-25", miembro , empleado); //al ser atributos de tipo de una clase, se deben crear antes los objetos
        Evento eventoDos = new Evento("20-02-25", miembro , empleado); */

        Evento evento1 = crearEvento("2324", empleado, miembro);
        evento1.mostrarInfo();
        Evento evento2 = crearEvento("2324", empleado, miembro);
        Evento evento3 = crearEvento("2324", empleado, miembro);
        Evento evento4 = crearEvento("2324", empleado, miembro);
        

        System.out.println(empleado.getBono());
    }

    public static Evento crearEvento(String fecha, Empleado empleado, Miembro miembro){ //volverla static para llamarla sin crear objeto

        if (miembro.getLimite() <= 0) {
            System.out.println("No se puede crear evento");
            return new Evento();
            
        } else{
            System.out.println("Evento creado");
            return new Evento(fecha, miembro, empleado); //Funcion que crea eventos
        }
        
    }
}
