package mascotas;

import java.util.ArrayList;

import servicios.Servicio;

public class Gato extends Mascota {

    private int cantidadServicios = 0;

    public Gato(String nombre, int edad, int cantidadServicios) {
        super(nombre, edad);
        this.cantidadServicios = cantidadServicios;
    }

    public int getCantidadServicios() {
        return cantidadServicios;
    }

    public void setCantidadServicios(int cantidadServicios) {
        this.cantidadServicios = cantidadServicios;
    }

   

    
}
