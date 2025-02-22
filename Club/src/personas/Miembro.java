package personas;

import club.Persona;

public class Miembro extends Persona{

    private int limite = 3;

    public Miembro(String nombre, int edad) {
        super(nombre, edad);
        
    }

    public int getLimite() {
        return limite;
    }

    public void restarLimite(){
        this.limite--;
    }
}
