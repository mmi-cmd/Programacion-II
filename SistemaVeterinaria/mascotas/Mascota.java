package mascotas;

import java.util.ArrayList;

import servicios.Servicio;

public class Mascota {
    protected String nombre;
    protected int edad;
    protected ArrayList<Servicio> serviciosRecibidos;
    
    
    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Servicio> getServiciosRecibidos() {
        return serviciosRecibidos;
    }

    public void setServiciosRecibidos(Servicio serviciosRecibidos) { //cada vez que se acceda a un servicio, se añade a la lista
        if (this.serviciosRecibidos == null) { // Inicializa la lista solo cuando se usa
            this.serviciosRecibidos = new ArrayList<>();
        }
        this.serviciosRecibidos.add(serviciosRecibidos);
    }

}
