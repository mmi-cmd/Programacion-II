package mascotas;

public class Perro extends Mascota {
    private boolean isGuarderia;

    public Perro(String nombre, int edad, boolean isGuarderia) {
        super(nombre, edad);
        this.isGuarderia = false;
    }

    public boolean isGuarderia() {
        return isGuarderia;
    }

    public void setGuarderia(boolean isGuarderia) {
        this.isGuarderia = isGuarderia;
    }
    
}
