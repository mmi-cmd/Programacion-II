package estudiantes;

import servicios.Servicio;

public class Kinder extends Nino {
    private boolean isEating; //Solo recibe alimentacion si esta en la guarderia

    public Kinder(String nombre, int edad, int documento) {
        super(nombre, edad, documento);
        this.isEating = isEating;
    }

    public boolean isEating() {
        return isEating;
    }

    public void setEating(boolean isEating) {
        this.isEating = isEating;
    }

    @Override
    public boolean tieneServicio(int idServicio){
        return idServicio != 2 && !isEating;
    }
    
    @Override
    public double calcularCostos(Servicio servicio){
        if ("Alimentación especial".equals(servicio.getNombre())) {
            this.isEating = true;
            System.out.println("Ya está comiendo");
        }
        return servicio.getCosto();
    }
}
