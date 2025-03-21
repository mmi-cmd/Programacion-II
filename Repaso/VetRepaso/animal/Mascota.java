package animal;

import java.util.ArrayList;
import servicio.Servicio;

public class Mascota {
    protected String nombre;
    protected int edad;
    protected ArrayList<Servicio> servicios;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.servicios = new ArrayList<Servicio>();
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

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(Servicio servicio) { //Se modifica el set para que reciba un solo objeto de tipo Servicio y no un arrayList completo
        this.servicios.add(servicio); //Se agrega el objeto a la lista de servicios de la mascota
    } //Con este metodo se agrega uno a uno los servicios de la mascota

    public boolean tieneServicio(int idServicio) {
        return true;
    }

    public double calcularTotalServicios(Servicio servicio) {
        return 0.0;
    }
    
}
