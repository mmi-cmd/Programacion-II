package servicios;

public class Servicio {
    
    private int id;
    private String nombreServicio;
    private double costo;

    
    public Servicio(int id, String nombreServicio, double costo) {
        this.id = id;
        this.nombreServicio = nombreServicio;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombreServicio() {
        return nombreServicio;
    }
    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }

}
