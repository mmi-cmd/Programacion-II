package estudiantes;

import java.util.ArrayList;

import servicios.Servicio;


public class Nino{
    private ArrayList<Servicio> servicios;
    private String nombre;
    private int edad;
    private int documento;
    
    public Nino(String nombre, int edad, int documento) {
        this.servicios = new ArrayList<Servicio>();
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(Servicio servicio) {
        this.servicios.add(servicio);
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
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

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public boolean tieneServicio(int idServicio){
        return true;
    }

    public double calcularCostos(Servicio servicio){
        return 0.0;
    }

}
