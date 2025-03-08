package mascotas;

import java.util.ArrayList;

import servicios.Servicio;

public class Perro extends Mascota {
    private boolean isGuarderia = false;

    public Perro(String nombre, int edad, boolean isGuarderia) {
        super(nombre, edad);
        this.isGuarderia = isGuarderia;
    }

    public boolean isGuarderia() {
        return isGuarderia;
    }

    public void setGuarderia(boolean isGuarderia) {
        this.isGuarderia = isGuarderia;
    }
    
}
