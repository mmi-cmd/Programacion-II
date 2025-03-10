package mascotas;

public class Gato extends Mascota {

    private int cantidadServicios;

    public Gato(String nombre, int edad, int cantidadServicios) {
        super(nombre, edad);
        this.cantidadServicios = 0;
    }

    public int getCantidadServicios() {
        return cantidadServicios;
    }

    public void setCantidadServicios(int cantidadServicios) {
        this.cantidadServicios--;
    }
    
}
