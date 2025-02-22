package eventos;

import personas.Empleado;
import personas.Miembro;

public class Evento {
    private String fecha;
    private Miembro solicitante;
    private Empleado organizador;


    public Evento(String fecha, Miembro solicitante, Empleado organizador) {
        organizador.addBono(); //Le añade un bono a cada empleado por crear evento, desde el mismo constructor
        solicitante.restarLimite();
        this.fecha = fecha;
        this.solicitante = solicitante;
        this.organizador = organizador;
    }


    public Evento() {
    }

    public void mostrarInfo(){
        System.out.println("-----------Datos del evento-------------");
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Solicitante: " + this.solicitante.getNombre()); //dado que son objetos se hace con get
        System.out.println("Empleado: " + this.organizador.getNombre());
    }
    
}
