package estudiantes;

import servicios.Servicio;

public class Primario extends Nino {
    private int cantidadArt;

    public Primario(String nombre, int edad, int documento) {
        super(nombre, edad, documento);
        this.cantidadArt = cantidadArt;
    }

    public int getCantidadArt() {
        return cantidadArt;
    }

    public void setCantidadArt(int cantidadArt) {
        this.cantidadArt = cantidadArt;
    }

    @Override
    public boolean tieneServicio(int idServicio){
        return idServicio != 1;
    }

    @Override
    public double calcularCostos(Servicio servicio){

        if ("Taller artístico".equals(servicio.getNombre())) {
            cantidadArt++;
            if (cantidadArt % 3 == 0) {
                return 0.0;
            }
        }
        return servicio.getCosto();
    }
    
}
