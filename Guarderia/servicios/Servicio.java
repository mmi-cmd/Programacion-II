package servicios;

public class Servicio {
    private int idServicio;
    private String nombre;
    private double costo;

    
    public Servicio(int idServicio, String nombre, double costo) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.costo = costo;
    }


    public int getIdServicio() {
        return idServicio;
    }


    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getCosto() {
        return costo;
    }


    public void setCosto(double costo) {
        this.costo = costo;
    }

    
}
