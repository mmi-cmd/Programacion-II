package personas;

import club.Persona;

public class Empleado extends Persona {

    private double bono = 0;

    public Empleado(String nombre, int edad) {
        super(nombre, edad);
    }

    public void addBono(){
        this.bono += 20000;
    }

    public double getBono(){
        return this.bono;
    }
    
}
